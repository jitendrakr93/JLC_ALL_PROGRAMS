package com.classcore.jlc05;

public class Lab464 {

	public static void main(String[] args) {
		String st1="JLC99";
		final String st2="JLC";
		final int ab=99;
		String st3=st2+ab;
		String st4="JLC"+99;
		System.out.println(st1+"\t"+st3+"\t"+st4);
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
	}

}
