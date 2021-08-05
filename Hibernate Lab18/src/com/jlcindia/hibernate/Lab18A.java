package com.jlcindia.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab18A {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			Student s1=new Student("Sri", "sri@jlc.com", 9999);
			Student s2=new Student("Nivas", "nivas@jlc.com", 8888);
			Student s3=new Student("Manish", "manish@jlc.com", 7777);
			session.save(s1);
			session.save(s2);
			session.save(s3);
			Course c1=new Course("Java", 9, 999);
			Course c2=new Course("JSP", 8, 888);
			Course c3=new Course("EJB", 7, 777);
			session.save(c1);
			session.save(c2);
			session.save(c3);
			Set<Course> cs1=new HashSet<Course>();
			cs1.add(c1);
			cs1.add(c2);
			cs1.add(c3);
			s1.setCourses(cs1);
			Set<Course> cs2=new HashSet<Course>();
			cs2.add(c1);
			cs2.add(c2);
			cs2.add(c3);
			s2.setCourses(cs2);
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
