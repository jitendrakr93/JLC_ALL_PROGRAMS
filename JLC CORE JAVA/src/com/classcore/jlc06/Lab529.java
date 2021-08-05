package com.classcore.jlc06;

import java.util.Enumeration;
import java.util.Properties;

public class Lab529 {

	public static void main(String[] args) {
		System.out.println("\n***ACCESSING ALL PROPERTIES***");
		Properties p=System.getProperties();
		Enumeration enm=p.propertyNames();
		while (enm.hasMoreElements()) {
			String pName= enm.nextElement().toString();
			String val=System.getProperty(pName);
			System.out.println(pName+"\t:\t"+val);
			
		}

	}

}
