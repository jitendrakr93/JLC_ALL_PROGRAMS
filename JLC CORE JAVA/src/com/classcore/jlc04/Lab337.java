package com.classcore.jlc04;

public class Lab337 {

	public static void main(String[] args) {
		Hello26 h= new Hello26();
	}

}
class Hai11{
	{
		System.out.println("Hai -> I.B");
	}
	static{
		System.out.println("Hai -> S.B");
	}
}
class Hello26 extends Hai11{
	{
		System.out.println("Hello -> I.B ");
	}
	static{
		System.out.println("Hello -> S.B");
	}
}