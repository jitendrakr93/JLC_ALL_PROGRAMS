package com.jlcindia.spring.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class HibernateAccountDAO implements AccountDAO{

	@Autowired
	HibernateTemplate htemp;
	
	@Autowired
	PlatformTransactionManager txManager;
	@Override
	public void deposit(int accno, double amt) {
		TransactionStatus ts=null;
		try{
			TransactionDefinition txDef=new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRED);
			ts=txManager.getTransaction(txDef);
			Account acc=htemp.load(Account.class, accno);
			double cbal=acc.getBal();
			acc.setBal(cbal+amt);
			htemp.update(acc);
			txManager.commit(ts);
		}catch(Exception e){
			e.printStackTrace();
			txManager.rollback(ts);
		}
		
	}

	@Override
	public void withdraw(int accno, double amt) {
		TransactionStatus ts=null;
		try{
			TransactionDefinition txDef=new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRED);
			ts=txManager.getTransaction(txDef);
				
			Account acc=htemp.load(Account.class, accno);
			double cbal=acc.getBal();
			if(cbal>=10000+amt){
				acc.setBal(cbal-amt);
				htemp.update(acc);
			}else{
				throw new InSufficientFundsException();
			}
			txManager.commit(ts);
		}catch(Exception e){
			e.printStackTrace();
			txManager.rollback(ts);
		}
		
	}

	@Override
	public void fundsTransfer(int saccno, int daccno, double amt) {
		TransactionStatus ts=null;
		try{
			TransactionDefinition txDef=new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
			ts=txManager.getTransaction(txDef);
			deposit(daccno, amt);
			withdraw(saccno, amt);
			txManager.commit(ts);
		}catch(Exception e){
			e.printStackTrace();
			txManager.rollback(ts);
		}
		
	}

	@Override
	public double getBalance(int accno) {
		Account acc=htemp.load(Account.class, accno);
		return acc.getBal();
	}

}
