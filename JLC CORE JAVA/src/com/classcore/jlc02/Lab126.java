package com.classcore.jlc02;

class Hello_cls{}
public class Lab126 {

	public static void main(String[] args) {
		Object obj=new Hello_cls();
		System.out.println(obj instanceof String);
		System.out.println(obj instanceof Hello_cls);
		System.out.println(obj instanceof Object);

	}

}
