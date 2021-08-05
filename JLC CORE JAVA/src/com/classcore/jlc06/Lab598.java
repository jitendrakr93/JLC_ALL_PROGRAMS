package com.classcore.jlc06;

import java.util.ArrayList;
import java.util.Collection;

public class Lab598 {

	public static void main(String[] args) {
		Collection col=new ArrayList();
		col.add("Sri");
		col.add("Srinivas");
		col.add("SD");
		col.add("Dande");
		System.out.println(col.contains("Srinivas"));
		System.out.println(col.contains("Java"));
		System.out.println(col);
		System.out.println(col.remove("JDBC"));
		System.out.println(col.remove("Srinivas"));
		System.out.println(col);
		col.clear();
		System.out.println(col);System.out.println(col.size());

	}

}
