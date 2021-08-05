package com.classcore.jlc03;

class Hello_6{
	static int a=10;
	{
		System.out.println("Instance Block");
	}
	static{
		System.out.println("Static Block");
	}
}
public class Lab244 {

	public static void main(String[] args) {
		System.out.println(Hello_6.a);
		System.out.println(Hello_6.a);
	}

}
