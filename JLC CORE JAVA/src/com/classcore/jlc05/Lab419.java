package com.classcore.jlc05;

class Hello13 implements Inter1, Inter2 {

	public void m1() {
		System.out.println("Hello -> m1()");
		

	}

	public void m2() {
		System.out.println("Hello -> m2()");
		

	}

	public void m3() {
		System.out.println("Hello -> m3()");
		System.out.println(Inter1.A);
		System.out.println(Inter2.A);
		System.out.println(B);
		System.out.println(C);

	}

}

public class Lab419 {

	public static void main(String[] args) {
		Hello13 h=new Hello13();
		h.m1();
		h.m2();
		h.m3();

	}

}
