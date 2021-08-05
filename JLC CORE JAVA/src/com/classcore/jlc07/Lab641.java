package com.classcore.jlc07;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab641 {

	public static void main(String[] args) {
		Map map=new LinkedHashMap();
		map.put("eid",new Integer(99));
		map.put("name","Srinivas");
		map.put("phone", new Long(65799999L));
		map.put("valid", new Boolean(true));
		System.out.println(map);
		System.out.println(map.containsKey("eid"));
		System.out.println(map.containsKey("email"));
		System.out.println(map.containsValue("Srinivas"));
		System.out.println(map.containsValue(new Integer(99)));
		System.out.println(map.containsValue("SD"));
	}

}
