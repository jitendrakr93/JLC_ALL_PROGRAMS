package com.classcore.jlc04;

public class Lab347 {

	public static void main(String[] args) {
		new B347(10);

	}

}
class A347{
	public A347() {
		System.out.println("A -> D.C");
	}
}
class B347 extends A347{
	B347() {
		System.out.println("B -> D.C");
	}
	B347(int a){
		this();
		System.out.println("B(int)");
	}
	
}