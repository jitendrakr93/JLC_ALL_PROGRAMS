package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab15A {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			Customer cust=new Customer("Manish", "Kumar", "manish@jlc.com", "9999");
			session.save(cust);
			Request req1=new Request("22/07/2014", "hello1", "ok1");
			Request req2=new Request("23/07/2014", "hello2", "ok2");
			session.save(req1);
			session.save(req2);
			req1.setCustomer(cust);
			req2.setCustomer(cust);
			tx.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}

	}

}
