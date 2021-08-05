package com.classcore.jlc07;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Lab651 {

	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1234, "Sri");
		map.put(8767, "Nivas");
		map.put(5677, "Manish");
		map.put(2343, "Dande");
		map.put(9898, "Dharmendra");
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it3 = set.iterator();
		while (it3.hasNext()) {
			Map.Entry<java.lang.Integer, java.lang.String> entry = it3.next();
			Integer key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+"\t"+value);

		}
	}

}
