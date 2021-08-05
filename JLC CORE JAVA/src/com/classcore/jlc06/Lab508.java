package com.classcore.jlc06;

public class Lab508 {

	public static void main(String[] args) {
		int a=123;
		//String s1=a; //Invalid
		//String s2=(String)a; //Invalid
		String s3=""+a;
		String s4=a+"";
		System.out.println(s3);
		System.out.println(s4);
		String s5=String.valueOf(a);
		System.out.println(s5);
		String s6=Integer.toString(a);
		System.out.println(s6);

	}

}
