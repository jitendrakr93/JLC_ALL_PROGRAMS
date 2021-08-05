package com.classcore.jlc07;
import java.util.Enumeration;
import java.util.Vector;

public class Lab612 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.addElement("Sri");
		v.addElement("Nivas");
		v.addElement("Dande");
		v.addElement("SD");
		Enumeration enu=v.elements();
		while(enu.hasMoreElements())
			System.out.println(enu.nextElement());
	}

}
