package com.classcore.jlc04;

public class Lab390 {

	public static void main(String[] args) {
		B390 bobj=new B390();
		bobj.m1();

	}

}
class A390{
	void m1(){
		System.out.println("A -> m1()");
	}
}
class B390 extends A390{
	void m1(){
		System.out.println("B -> m1()");
	}
}