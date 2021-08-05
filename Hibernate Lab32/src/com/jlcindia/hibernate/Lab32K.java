package com.jlcindia.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab32K {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			//A.Display Customers by city and cardType
			String hql="from Customer cust where cust.city=:mycity and cust.cardType=:ctype";
			Query query=session.createQuery(hql);
			query.setString("mycity", "Blore");
			query.setParameter("ctype", "VISA");
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
