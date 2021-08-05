package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab14B {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = (Customer) session.load(Customer.class, 1);
			System.out.println(cust.getCid() + "\t" + cust.getFirstName() + "\t" + cust.getLastName() + "\t"
					+ cust.getEmail() + "\t" + cust.getPhone());
			Address ad = cust.getAddress();
			System.out.println(ad.getAid()+"\t"+ad.getStreet()+"\t"+ad.getCity()+"\t"+ad.getState());
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}

}
