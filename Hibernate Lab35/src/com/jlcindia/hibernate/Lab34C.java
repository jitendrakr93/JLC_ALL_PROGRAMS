package com.jlcindia.hibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab34C {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			// A.Display all customers by email
			Query query = session.getNamedQuery("CustomersByEmail");
			query.setString(0, "sri@jlc.com");
			Customer cust = (Customer) query.uniqueResult();
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
