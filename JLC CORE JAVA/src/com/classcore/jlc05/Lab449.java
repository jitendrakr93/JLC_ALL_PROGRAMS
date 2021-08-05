package com.classcore.jlc05;

public class Lab449 {

	public static void main(String[] args) {
		String st1=new String("Sri");
		String st2=new String("Sri");
		String st3=new String("Manish");
		System.out.println("using == op");
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println("Using equals()");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		
	}

}
