package com.classcore.jlc07;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab620 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		list.add("Java");
		list.add("JDBC");
		list.add("JSP");
		ListIterator lit=list.listIterator(2);
		do{
			int indx=lit.nextIndex();
			Object obj=lit.next();
			System.out.println(indx+"\t"+obj);
		}while(lit.hasNext());
		System.out.println();
		lit=list.listIterator(5);
		do{
			int indx=lit.previousIndex();
			Object obj=lit.previous();
			System.out.println(indx+"\t"+obj);
		}while(lit.hasPrevious());
	}

}
