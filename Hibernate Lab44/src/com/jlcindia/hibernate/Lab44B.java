package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab44B {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Object obj=session.get(Student.class,new SID("30","001"));
			if(obj == null){
				System.out.println("Student not found");
			}else{
				Student stu1=(Student) obj;
				System.out.println(stu1.getStudentId().getBid());
				System.out.println(stu1.getStudentId().getSid());
				System.out.println(stu1.getSname());
				System.out.println(stu1.getEmail());
				System.out.println(stu1.getPhone());
			}
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		}
	}

}
