package com.classcore.jlc04;

public class Lab301 {

	public static void main(String[] args) {
		Hello1 h=new Hello1();
		byte b=20;
		h.add(b, 10);
		//h.add(10, 10);

	}

}
class Hello1{
	void add(byte a,int b){
		System.out.println("add(byte,int)");
	}
}