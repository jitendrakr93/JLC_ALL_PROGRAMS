package com.classcore.jlc04;

public class Lab392 {

	public static void main(String[] args) {
		B392 bobj=new B392();
		bobj.m1();

	}

}
class A392{
	static void m1(){
		System.out.println("A -> m1()");
	}
}
class B392 extends A392{
	static void m1(){
		System.out.println("B -> m1()");
	}
}