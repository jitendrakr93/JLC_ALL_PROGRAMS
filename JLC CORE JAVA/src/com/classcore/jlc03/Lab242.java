package com.classcore.jlc03;

class Hello_4{
	static int a;
	{
		a=10;
		System.out.println("Initialized:"+a);
	}
}
public class Lab242 {

	public static void main(String[] args) {
		Hello_4 h=new Hello_4();
		System.out.println("Main:"+Hello_4.a);

	}

}
