package com.classcore.jlc04;

public class Lab311 {

	public static void main(String[] args) {
		Hello11 h=new Hello11();
		h.sum(12,23);
		h.sum(12,32,43);
	}

}
class Hello11{
	void sum(int a,int b){
		System.out.println("--sum(int,int)");
		System.out.println(a+b);
	}
	void sum(int a,int b,int c){
		System.out.println("--sum(int,int,int)");
		System.out.println(a+b+c);
	}
}