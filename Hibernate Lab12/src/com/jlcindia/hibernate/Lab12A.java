package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab12A {
	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			Address add=new Address("HMT MAIN","Blore","Karnataka");
			session.save(add);
			
			Customer cust=new Customer("Sri", "Nivas", "Sri@jlc", "1234");
			session.save(cust);
			
			
			cust.setAddress(add);
			tx.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
			if(tx!=null){
				tx.rollback();
			}
		}
	}
}
