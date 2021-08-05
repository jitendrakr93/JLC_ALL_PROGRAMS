package com.classcore.jlc03;

public class Lab275 {

	public static void main(String[] args) {
		Hello_25 h=null;
		h.show();
		h=new Hello_25();
		h.show();
		Hello_25.show();

	}

}
class Hello_25{
	static void show(){
		System.out.println("static show()");
	}
}