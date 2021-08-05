package com.classcore.jlc04;

public class Lab383 {

	public static void main(String[] args) {
		new B383().m1();

	}

}
class A383{
	private void m1(){}
}
class B383 extends A383{
	int m1(){
		return 0;
	}
	
}