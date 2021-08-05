package com.classcore.jlc03;

public class Lab299 {

	public static void main(String[] args) {
		Hello_45 h=new Hello_45();
		String a=h.add(99,"JLC");
		System.out.println(a);
		String b=h.add("JLC", 99);
		System.out.println(b);

	}

}
class Hello_45{
	String add(int b,String a){
		System.out.println("add(int,String)");
		return a+b;
	}
	String add(String a,int b){
		System.out.println("add(String,int)");
		return a+b;
	}
}