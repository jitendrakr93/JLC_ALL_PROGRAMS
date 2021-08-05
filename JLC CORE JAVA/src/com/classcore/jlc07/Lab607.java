package com.classcore.jlc07;

import java.util.ArrayList;
import java.util.List;

public class Lab607 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("dande");
		System.out.println(list);
		list.set(1, "Java");
		System.out.println(list);
		Object obj=list.get(2);
		System.out.println(obj);

	}

}
