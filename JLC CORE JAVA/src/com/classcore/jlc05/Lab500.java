package com.classcore.jlc05;

public class Lab500 {

	public static void main(String[] args) {
		String exp="[A-Za-z0-9]*";
		System.out.println("jlc".matches(exp));
		System.out.println("JLCindia99".matches(exp));
		System.out.println("99JLCindia".matches(exp));

	}

}
