package com.classcore.jlc04;

public class Lab326 {

	public static void main(String[] args) {
		
		Hello22 hello=new Hello22();
		hello.m1();
		hello.m2();

	}

}
class Hai6{
	int a=99;
	void m1(){
		System.out.println("Hai->m1 :"+a);
		//System.out.println("Hai->m1 :"+b);
	}
}
class Hello22 extends Hai6{
	int b=88;
	void m2(){
		System.out.println("Hai->m2 :"+a);
		System.out.println("Hai->m2 :"+b);
	}
}