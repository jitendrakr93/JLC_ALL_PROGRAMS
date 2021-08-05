package com.classcore.jlc03;

class Hello_8{
	{
		System.out.println("Instance Block");
	}
	static
	{
		System.out.println("Static Block");
	}
}
public class Lab246 {

	public static void main(String[] args) {
		Hello_8 h=null;
		System.out.println("Reference Created");
		h=new Hello_8();

	}

}
