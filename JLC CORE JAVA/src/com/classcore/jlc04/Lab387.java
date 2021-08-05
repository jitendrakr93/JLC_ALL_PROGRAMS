package com.classcore.jlc04;

public class Lab387 {

	public static void main(String[] args) {
		new B387().m1();

	}

}
class A387{
	protected void m1(){}
	protected void m2(){}
}
class B387 extends A387{
	protected void m1(){}
	public void m2(){}
}