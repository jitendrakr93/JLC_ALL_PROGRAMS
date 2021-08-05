package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab10C {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			OldStudent os=new OldStudent("Nivas", "Blore", "Active", 15000, "JLC", "nivas@jlc", 5.6);
			os.setSid(1);
			session.save(os);
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
