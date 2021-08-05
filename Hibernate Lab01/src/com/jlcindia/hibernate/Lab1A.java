package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab1A {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			Customer cust=new Customer("Sri","Sri@jlc",1234,"Blore",25000.0);
			System.out.println(cust);
			session.save(cust);
			System.out.println(cust);
			tx.commit();
			System.out.println(cust);
			session.close();
			System.out.println("Record Inserted");
		}catch(Exception e){
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}

	}

}
