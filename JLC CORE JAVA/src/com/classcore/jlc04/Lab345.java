package com.classcore.jlc04;

public class Lab345 {

	public static void main(String[] args) {
		new B345();

	}

}
class A345{
	public A345(int a) {
		System.out.println("A (int) Cons");
	}
}
class B345 extends A345{
	public B345() {
		super(10);
		System.out.println("B345 -> D.C");
	}
}