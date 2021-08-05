package com.jlcindia.spring.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class HibernateCustomerDAO implements CustomerDAO{

	@Autowired
	HibernateTemplate hibernateTemp;
	@Override
	public List<CustomerTO> getAllCustomers() {
		List<CustomerTO> ctoList=new ArrayList<CustomerTO>();
		String hql="from Customer c";
		List<Customer> list=(List<Customer>) hibernateTemp.find(hql);
		for(Customer c: list){
			CustomerTO cto=new CustomerTO(c.getCid(), c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}

	@Override
	public CustomerTO getCustomerByEmail(String email) {
		List<CustomerTO> ctoList=new ArrayList<CustomerTO>();
		String hql="from Customer c where c.email=:email";
		List<Customer> list=(List<Customer>) hibernateTemp.findByNamedParam(hql, "email", email);
		Customer c=(Customer)list.get(0);
		CustomerTO cto=new CustomerTO(c.getCid(), c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
		return cto;
	}

	@Override
	public List<CustomerTO> getCustomersByCity(String city) {
		List<CustomerTO> ctoList=new ArrayList<CustomerTO>();
		String hql="from Customer c where c.city=:city";
		List<Customer> list=(List<Customer>) hibernateTemp.findByNamedParam(hql, "city", city);
		for(Customer c:list){
			CustomerTO cto=new CustomerTO(c.getCid(), c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
			ctoList.add(cto);
		}
		
		return ctoList;
	}

	@Override
	public int getCustomersCount() {
		String hql="from Customer c";
		List<Customer> list=(List<Customer>) hibernateTemp.find(hql);
		return list.size();
	}

	@Override
	public String getCustomerCityByEmail(String email) {
		String hql="from Customer c where c.email=?";
		List<Customer> list=(List<Customer>) hibernateTemp.find(hql, email);
		Customer c=list.get(0);
		return c.getCity();
	}

	@Override
	public long getCustomerPhoneByEmail(String email) {
		String hql="from Customer c where c.email=:email";
		List<Customer> list=(List<Customer>) hibernateTemp.findByNamedParam(hql, "email",email);
		Customer c=list.get(0);
		return c.getPhone();
	}
	
}
