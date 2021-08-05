package com.classcore.jlc03;
 
class Hello_5{
	static int a;
	static{
		a=10;
		System.out.println("Initialized:"+a);
	}
}
public class Lab243 {

	public static void main(String[] args) {
		System.out.println("Main:"+Hello_5.a);
	}

}
