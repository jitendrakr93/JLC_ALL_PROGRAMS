package com.classcore.jlc07;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab642 {

	public static void main(String[] args) {
		Map map=new LinkedHashMap();
		map.put("eid",new Integer(99));
		map.put("name","Srinivas");
		map.put("phone",new Long(65799999L));
		System.out.println(map);
		System.out.println("remove(eid) "+map.remove("eid"));
		System.out.println(map);
		System.out.println("put-phone "+map.put("phone", new Long(31903290L)));
		System.out.println(map);
		System.out.println("get()");
		System.out.println(map.get("name"));
		System.out.println(map.get("email"));
	}

}
