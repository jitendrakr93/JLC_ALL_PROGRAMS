package com.classcore.jlc05;

public class Lab446 {

	public static void main(String[] args) {
		Student3 st1=null;
		System.out.println(st1);
		st1=new Student3(99,"Sri");
		System.out.println(st1);
		String str=new String("Java Learning Centre");
		System.out.println(str);
		Integer ref=new Integer(123);
		System.out.println(ref);

	}

}
class Student3{
	int sid;
	String name;
	Student3(int sid,String name) {
		this.sid=sid;
		this.name=name;
	}
}