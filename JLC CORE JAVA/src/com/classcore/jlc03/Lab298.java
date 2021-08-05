package com.classcore.jlc03;

public class Lab298 {

	public static void main(String[] args) {
		Hello_44 h=new Hello_44();
		int a=h.add(10, 20);
		System.out.println(a);
		String b=h.add("JLC",99);
		System.out.println(b);
	}

}
class Hello_44{
	int add(int a,int b){
		System.out.println("add(int,int)");
		return a+b;
	}
	String add(String a,int b){
		System.out.println("add(String,int)");
		return a+b;
	}
}