package com.jlcindia.hibernate;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab18C {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			Course c=(Course) session.load(Course.class, 1);
			System.out.println("**Courses info");
			System.out.println(c);
			System.out.println("**Students info");
			Set<Student> stus=c.getStudents();
			for(Student s: stus)
				System.out.println(s);
			tx.commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}

	
		

	}

}
