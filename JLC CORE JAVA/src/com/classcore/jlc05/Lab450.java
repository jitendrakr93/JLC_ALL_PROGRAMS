package com.classcore.jlc05;

public class Lab450 {

	public static void main(String[] args) {
		Student6 st1=new Student6(99, "Sri");
		Student6 st2=new Student6(99, "Sri");
		Student6 st3=new Student6(88, "Manish");
		Student6 st4=st1;
		System.out.println("using == op");
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
		System.out.println(st2 == st3);
		
		System.out.println("using equals()");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println(st2.equals(st3));
	}

}
class Student6{
	int sid;
	String name;
	Student6(int sid,String name) {
		this.sid=sid;
		this.name=name;
	}
}