package com.classcore.jlc06;

public class Lab560 {

	public static void main(String[] args) {
		System.out.println("Main() Started");
		new Hello2().show("0");
		System.out.println("Main() Completed");

	}

}
class Hello2{
	void show(String str){
		System.out.println("show() called");
	
	try{
		System.out.println("try block started");
		int a=Integer.parseInt(str);
		int b=10/a;
		System.out.println("try block completed :"+b);
	}catch(ArithmeticException e){
		System.out.println("catch block");
		System.exit(0);
	}finally {
		System.out.println("finally block");
	}
	}
}