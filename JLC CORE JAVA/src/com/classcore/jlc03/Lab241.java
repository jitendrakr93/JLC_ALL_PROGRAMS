package com.classcore.jlc03;

class Hello_3{
	int a;
	{
		a=10;
		System.out.println("Initialized:"+a);
	}
}
public class Lab241 {

	public static void main(String[] args) {
		Hello_3 h=new Hello_3();
		System.out.println("Main:"+h.a);

	}

}
