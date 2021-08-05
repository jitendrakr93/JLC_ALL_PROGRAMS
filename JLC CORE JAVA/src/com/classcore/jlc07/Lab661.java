package com.classcore.jlc07;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab661 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Srinivas");
		list.add("Dande");
		list.add("Anand");
		list.add("Kumar");
		System.out.println(list);
		//Copy One List to another List
		List list2=new ArrayList();
		list2.add("Java");
		list2.add("Jdbc");
		list2.add("Servlets");
		list2.add("JSP");
		System.out.println("list2 :"+list2);
		Collections.copy(list2, list);
		System.out.println("list2 :"+list2);

	}

}
