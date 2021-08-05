package com.classcore.jlc07;

import java.util.ArrayList;
import java.util.List;

public class Lab606 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		System.out.println(list);
		list.add(1,"java");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);

	}

}
