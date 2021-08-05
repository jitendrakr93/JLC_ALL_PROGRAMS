package com.classcore.palle13;

public class MyProgram {

	public static void main(String[] args) {
		int i=10;
		Count c=new Count();
		A a1=new A();
		System.out.println(i);
		System.out.println(c.x);
		a1.f1(i);
		a1.f2(c);
		System.out.println(i);
		System.out.println(c.x);
	}

}
