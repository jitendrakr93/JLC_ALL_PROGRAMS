package com.classcore.jlc05;

public class Lab444 {

	public static void main(String[] args) {
		System.out.println("\n*** With Student");
		Student2 st1=new Student2(99, 31903290);
		Student2 st2=new Student2(99, 31903290);
		Student2 st3=new Student2(88, 65799999);
		Student2 st4=st1;
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
		System.out.println(st3 == st4);

	}

}
class Student2{
	int sid;
	long phone;
	Student2(int sid, long phone){
		this.sid=sid;
		this.phone=phone;
	}
}