package com.classcore.jlc07;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Lab644 {

	public static void main(String[] args) {
		Map map = new LinkedHashMap();
		map.put("eid", new Integer(99));
		map.put("name", "Srinivas");
		map.put("phone", new Long(65799999L));
		map.put("valid", new Boolean(true));
		System.out.println("\n** KEYS AND VALUES");
		Set data = map.entrySet();
		Iterator it = data.iterator();
		while (it.hasNext()) {
			Object object = it.next();
			Map.Entry entry = (Map.Entry) object;
			Object key = entry.getKey();
			Object val = entry.getValue();
			System.out.println(key + "\t\t" + val);
		}
	}

}
