package com.classcore.jlc03;

public class Lab267 {

	public static void main(String[] args) {
		Hello_19 h=new Hello_19();
		h.show();

	}

}
class Hello_19{
	int a=10;
	void show(){
		String a="JLC";
		System.out.println(a);
		System.out.println(this.a);
	}
}