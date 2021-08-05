package com.jlcindia.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab32D {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			// A.Display Customers by status
			String hql="from Customer cust where cust.status=?";
			Query query=session.createQuery(hql);
			query.setString(0, "ACTIVE");
			List<Customer> list=query.list();
			for(Customer cust:list){
				System.out.println(cust);
			}
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}

	}

}
