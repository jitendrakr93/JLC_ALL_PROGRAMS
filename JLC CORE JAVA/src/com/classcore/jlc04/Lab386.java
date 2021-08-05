package com.classcore.jlc04;

public class Lab386 {

	public static void main(String[] args) {
		new B386().m1();

	}

}
class A386{
	protected void m1(){}
	protected void m2(){}
}
class B386 extends A386{
	/*private void m1(){}
	void m2(){}*/
}