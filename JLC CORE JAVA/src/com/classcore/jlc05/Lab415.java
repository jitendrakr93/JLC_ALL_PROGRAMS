package com.classcore.jlc05;

interface Inter8{
	void m1();
	public abstract void m2();
	int A=10;
	public final int B=20;
}
abstract class Hello8 implements Inter8{
	public void m1(){
		System.out.println("Hello -> m1():"+A);
	}
}
class Hai8 extends Hello8{
	public void m2(){
		System.out.println("Hai -> m2():"+B);
	}
	void m3(){
		System.out.println("Hai -> m3()");
	}
}
public class Lab415 {

	public static void main(String[] args) {
		Inter8 ref=new Hai8();
		ref.m1();
		ref.m2();
		//ref.m3();

	}

}
