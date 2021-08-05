package com.classcore.jlc04;

public class Lab342 {

	public static void main(String[] args) {
		Hello28 h=new Hello28();
		h.show();
	}

}

class Hai13{
	static int a=10;
}
class Hello28 extends Hai13{
	static int a=20;
	void show(){
		int a=30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}