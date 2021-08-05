package com.classcore.jlc03;

class Hello_9{
	{
		System.out.println("Instance Block");
	}
	static
	{
		System.out.println("Static Block");
	}
}
public class Lab247 {

	public static void main(String[] args) {
		Hello_9 h=new Hello_9();
		new Hello_9();

	}

}
