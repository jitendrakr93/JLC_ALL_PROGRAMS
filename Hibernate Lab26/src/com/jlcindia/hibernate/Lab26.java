package com.jlcindia.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab26 {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			Customer cust=new Customer("Sri", "sri@jlc", 1234, "Blore", 25000.0);
			session.save(cust);
			System.out.println("Inserted");
			tx.commit();
			
			tx=session.beginTransaction();
			System.out.println("Trying to update name");
			cust.setCname("Nivas");
			session.update(cust);
			tx.commit();
			session.close();
			System.out.println("Record inserted");
		}catch(Exception e){
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}

	}

}
