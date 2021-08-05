package com.classcore.jlc04;

public class Lab336 {

	public static void main(String[] args) {
		new Hello25();
	}

}
class Hai10{
	int a=99;
	{
		System.out.println("Hai -> I.B :"+a);
	}
}
class Hello25 extends Hai10{
	int b=88;
	{
		System.out.println("Hello -> I.B :"+a);
		System.out.println("Hello -> I.B :"+b);
	}
}