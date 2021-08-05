package com.classcore.jlc04;

public class Lab324 {

	public static void main(String[] args) {
		Hai4 hai=new Hai4();
		System.out.println(hai.a);
		//System.out.println(hai.b);
		
		Hello20 hello=new Hello20();
		System.out.println(hello.a);
		System.out.println(hello.b);

	}

}
class Hai4{
	int a=99;
}
class Hello20 extends Hai4{
	int b=88;
}