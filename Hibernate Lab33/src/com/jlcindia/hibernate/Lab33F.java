package com.jlcindia.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Lab33F {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			// A.Display all customers by city and status
			Criteria ct=session.createCriteria(Customer.class);
			Criterion city=Restrictions.eq("city", "Blore");
			Criterion status=Restrictions.eq("status", "INACTIVE");
			ct.add(Restrictions.and(city, status));
			List<Customer> list=ct.list();
			for(Customer cust:list)
				System.out.println(cust);
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}

	}

}
