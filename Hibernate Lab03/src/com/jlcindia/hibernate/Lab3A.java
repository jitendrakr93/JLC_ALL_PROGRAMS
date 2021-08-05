package com.jlcindia.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab3A {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			String cous[]={"Java","JDBC","JSP"};
			
			List<String> ems=new ArrayList<String>();
			ems.add("aa@jlc");
			ems.add("bb@jlc");
			ems.add("cc@jlc");
			
			List<Integer> marks=new ArrayList<>();
			marks.add(100);
			marks.add(99);
			marks.add(98);
			
			Set<Long> phs=new HashSet<>();
			phs.add(new Long(1111));
			phs.add(new Long(2222));
			phs.add(new Long(3333));
			
			Map<String, Long> refs=new HashMap<>();
			refs.put("aaa", new Long(1111));
			refs.put("bbb", new Long(2222));
			refs.put("ccc", new Long(3333));
			
			Student stu=new Student("Sri", "10-10-10", "M.Sc", cous, ems, marks, phs, refs);
			session.save(stu);
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
