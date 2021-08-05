package com.classcore.jlc04;

public class Lab398 {

	public static void main(String[] args) {
		A398 aobj=new B398();
		System.out.println(aobj.x);

	}

}
class A398{
	int x=10;
}
class B398 extends A398{
	String x="JLC";
}