package com.jlcindia.spring.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class HibernateAccountDAO implements AccountDAO{

	@Autowired
	HibernateTemplate htemp;

	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void deposit(int accno, double amt) {
		Account acc=htemp.load(Account.class, accno);
		double cbal=acc.getBal();
		acc.setBal(cbal+amt);
		htemp.update(acc);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void withdraw(int accno, double amt) {
		Account acc=htemp.load(Account.class, accno);
		double cbal=acc.getBal();
		if(cbal>=1000+amt){
			acc.setBal(cbal-amt);
			htemp.update(acc);
		}else{
			throw new InSufficientFundsException();
		}
		
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW,isolation=Isolation.REPEATABLE_READ,readOnly=false)
	public void fundsTransfer(int saccno, int daccno, double amt) {
		deposit(daccno, amt);
		withdraw(saccno, amt);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW,isolation=Isolation.REPEATABLE_READ,readOnly=true)
	public double getBalance(int accno) {
		Account acc=htemp.load(Account.class, accno);
		return acc.getBal();
	}




}
