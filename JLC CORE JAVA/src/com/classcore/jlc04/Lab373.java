package com.classcore.jlc04;

class Hello373{
	void m1(){
		System.out.println("Hello -> m1()");
	}
	void m2(){
		System.out.println("Hello -> m2() ");
	}
}
class Hai373 extends Hello373{
	void m2(){
		System.out.println("Hai -> m2()");
	}
	void m3(){
		System.out.println("Hai -> m3()");
	}
}
public class Lab373 {

	public static void main(String[] args) {
		Hai373 hai=new Hai373();
		hai.m1();
		hai.m3();
		hai.m2();

	}

}
