package com.classcore.jlc07;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Lab647 {

	public static void main(String[] args) {
		System.out.println("\n** TreeMap");
		Map map=new TreeMap();
		map.put("sid","JLC-099");
		map.put("name","Sri");
		map.put("email","sri@jlc.com");
		map.put("phone","65799999");
		map.put("add","Mathikere");
		Set set=map.entrySet();
		Iterator it=set.iterator();
		while (it.hasNext()) {
			System.out.println(it.hasNext());
			
		}

	}

}
