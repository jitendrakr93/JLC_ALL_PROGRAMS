package com.classcore.jlc07;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab665 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Srinivas");
		list.add("Dande");
		list.add("Abhi");
		list.add("Kumar");
		list.add("Nivas");
		System.out.println(list);
		System.out.println("\nREVERSE");
		Collections.reverse(list);
		System.out.println(list);
		System.out.println("\n ROTATE(2)");
		Collections.rotate(list, 2);
		System.out.println(list);
		System.out.println("\n ROTATE(3)");
		Collections.rotate(list, -3);
		System.out.println(list);
		System.out.println("\n SHUFFLE");
		for(int i=0;i<5;i++){
			Collections.shuffle(list);
			System.out.println(list);
		}

	}

}
