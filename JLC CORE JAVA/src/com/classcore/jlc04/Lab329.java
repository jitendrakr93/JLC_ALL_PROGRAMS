package com.classcore.jlc04;

public class Lab329 {

	public static void main(String args[]) {
		B2 bobj=new B2();
		bobj.m1();
		bobj.m2();
		C2 cobj=new C2();
		cobj.m1();
		cobj.m3();
	}
}
class A2{
	void m1(){
		System.out.println("A -> m1");
	}
}
class B2 extends A2{
	void m2(){
		System.out.println("B -> m2");
	}
}
class C2 extends B2{
	void m3(){
		System.out.println("C -> m3");
	}
}