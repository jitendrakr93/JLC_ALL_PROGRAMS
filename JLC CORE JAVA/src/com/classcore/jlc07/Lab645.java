package com.classcore.jlc07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Lab645 {

	public static void main(String[] args) {
		System.out.println("\n** HASH MAP");
		Map map = new HashMap();
		map.put("sid", "JLC-099");
		map.put("name", "Sri");
		map.put("email", "sri@jlc.com");
		map.put("phone", "65799999");
		map.put("add", "Mathikere");

		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}

}
