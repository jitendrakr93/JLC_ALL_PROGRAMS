package com.classcore.jlc04;

public class Lab341 {

	public static void main(String[] args) {
		Hello27 h=new Hello27();
		h.show();
	}

}

class Hai12{
	int a=10;
}
class Hello27 extends Hai12{
	int a=20;
	void show(){
		int a=30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}