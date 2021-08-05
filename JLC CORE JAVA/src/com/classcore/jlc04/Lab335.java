package com.classcore.jlc04;

public class Lab335 {

	public static void main(String[] args) {
		new Hello24();
	}

}
class Hai9{
	static int a=99;
	static{
		System.out.println("Hai -> S.B :"+a);
	}
}
class Hello24 extends Hai9{
	static int b=88;
	static{
		System.out.println("Hello -> S.B :"+a);
		System.out.println("Hello -> S.B :"+b);
	}
}