package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab41 {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = new Customer("C-103", "sd", "sd@jlc.com", 123456);
			String customerId = session.save(cust).toString();
			System.out.println(customerId);
			session.flush();
			tx.commit();
			tx = session.beginTransaction();
			Customer cu = (Customer) session.load(Customer.class, "402881e561ef33070161ef330a0c0000");
			System.out.println(cu);
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		}
	}

}
