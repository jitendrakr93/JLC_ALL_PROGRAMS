package com.jlcindia.spring.hibernate;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class HibernateAccountDAO extends HibernateDaoSupport implements AccountDAO{
	
	
	
	@Override
	public void deposit(int accno, double amt) {
		Account acc=getHibernateTemplate().load(Account.class, accno);
		double cbal=acc.getBal();
		acc.setBal(cbal+amt);
		getHibernateTemplate().update(acc);
	}

	@Override
	public void withdraw(int accno, double amt) {
		Account acc=getHibernateTemplate().load(Account.class, accno);
		double cbal=acc.getBal();
		if(cbal>=10000+amt){
			acc.setBal(cbal-amt);
			getHibernateTemplate().update(acc);
		}else{
			throw new InSufficientFundsException();
		}
		
	}

	@Override
	public void fundsTransfer(int saccno, int daccno, double amt) {
		deposit(daccno, amt);
		withdraw(saccno, amt);
	}

	@Override
	public double getBalance(int accno) {
		Account acc=getHibernateTemplate().load(Account.class, accno);
		return acc.getBal();
	}
	
}
