package com.classcore.jlc04;

public class Lab316 {

	public static void main(String[] args) {
		Hello16 h1=new Hello16();
		//h1.m1();

	}

}
class Hello16{
	void m1(int... a){
		System.out.println("m1(int...)");
	}
	void m1(String... a){
		System.out.println("m1(String...)");
	}
}