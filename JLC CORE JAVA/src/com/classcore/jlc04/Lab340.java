package com.classcore.jlc04;

public class Lab340 {

	public static void main(String[] args) {
		new C3();

	}

}

class A7 {
	A7() {
		System.out.println("A -> D.C");
	}
	static{
		System.out.println("A -> S.B");
	}
	{
		System.out.println("A -> I.B");
	}
}

class B5 extends A7 {
	B5() {
		System.out.println("B -> D.C");
	}
	static{
		System.out.println("B -> S.B");
	}
	{
		System.out.println("B -> I.B");
	}
}
class C3 extends B5{
	C3(){
		System.out.println("C -> D.C");
	}
	static{
		System.out.println("C -> S.B");
	}
	{
		System.out.println("C -> I.B");
	}
}