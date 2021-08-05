package com.classcore.jlc03;

class Hello_7{
	static int a=10;
	{
		System.out.println("Instance Block");
	}
	static
	{
		System.out.println("Static Block");
	}
}
public class Lab245 {

	public static void main(String[] args) {
		Hello_7 h=null;
		System.out.println("Reference Created");

	}

}
