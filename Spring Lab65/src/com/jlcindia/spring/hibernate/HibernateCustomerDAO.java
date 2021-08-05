package com.jlcindia.spring.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class HibernateCustomerDAO implements CustomerDAO{

	@Autowired
	HibernateTemplate hibernateTemp;

	@Override
	public List<CustomerTO> getAllCustomers() {
		List<CustomerTO> ctoList=new ArrayList<CustomerTO>();
		DetachedCriteria dc=DetachedCriteria.forClass(Customer.class);
		List<Customer> list=(List<Customer>) hibernateTemp.findByCriteria(dc);
		for(Customer c:list){
			CustomerTO cto=new CustomerTO(c.getCid(), c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}

	@Override
	public CustomerTO getCustomerByEmail(String email) {
		DetachedCriteria dc=DetachedCriteria.forClass(Customer.class);
		dc.add(Restrictions.eq("email", email));
		List<Customer> list=(List<Customer>) hibernateTemp.findByCriteria(dc);
		Customer c=list.get(0);
		CustomerTO cto=new CustomerTO(c.getCid(), c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
		return cto;
	}

	@Override
	public List<CustomerTO> getCustomersByCity(String city) {
		List<CustomerTO> ctoList=new ArrayList<CustomerTO>();
		DetachedCriteria dc=DetachedCriteria.forClass(Customer.class);
		dc.add(Restrictions.eq("city", city));
		hibernateTemp.setCacheQueries(true);
		List<Customer> list=(List<Customer>) hibernateTemp.findByCriteria(dc);
		for(Customer c:list){
			CustomerTO cto=new CustomerTO(c.getCid(), c.getCname(), c.getEmail(), c.getPhone(), c.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}

	@Override
	public int getCustomersCount() {
		DetachedCriteria dc=DetachedCriteria.forClass(Customer.class);
		List<Customer> list=(List<Customer>) hibernateTemp.findByCriteria(dc);
		return list.size();
	}

	@Override
	public String getCustomerCityByEmail(String email) {
		DetachedCriteria dc=DetachedCriteria.forClass(Customer.class);
		dc.add(Restrictions.eq("email", email));
		List<Customer> list=(List<Customer>) hibernateTemp.findByCriteria(dc);
		Customer c=list.get(0);
		return c.getCity();
	}

	@Override
	public Long getCustomerPhoneByEmail(String email) {
		DetachedCriteria dc=DetachedCriteria.forClass(Customer.class);
		dc.add(Restrictions.eq("email", email));
		List<Customer> list=(List<Customer>) hibernateTemp.findByCriteria(dc);
		Customer c=list.get(0);
		return c.getPhone();
	}
	
	
}
