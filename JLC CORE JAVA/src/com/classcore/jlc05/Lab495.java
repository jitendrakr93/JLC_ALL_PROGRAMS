package com.classcore.jlc05;

public class Lab495 {

	public static void main(String[] args) {
		String str="JLC, Java Learning Center. No 1 in Java Training and Placement. Java is a popular language";
		String res[]=str.split("Java");
		System.out.println("Length :"+res.length);
		for (int i = 0; i < res.length; i++) {
			String st=res[i];
			System.out.println(i+"\t"+st);
		}

	}

}
