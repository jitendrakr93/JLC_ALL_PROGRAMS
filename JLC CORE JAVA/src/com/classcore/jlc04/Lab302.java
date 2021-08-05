package com.classcore.jlc04;

public class Lab302 {

	public static void main(String[] args) {
		Hello2 h=new Hello2();
		byte b=20;
		h.add(b, 10);
		h.add(10, b);

	}

}
class Hello2{
	void add(byte a,int b){
		System.out.println("add(byte,int)");
	}
	void add(int a,byte b){
		System.out.println("add(int,byte");
	}
}