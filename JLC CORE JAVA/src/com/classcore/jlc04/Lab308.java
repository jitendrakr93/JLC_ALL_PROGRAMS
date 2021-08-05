package com.classcore.jlc04;

public class Lab308 {

	public static void main(String[] args) {
		Hai hai=new Hai();
		hai.a=99;
		Hello8 hello=new Hello8();
		System.out.println("main begin :"+hai.a);
		hello.m1(hai);
		System.out.println("main ends :"+hai.a);

	}

}
class Hello8{
	void m1(Hai hai){
		System.out.println("m1 begin : "+hai.a);
		hai.a=hai.a+10;
		System.out.println("m1 ends :"+hai.a);
	}
}
class Hai{
	int a;
}