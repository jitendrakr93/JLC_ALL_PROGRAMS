package com.classcore.jlc07;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab664 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Srinivas");
		list.add("Dande");
		list.add("Nivas");
		list.add("Kumar");
		list.add("Nivas");
		System.out.println("\nREPLACING SD WITH JLC");
		Collections.replaceAll(list, "Nivas", "JLC");
		System.out.println(list);
		Object max=Collections.max(list);
		System.out.println("\nMAX OBJ :"+max);
		Object min=Collections.min(list);
		System.out.println("\nMIN OBJ :"+min);
		System.out.println("\nREPLACEING ALL WITH JLC");
		Collections.fill(list, "JLC");
		System.out.println(list);

	}

}
