package com.classcore.jlc03;

public class Lab297 {

	public static void main(String[] args) {
		Hello_43 h=new Hello_43();
		int a=h.add(10,20);
		System.out.println(a);
		int b=h.add(10, 20, 30);
		System.out.println(b);
	}

}
class Hello_43{
	int add(int a,int b){
		System.out.println("add(int,int)");
		return a+b;
	}
	int add(int a,int b,int c){
		System.out.println("add(int,int,int)");
		return a+b+c;
	}
}