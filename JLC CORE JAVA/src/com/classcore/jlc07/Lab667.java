package com.classcore.jlc07;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab667 {

	public static void main(String[] args) {
		List list=new ArrayList<>();
		list.add(new StringBuilder("Srinivas"));
		list.add(new StringBuilder("Dande"));
		list.add(new StringBuilder("Abhi"));
		list.add(new StringBuilder("Kumar"));
		list.add(new StringBuilder("Nivas"));
		System.out.println(list);
		 //Collections.sort(col);//java.lang.ClassCastException
		System.out.println("\nSorting StringBuffer");
		Collections.sort(list,new StringBiulderComp());
		System.out.println(list);

	}

}
class StringBiulderComp implements Comparator{
	@Override
	public int compare(Object obj1, Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s1.compareTo(s2);
	}
}