package com.jlcindia.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Lab33I {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			// A.Display all customers by balance range and city
			Criteria ct=session.createCriteria(Customer.class);
			Criterion balance=Restrictions.between("cardBal","25000.0","40000.0");
			Criterion city=Restrictions.eq("city", "Blore");
			ct.add(Restrictions.and(balance, city));
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
