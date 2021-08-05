package com.classcore.jlc04;

public class Lab307 {

	public static void main(String[] args) {
	int a=99;
	Hello7 h=new Hello7();
	System.out.println("main begin:"+a);
	h.m1(a);
	System.out.println("main ends:"+a);

	}

}
class Hello7{
	void m1(int a){
		System.out.println("m1 begin:"+a);
		a=a+10;
		System.out.println("m1 ends:"+a);
	}
}