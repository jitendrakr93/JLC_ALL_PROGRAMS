package com.classcore.jlc03;

public class Lab283 {

	public static void main(String[] args) {
		Hello_29 h=new Hello_29();
		int a=h.show(10);
		System.out.println(a);
		System.out.println(h.show(10));
		h.show(10);
		System.out.println("Hello Guys");

	}

}
class Hello_29{
	int show(int x){
		return x+1;
	}
}