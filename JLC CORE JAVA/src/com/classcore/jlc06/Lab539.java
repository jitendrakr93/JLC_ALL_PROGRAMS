package com.classcore.jlc06;

public class Lab539 {
	public static void main(String[] args) {
		Hello7 h=Hello7.getHello();
		System.out.println(h);
		System.out.println(Hello7.getHello());
		System.out.println(Hello7.getHello());
	}
}

class Hello7{
	private static Hello7 INS=null;
	private Hello7(){}
	public static Hello7 getHello(){
		if(INS == null)
			INS=new Hello7();
		return INS;
	}
}