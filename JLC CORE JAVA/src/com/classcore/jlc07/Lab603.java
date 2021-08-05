package com.classcore.jlc07;

import java.util.ArrayList;
import java.util.Collection;

public class Lab603 {

	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("JDBC");
		col.add("JSP");
		col.add("Srinivas");
		col.add("Java");
		col.add("Dande");
		Collection col2 = new ArrayList();
		col2.add("Java");
		col2.add("JDBC");
		col2.add("JSP");
		Collection col3=new ArrayList();
		col3.add("Java");
		col3.add("JDBC");
		col3.add("EJB");
		System.out.println(col+"\n"+col2+"\n"+col3);
		System.out.println(col.containsAll(col2));
		System.out.println(col.containsAll(col3));

	}

}
