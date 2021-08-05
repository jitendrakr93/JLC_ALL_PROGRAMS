package com.classcore.jlc03;

class Hello_10 {
	static int a;
	int b;
	static {
		a = 10;
		/* WE CANT ACCESS NON STATIC VARIABLE INSIDE STATIC AREA DIRECTLY */
		// b=20;
		System.out.println("static block");
	}
}

public class Lab248 {

	public static void main(String[] args) {

		System.out.println("Main:"+Hello_10.a);
	}

}
