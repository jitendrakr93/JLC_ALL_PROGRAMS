package com.jlcindia.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab34B {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			//A.Display all customers by city
			Query query=session.getNamedQuery("CustomerByCity");
			query.setString(0, "Blore");
			List<Customer> list=query.list();
			for(Customer cust:list)
				System.out.println(cust);
			tx.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}

	}

}
