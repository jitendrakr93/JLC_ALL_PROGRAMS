package com.classcore.jlc03;

class Hello5{
	static int b;
}
public class Lab232 {

	public static void main(String[] args) {
		Hello5 h=new Hello5();
		System.out.println(h.b);
		h.b=99;
		System.out.println(h.b);

	}

}
