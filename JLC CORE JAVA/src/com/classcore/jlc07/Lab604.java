package com.classcore.jlc07;

import java.util.ArrayList;
import java.util.Collection;

public class Lab604 {

	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("JDBC");
		col.add("Sri");
		col.add("JSP");
		col.add("Srinivas");
		col.add("Java");
		col.add("Dande");
		Collection col2 = new ArrayList();
		col2.add("Java");
		col2.add("JDBC");
		col2.add("JSP");
		System.out.println(col);
		System.out.println(col2);
		System.out.println(col.removeAll(col2));
		System.out.println(col);
		System.out.println(col2);
	}

}
