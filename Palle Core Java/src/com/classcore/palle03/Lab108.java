package com.classcore.palle03;

public class Lab108 {

	public static void main(String[] args) {
		String s1="tech";
		String s2="Tech";
		String s3=new String("tech");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s2));

	}

}
