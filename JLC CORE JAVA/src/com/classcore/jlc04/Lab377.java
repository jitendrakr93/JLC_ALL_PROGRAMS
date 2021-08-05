package com.classcore.jlc04;

public class Lab377 {

	public static void main(String[] args) {
		Hai377 hai=new Hai377();
		hai.m1();

	}

}
class Hello377{
	A377 m1(){
		return new A377();
	}
}
class Hai377 extends Hello377{
	/*B377 m1(){
		return new B377();
	}*/
}
class A377{}
class B377{}