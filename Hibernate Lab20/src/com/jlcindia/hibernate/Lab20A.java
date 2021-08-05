package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab20A {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			Customer cust=new Customer("Sri", "sri@jlc.com", 747474);
			session.save(cust);
			tx.commit();
			session.close();
			System.out.println("Record Inserted");
		}catch(Exception e){
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}
	}

}
