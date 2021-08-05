package com.classcore.jlc04;

public class Lab378 {

	public static void main(String[] args) {
		Hai378 hai=new Hai378();
		hai.m1();

	}

}
class Hello378{
	A378 m1(){
		return new A378();
	}
}
class Hai378 extends Hello378{
	A378 m1(){
		return new A378();
	}
}
class A378{}
class B378 extends A378{}