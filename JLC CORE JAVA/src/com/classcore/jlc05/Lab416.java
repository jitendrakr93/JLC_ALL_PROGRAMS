package com.classcore.jlc05;

interface Inter9{
	void m1();
	int A=10;
}
interface Inter10{
	void m2();
	int B=11;
}
class Hello9 implements Inter9,Inter10{
	public void m1(){
		System.out.println("Hello -> m1()");
	}
	public void m2(){
		System.out.println("Hello -> m2()");
	}
}
public class Lab416 {

	public static void main(String[] args) {
		Hello9 h=new Hello9();
		System.out.println(h.A);
		System.out.println(h.B);
		h.m1();
		h.m2();

	}

}
