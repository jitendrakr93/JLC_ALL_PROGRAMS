package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab23 {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			
			Address add=new Address();
			add.setCity("Blore");
			add.setStreet("BTM Layout");
			
			Customer cust=new Customer("Sri", add);
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
