package com.classcore.jlc04;

public class Lab303 {

	public static void main(String[] args) {
		Hello3 h=new Hello3();
		byte b=20;
		//h.add(b, b);/*Ambiguity problem*/

	}

}
class Hello3{
	void add(byte a,int b){
		System.out.println("add(byte,int)");
	}
	void add(int a,byte b){
		System.out.println("add(int,byte");
	}
}