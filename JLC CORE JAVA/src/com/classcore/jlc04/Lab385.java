package com.classcore.jlc04;

public class Lab385 {

	public static void main(String[] args) {
		new B385().m1();

	}

}
class A385{
	void m1(){}
	void m2(){}
	void m3(){}
}
class B385 extends A385{
	void m1(){}
	protected void m2(){}
	public void m3(){}
}