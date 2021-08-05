package com.classcore.jlc07;

import java.util.HashMap;
import java.util.Map;

public class Lab648 {

	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("sid","JLC-099");
		map.put("name","Srinivas");
		Map map2=new HashMap();
		map2.put("MKR", "Mathikere");
		map2.put("BTM","BTM Layout");
		System.out.println(map);
		System.out.println(map2);
		map.putAll(map2);
		System.out.println(map);
		System.out.println(map2);

	}

}
