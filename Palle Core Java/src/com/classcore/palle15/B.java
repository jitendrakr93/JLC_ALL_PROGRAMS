package com.classcore.palle15;

public class B {
	public void f1(A a1,A a2)
	{
		a2=new A();
		a2.y=200;
		a1.x=a1.x+a1.y+a2.x+a2.y;
	}
}
