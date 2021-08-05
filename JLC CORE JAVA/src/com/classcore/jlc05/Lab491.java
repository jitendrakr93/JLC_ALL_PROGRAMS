package com.classcore.jlc05;

public class Lab491 {

	public static void main(String[] args) {
		String str="JLCINDIA";
		char cArr[]=str.toCharArray();
		System.out.println("\n** char array **");
		for (int i = 0; i < cArr.length; i++) {
			char ch=cArr[i];
			System.out.println(i+"\t"+ch);
		}

	}

}
