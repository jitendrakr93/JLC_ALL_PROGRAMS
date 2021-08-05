package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab13C {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			Address ad=(Address) session.load(Address.class, 1);
			System.out.println(ad.getAid()+"\t"+ad.getStreet()+"\t"+ad.getCity()+"\t"+ad.getState());
			Customer cust=ad.getCustomer();
			System.out.println(cust.getCid() + "\t" + cust.getFirstName() + "\t" + cust.getLastName() + "\t"
					+ cust.getEmail() + "\t" + cust.getPhone());
			tx.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}
	}

}
