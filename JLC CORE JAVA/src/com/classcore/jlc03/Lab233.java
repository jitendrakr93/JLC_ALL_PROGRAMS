package com.classcore.jlc03;

class Hello6{
	static int b;
}
public class Lab233 {

	public static void main(String[] args) {
		Hello6 h1=new Hello6();
		Hello6 h2=new Hello6();
		System.out.println(h1.b+"\t"+h2.b);
		h1.b=99;
		System.out.println(h1.b+"\t"+h2.b);
	}

}
