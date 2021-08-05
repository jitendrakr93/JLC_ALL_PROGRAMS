package com.classcore.jlc05;

public class Lab459 {

	public static void main(String[] args) {
		String st1="JLC";
		String st2=new String("JLC");
		String st3=st2.intern();
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println(st2==st3);
		System.out.println();
		String st4="OK".intern();
		String st5="OK";
		System.out.println(st4==st5);

	}

}
