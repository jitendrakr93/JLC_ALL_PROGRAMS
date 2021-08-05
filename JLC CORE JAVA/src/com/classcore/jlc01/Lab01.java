package com.classcore.jlc01;
class Hello
{
	boolean b1;
	byte b2;
	short s;
	int a;
	long b;
	float f;
	double d;
	String str;
	Hello h;
	void show()
	{
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s);
		System.out.println(a);
		System.out.println(b);
		System.out.println(f);
		System.out.println(d);
		System.out.println(str);
		System.out.println(h);
	}
}
public class Lab01 {

	public static void main(String[] args) {	
		Hello h=new Hello();
		h.show();

	}

}
