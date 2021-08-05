package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab37 {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			Contact c1=new Contact("Sri", "nivas", "sri@jlc", 989898, "1-2-1987", "InActive");
			Contact c2=new Contact("Manish", "Ranjan", "manish@jlc", 767676, "25-12-1987", "Active");
			session.save(c1);
			session.save(c2);
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
