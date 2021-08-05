package com.classcore.jlc04;

public class Lab309 {

	public static void main(String[] args) {
		Hai2 hai=new Hai2();
		hai.a=99;
		Hello9 hello=new Hello9();
		System.out.println("main begin:"+hai.a);
		hello.m1(hai);
		System.out.println("main ends:"+hai.a);
	}

}
class Hello9{
	void m1(Hai2 hai){
		System.out.println("me begin:"+hai.a);
		hai=new Hai2();
		hai.a=hai.a+10;
		System.out.println("m1 ends:"+hai.a);
	}
}
class Hai2{
	int a;
}