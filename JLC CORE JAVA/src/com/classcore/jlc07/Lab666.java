package com.classcore.jlc07;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab666 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Srinivas");
		list.add("Dande");
		list.add("Abhi");
		list.add("Kumar");
		list.add("Nivas");
		System.out.println("\nSorting in ASCENDING");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("\n Sorting in DECENDING");
		Collections.sort(list,new StringDescComp());
		System.out.println(list);

	}

}
class StringDescComp implements Comparator{
	@Override
	public int compare(Object obj1, Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}