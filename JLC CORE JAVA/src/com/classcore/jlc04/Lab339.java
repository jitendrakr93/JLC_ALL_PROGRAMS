package com.classcore.jlc04;

public class Lab339 {

	public static void main(String[] args) {
		new C1();

	}

}

class A5 {
	A5() {
		System.out.println("A -> D.C");
	}
}

class B4 extends A5 {
	B4() {
		System.out.println("B -> D.C");
	}
}
class C1 extends B4{
	C1(){
		System.out.println("C -> D.C");
	}
}