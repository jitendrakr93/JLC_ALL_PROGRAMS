package com.jlcindia.spring.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.LockMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class HibernateCustomerDAO implements CustomerDAO{

	@Autowired
	HibernateTemplate hibernateTemp;
	@Autowired
	HibernateTransactionManager txManager;
	@Override
	public void addCustomer(CustomerTO cto) {
		Customer cust=new Customer(cto.getCname(), cto.getEmail(), cto.getPhone(), cto.getCity());
		TransactionDefinition txDef=new DefaultTransactionDefinition();
		TransactionStatus ts=txManager.getTransaction(txDef);
		hibernateTemp.save(cust);
		txManager.commit(ts);
		
	}

	@Override
	public void updateCustomer(CustomerTO cto) {
		TransactionDefinition txDef=new DefaultTransactionDefinition();
		TransactionStatus ts=txManager.getTransaction(txDef);
		Customer c=(Customer)hibernateTemp.load(Customer.class,cto.getCid());
		c.setCid(cto.getCid());
		c.setCname(cto.getCname());
		c.setEmail(cto.getEmail());
		c.setPhone(cto.getPhone());
		c.setCity(cto.getCity());
		hibernateTemp.update(c, LockMode.NONE);
		txManager.commit(ts);
	}

	@Override
	public void deleteCustomer(int cid) {
	TransactionDefinition txDef=new DefaultTransactionDefinition();
	TransactionStatus ts=txManager.getTransaction(txDef);
	Customer c=(Customer)hibernateTemp.load(Customer.class,cid);
	hibernateTemp.delete(c, LockMode.NONE);
	txManager.commit(ts);
	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		Customer c=(Customer)hibernateTemp.load(Customer.class, cid);
		CustomerTO cto=new CustomerTO(c.getCid(), c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
		return cto;
	}

	public List<CustomerTO> getAllCustomers(){
		List<CustomerTO> ctoList=new ArrayList<CustomerTO>();
		String hql="from Customer c";
		List<Customer> list=(List<Customer>) hibernateTemp.find(hql);
		for(Customer c : list){
			CustomerTO cto=new CustomerTO(c.getCid(), c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}
}
