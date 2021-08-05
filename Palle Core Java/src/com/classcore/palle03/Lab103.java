package com.classcore.palle03;

public class Lab103 {

	public static void main(String[] args) {
		String s="JITENDRA";
		System.out.println(s.charAt(2));
		System.out.println(s.concat(" KUMAR"));
		System.out.println(s.contains("RA"));
		System.out.println(s.equals("JITENDRA"));
		System.out.println(s.equalsIgnoreCase("jitendra"));
		System.out.println(s.indexOf('E'));
		System.out.println(s.indexOf('A',4));
		System.out.println(s.indexOf("EN"));
		System.out.println(s.indexOf("DRA",2));
		System.out.println(s.lastIndexOf('J'));
		System.out.println(s.lastIndexOf('A',3));
		System.out.println(s.lastIndexOf("JK"));
		System.out.println(s.lastIndexOf("JK",2));
		System.out.println(s.length());
		System.out.println(s.replace('A', 'K'));
		System.out.println(s.substring(2));
		System.out.println(s.substring(2,5));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.trim());

	}

}
