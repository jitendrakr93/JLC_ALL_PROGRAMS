package com.jlcindia.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab32M {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			// A.Display Customers with Pagination
			String hql = "from Customer cust";
			Query query = session.createQuery(hql);
			query.setFirstResult(0);
			query.setMaxResults(5);
			List<Customer> list = query.list();
			for (Customer cust : list) {
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
