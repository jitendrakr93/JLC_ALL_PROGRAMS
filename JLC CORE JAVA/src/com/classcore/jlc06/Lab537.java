package com.classcore.jlc06;

public class Lab537 {

	public static void main(String[] args) {
		Hello5 h=Hello5.getHello();
		System.out.println(h);
		System.out.println(Hello5.getHello());
		System.out.println(Hello5.getHello());
		//h.clone();

	}

}

class Hello5{
	private static Hello5 INS=new Hello5();
	private Hello5(){}
		public static Hello5 getHello(){
			return INS;
		}
	}
