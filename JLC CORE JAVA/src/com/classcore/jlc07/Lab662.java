package com.classcore.jlc07;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Lab662 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Srinivas");
		list.add("Dande");
		list.add("Anand");
		list.add("Kumar");
		System.out.println(list);
		System.out.println("\n LIST to ENUMERATION");
		Enumeration enm=Collections.enumeration(list);
		while (enm.hasMoreElements()) 
			System.out.println(enm.nextElement());
		Vector v=new Vector();
		v.add(99);
		v.add("Sri");
		v.add("sri@jlc.com");
		System.out.println("\n ENUMERATION to LIST");
		Enumeration enu=v.elements();
		List info=Collections.list(enu);
		System.out.println(info);
			
		
	}

}
