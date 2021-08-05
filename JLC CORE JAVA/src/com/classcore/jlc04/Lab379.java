package com.classcore.jlc04;

public class Lab379 {

	public static void main(String[] args) {
		Hai379 hai=new Hai379();
		hai.m1();

	}

}
class Hello379{
	A379 m1(){
		return new A379();
	}
}
class Hai379 extends Hello379{
	B379 m1(){
		return new B379();
	}
}
class A379{}
class B379 extends A379{}