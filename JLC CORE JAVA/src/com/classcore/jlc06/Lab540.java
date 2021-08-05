package com.classcore.jlc06;

public class Lab540 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Hello8.getHello());
		}

	}

}

class Hello8{
	private static Hello8 h1=new Hello8();
	private static Hello8 h2=new Hello8();
	private Hello8(){}
	public static Hello8 getHello(){
		if(Math.random()>0.5)
			return h1;
		else
			return h2;
	}
}