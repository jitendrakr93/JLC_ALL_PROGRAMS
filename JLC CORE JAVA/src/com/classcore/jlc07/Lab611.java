package com.classcore.jlc07;

import java.util.Enumeration;
import java.util.Vector;

public class Lab611 {

	public static void main(String[] args) {
		Vector v = new Vector();
		Enumeration enu = v.elements();
		if(enu.hasMoreElements())
			System.out.println(enu.nextElement());
		System.out.println("Main Completed");
	}

}
