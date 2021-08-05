package com.jlcindia.hibernate;


import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab36C {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			//A.Display All Customers by email
			String sql="select *from customers cust where cust.email=?";
			SQLQuery query=session.createSQLQuery(sql);
			query.addEntity(Customer.class);
			query.setString(0, "sri@jlc.com");
			Customer cust=(Customer) query.uniqueResult();
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
