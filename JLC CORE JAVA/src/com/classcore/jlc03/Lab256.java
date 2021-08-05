package com.classcore.jlc03;

class Hello_17{
	{
		int a=10;
		System.out.println("I.Block:"+a);
	}
	static{
		int a=10;
		System.out.println("S.Block:"+a);
	}
}
public class Lab256 {

	public static void main(String[] args) {
		Hello_17 h=new Hello_17();
		//System.out.println("Main:"+h.a);

	}

}
