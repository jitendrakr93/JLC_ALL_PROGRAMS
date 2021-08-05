package com.classcore.jlc07;

import java.util.ArrayList;
import java.util.Collection;

public class Lab601 {

	public static void main(String[] args) {
		Collection col=new ArrayList();
		col.add("Sri");
		col.add("Srinivas");
		col.add("Dande");
		System.out.println(col+"\t\t"+col.size());
		Collection col2=new ArrayList();
		col2.add("Java");
		col2.add("JDBC");
		col2.add("JSP");
		System.out.println(col2+"\t\t"+col2.size());
		col.add(col2);
		System.out.println(col+"\t\t"+col.size());

	}

}
