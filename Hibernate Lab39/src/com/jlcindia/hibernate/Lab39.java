package com.jlcindia.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab39 {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			Query q=session.createQuery("from Contact c");
			q.setCacheable(true);
			List<Contact> list=q.list();
			for(Contact c:list){
				System.out.println(c);
			}
			System.out.println("***");
			Query q1=session.createQuery("from Contact c");
			q1.setCacheable(true);
			List<Contact> list1=q1.list();
			for(Contact c:list1){
				System.out.println(c);
			}
			
			/*Criteria ct=session.createCriteria(Contact.class);
			ct.setCacheable(true);
			list=q.list();
			for(Contact c:list)
				System.out.println(c);*/
			tx.commit();
			Thread.currentThread().sleep(5000);
			session.close();
		}catch(Exception e){
			e.printStackTrace();
			if(tx!=null){
				tx.rollback();
			}
		}
	}

}
