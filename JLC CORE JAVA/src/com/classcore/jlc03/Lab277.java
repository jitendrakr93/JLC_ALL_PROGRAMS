package com.classcore.jlc03;

public class Lab277 {

	public static void main(String[] args) {
		Hello_27.show();

	}

}
class Hello_27{
	int a;
	static int b;
	static void show(){
		/*We can't access non static variable inside static area directly*/
		//System.out.println(a);
		System.out.println(b);
	}
}