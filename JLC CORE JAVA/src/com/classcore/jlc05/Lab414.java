package com.classcore.jlc05;

interface Inter6{
	void m1();
	public abstract void m2();
	int A=10;
	public final int B=20;
}
class Hello7 implements Inter6{
	public void m1(){
		System.out.println("Hello -> m1():"+A);
	}
	public void m2(){
		System.out.println("Hello -> m2():"+B);
	}
}
public class Lab414 {

	public static void main(String[] args) {
		Inter6 ref=null;
		//ref=new Inter6();
		ref=new Hello7();
		ref.m1();
		ref.m2();

	}

}
