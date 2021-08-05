package com.jlcindia.hibernate;


import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab36A {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			//A.Display All Customers
			String sql="select *from customers";
			SQLQuery query=session.createSQLQuery(sql);
			query.addEntity(Customer.class);
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
