package com.classcore.jlc07;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab616 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		list.add("Java");
		list.add("JDBC");
		list.add("JSP");
		Iterator it=list.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}

	}

}
