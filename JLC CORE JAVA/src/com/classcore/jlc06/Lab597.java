package com.classcore.jlc06;

import java.util.ArrayList;
import java.util.Collection;

public class Lab597 {

	public static void main(String[] args) {
		Collection col=new ArrayList<>();
		System.out.println(col);
		System.out.println("Size :"+col.size());
		System.out.println("Empty :"+col.isEmpty());
		System.out.println();
		col.add("Sri");
		col.add("Nivas");
		col.add("Srini");
		col.add("SD");
		col.add("Dande");
		System.out.println(col);
		System.out.println("Size :"+col.size());
		System.out.println("Empty :"+col.isEmpty());
	}

}
