package com.jlcindia.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class JdbcAccountDAO implements AccountDAO {

	@Autowired
	JdbcTemplate jtemp;

	@Autowired
	PlatformTransactionManager txManager;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
	public void deposit(int accno, double amt) {
		String sql1 = "select bal from accounts where accno=?";
		double cbal = jtemp.queryForObject(sql1, Double.class, accno);
		cbal = cbal + amt;
		String sql2 = "update accounts set bal=? where accno=?";
		jtemp.update(sql2, cbal, accno);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
	public void withdraw(int accno, double amt) {
		String sql1 = "select bal from accounts where accno=?";
		double cbal = jtemp.queryForObject(sql1, Double.class, accno);
		if (cbal >= 10000 + amt) {
			cbal = cbal - amt;
			String sql2 = "update accounts set bal=? where accno=?";
			jtemp.update(sql2, cbal, accno);
		} else {
			throw new InSufficientFundsException();
		}
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
	public void fundsTransfer(int saccno, int daccno, double amt) {
		deposit(daccno, amt);
		withdraw(saccno, amt);
	}

	@Override
	public double getBalance(int accno) {
		String sql = "select bal from accounts where accno=?";
		double cbal = jtemp.queryForObject(sql, Double.class, accno);
		return cbal;
	}

}
