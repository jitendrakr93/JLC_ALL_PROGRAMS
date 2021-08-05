package com.jlcindia.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab32I {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			//A.Display Customers by balance range and city
			String hql="from Customer cust where cust.cardBal between ? and ? and cust.city=?";
			Query query=session.createQuery(hql);
			query.setDouble(0, 25000);
			query.setDouble(1, 40000);
			query.setString(2, "Blore");
			List<Customer> list=query.list();
			for(Customer cust:list){
				System.out.println(cust);
			}
			tx.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}

	}





}
