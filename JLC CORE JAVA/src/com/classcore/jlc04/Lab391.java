package com.classcore.jlc04;

public class Lab391 {

	public static void main(String[] args) {
		B391 bobj=new B391();
		bobj.m1();

	}

}
class A391{
	void m1(){
		System.out.println("A -> m1()");
	}
}
class B391 extends A391{
	void m1(){
		System.out.println("B -> m1()");
		super.m1();
	}
}