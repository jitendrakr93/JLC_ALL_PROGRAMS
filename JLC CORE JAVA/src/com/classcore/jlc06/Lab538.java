package com.classcore.jlc06;

public class Lab538 {

	public static void main(String[] args) {
		Hello6 h=Hello6.getHello();
		System.out.println(h);
		System.out.println(Hello6.getHello());
		System.out.println(Hello6.getHello());

	}

}
class Hello6{
	private static Hello6 INS=null;
	static{
		INS=new Hello6();
	}
	private Hello6(){}
	public static Hello6 getHello(){
		return INS;
	}
}