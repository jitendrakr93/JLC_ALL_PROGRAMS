package com.classcore.jlc05;

class Outer3{
	int a=10;
	static int b=20;
	void show(){
		System.out.println("Outer -> show() Begin");
		class Inner{
			void m1(){
				System.out.println("Inner -> m1()");
				System.out.println(a);
				System.out.println(b);
			}
		}
		new Inner().m1();
		System.out.println("Outer -> show() End");
	}
}
public class Lab438 {

	public static void main(String[] args) {
		Outer3 out=new Outer3();
		out.show();

	}

}
