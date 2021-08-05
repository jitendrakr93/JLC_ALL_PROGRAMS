package com.classcore.jlc04;

public class Lab343 {

	public static void main(String[] args) {
		Hello29.show();
	}

}

class Hai14{
	static int a=10;
}
class Hello29 extends Hai14{
	static int a=20;
	static void show(){
		int a=30;
		System.out.println(a);
		//System.out.println(this.a);
		//System.out.println(super.a);
		System.out.println(Hello29.a);
		System.out.println(Hai14.a);
	}
}