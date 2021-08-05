package com.classcore.jlc05;

class Outer {
	int a = 10;
	static int b = 20;

	void m1() {
		System.out.println("Outer -> m1()");
	}

	static void m2() {
		System.out.println("Outer -> m2()");
	}

	class Inner {
		int x = 11;

		void show() {
			System.out.println("Inner -> show()");
			System.out.println(a);
			System.out.println(b);
			System.out.println(x);
			m1();
			m2();
		}
	}
}

public class Lab434 {

	public static void main(String[] args) {
		Outer outob=new Outer();
		outob.m1();
		outob.m2();
		Outer.Inner inob=new Outer().new Inner();
		inob.show();

	}

}
