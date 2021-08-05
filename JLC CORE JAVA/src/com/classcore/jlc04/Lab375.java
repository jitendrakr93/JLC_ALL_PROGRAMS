package com.classcore.jlc04;

public class Lab375 {

	public static void main(String[] args) {
		B375 bobj=new B375();
		bobj.show(99);
		bobj.show("JLC");

	}

}
class A375{
	void show(int ab){
		System.out.println("A -> show (int) ");
	}
}
class B375 extends A375{
	void show(String ab){
		System.out.println("B -> show(String)");
	}
}