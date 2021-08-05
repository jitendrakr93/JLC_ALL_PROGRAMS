package com.classcore.jlc07;

import java.util.ArrayList;
import java.util.List;

public class Lab608 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("dande");
		list.add("Java");
		list.add("Nivas");
		list.add("JDBC");
		System.out.println(list);
		int x=list.indexOf("Nivas");
		System.out.println(x);
		int y=list.lastIndexOf("Nivas");
		System.out.println(y);

	}

}
