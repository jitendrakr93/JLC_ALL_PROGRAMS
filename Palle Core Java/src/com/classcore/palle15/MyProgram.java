package com.classcore.palle15;

public class MyProgram {

	public static void main(String[] args) {
		A a1=new A();
		A a2=new A();
		a1.x++;
		a2.y++;
		B b1=new B();
		System.out.println(a1.x+a1.y);
		System.out.println(a2.x+a2.y);
		b1.f1(a2, a1);
		System.out.println(a1.x);
		System.out.println(a1.y);
		System.out.println(a2.x);
		System.out.println(a2.y);

	}

}
