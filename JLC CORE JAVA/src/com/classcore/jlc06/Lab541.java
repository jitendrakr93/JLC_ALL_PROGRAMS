package com.classcore.jlc06;

public class Lab541 {

	public static void main(String[] args) {
		for (int i = 0; i <10; i++) {
			System.out.println(Hello9.getHello());
		}

	}

}
class Hello9{
	private static Hello9 h1=new Hello9();
	private static Hello9 h2=new Hello9();
	private Hello9(){}
	public static Hello9 getHello(){
		if(Math.random()>0.5)
			return h1;
		else
			return h2;
	}
}