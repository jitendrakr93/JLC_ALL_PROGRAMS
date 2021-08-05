package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab10D {


	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			WeekdayStudent wds=new WeekdayStudent("SD", "Blore", "Active", 18000, 8000, "10:00 - 2:00", "BTM", "MTech", "98%", 1999);
			wds.setSid(1);
			session.save(wds);
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
