package com.classcore.jlc04;

public class Lab325 {

	public static void main(String[] args) {
		Hai5 hai=new Hai5();
		System.out.println(hai.a);
		
		Hello21 hello=new Hello21();
		System.out.println(hello.a);
		System.out.println(hello.b);

	}

}
class Hai5{
	int a=99;
}
class Hello21 extends Hai5{
	int b=88;
}