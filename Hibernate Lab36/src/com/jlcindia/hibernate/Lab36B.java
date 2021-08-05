package com.jlcindia.hibernate;


import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab36B {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			//A.Display All Customers by city
			String sql="select *from customers cust where cust.city=?";
			SQLQuery query=session.createSQLQuery(sql);
			query.addEntity(Customer.class);
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
