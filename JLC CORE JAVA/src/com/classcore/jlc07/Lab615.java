package com.classcore.jlc07;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab615 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		Iterator it=list.iterator();
		int size=list.size();
		//list.remove("Sri");
		for(int i=0;i<size;i++)
			System.out.println(it.next());
		System.out.println("Main Completed");
	}

}
