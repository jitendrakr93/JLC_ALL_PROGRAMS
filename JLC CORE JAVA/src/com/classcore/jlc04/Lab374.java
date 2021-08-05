package com.classcore.jlc04;

public class Lab374 {

	public static void main(String[] args) {
		B374 bobj=new B374();
		bobj.show();
		bobj.SHOW();

	}

}
class A374{
	void show(){
		System.out.println("A -> show()");
	}
}
class B374 extends A374{
	void SHOW(){
		System.out.println("B -> SHOW()");
	}
}