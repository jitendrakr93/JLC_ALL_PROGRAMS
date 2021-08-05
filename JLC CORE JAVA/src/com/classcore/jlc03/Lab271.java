package com.classcore.jlc03;

public class Lab271 {

	public static void main(String[] args) {
		Hello_21 h=new Hello_21(99);
		h.show();
	}

}
class Hello_21{
	int a;
	Hello_21(){
		System.out.println("Hello DC");
	}
	Hello_21(int a){
		this();
		System.out.println("Hello 1-Arg Con");
		this.a=a;
	}
	void show()
	{
		System.out.println(a);
	}
}