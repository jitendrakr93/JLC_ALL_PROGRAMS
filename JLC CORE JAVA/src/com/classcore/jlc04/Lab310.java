package com.classcore.jlc04;

public class Lab310 {

	public static void main(String[] args) {
		Hello10 h=new Hello10();
		h.sum(12, 23);

	}

}
class Hello10{
	void sum(int a,int b){
		System.out.println("--sum(int,int)");
		System.out.println(a+b);
	}
}