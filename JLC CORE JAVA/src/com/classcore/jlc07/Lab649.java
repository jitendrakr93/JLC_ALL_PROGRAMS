package com.classcore.jlc07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab649 {

	public static void main(String[] args) {
		System.out.println("\n-- Using Generics with List --");
		List<String> list=new ArrayList<String>();
		list.add("Srinivas");
		list.add("Manish");
		list.add("Dharmendra");
		list.add("Dande");
		//list.add(new Integer(12));
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str);
		}
	}

}
