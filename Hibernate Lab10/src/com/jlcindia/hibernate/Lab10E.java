package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab10E {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			WeekendStudent wes=new WeekendStudent("Srinivas", "Blore", "Active", 20000, 5000, "8:00 - 2:00", "Mathikere", "JLC", "srinivas@jlc", 15.5);
			wes.setSid(1);
			session.save(wes);
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
