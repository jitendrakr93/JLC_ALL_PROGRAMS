package com.jlcindia.spring.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class HibernateCustomerDAO extends HibernateDaoSupport implements CustomerDAO {

	@Override
	public void addCustomer(CustomerTO cto) {
		final Customer cust=new Customer(cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity());
		HibernateCallback<Session> hc=new HibernateCallback<Session>() {
			@Override
			public Session doInHibernate(Session session) throws HibernateException {
				session.save(cust);
				return session;
			}
		};
		getHibernateTemplate().execute(hc);

	}

}
