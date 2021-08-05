package com.classcore.jlc04;

public class Lab382 {

	public static void main(String[] args) {
		B382.m2();

	}

}
class A382{
	void m1(){
		
	}
	static void m2(){}
}
class B382 extends A382{
	void m1(){}
	static void m2(){}
}