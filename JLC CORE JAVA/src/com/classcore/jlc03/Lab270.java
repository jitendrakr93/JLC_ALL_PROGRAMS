package com.classcore.jlc03;

public class Lab270 {

	public static void main(String[] args) {
		Student8 stu1=new Student8(88,"Srinivas");
		stu1.show();
		Student8 stu2=new Student8(99,"Dande");
		stu2.show();
	}

}

class Student8 {
	int sid;
	String sname;

	Student8(int sid, String sname) {
		System.out.println("Student 2-Arg constructor");
		this.sid = sid;
		this.sname = sname;
	}

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}