package com.classcore.jlc03;

public class Lab268 {

	public static void main(String[] args) {
		Hello_20 h=new Hello_20();
		h.show();

	}

}
class Hello_20{
	int a=10;
	static int b=20;
	void show(){
		String a="JLC";
		String b="SD";
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(Hello_20.b);
	}
}