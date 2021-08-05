package com.classcore.jlc07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab650 {

	public static void main(String[] args) {
		System.out.println("\n-- Using Generics with Set --");
		Set<String> set=new HashSet<String>();
		set.add("Srinivas");
		set.add("Manish");
		set.add("Dharmendra");
		set.add("Dande");
		//set.add(new Integer(12));
		Iterator<String> it=set.iterator();
		while (it.hasNext()) {
			String str =  it.next();
			System.out.println(str);
		}
	}

}
