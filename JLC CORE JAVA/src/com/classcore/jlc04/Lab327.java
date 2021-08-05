package com.classcore.jlc04;

public class Lab327 {
	public static void main(String args[]) {
		Hello23 hello = new Hello23();
		hello.m1();
		hello.m2();

	}

}

class Hai7 {
	int a = 99;

	void m1() {
		System.out.println("Hai->m1 :" + a);
		
	}
}

class Hello23 extends Hai7 {
	int b = 88;

	void m2() {
		System.out.println("Hai->m2 :" + a);
		System.out.println("Hai->m2 :" + b);
	}
}