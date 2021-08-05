package com.classcore.jlc05;

public class Lab443 {

	public static void main(String[] args) {
		showClassInfo("JLC");
		Student1 stu = new Student1();
		showClassInfo(stu);
		Object obj = new Object();
		showClassInfo(obj);
	}

	static void showClassInfo(Object obj) {
		Class cls = obj.getClass();
		System.out.println("Class Name :" + cls.getName());
		Class scls = cls.getSuperclass();
		if (scls != null)
			System.out.println("Super Class :" + scls.getName());
		else
			System.out.println("No Super Class");
	}
}
class Person4{}
class Student1 extends Person4{}