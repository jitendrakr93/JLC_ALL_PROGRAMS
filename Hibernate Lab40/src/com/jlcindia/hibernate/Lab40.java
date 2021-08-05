package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab40 {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			Customer cust=new Customer("sd", "sd@jlc.com", 123456);
			Integer it=(Integer) session.save(cust);
			System.out.println(it.intValue());
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
