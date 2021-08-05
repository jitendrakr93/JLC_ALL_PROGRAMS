package com.classcore.jlc03;

class Student2{
	int sid;
	String sname;
	 Student2() {
		System.out.println("Student default constructor");
	}
	 void show()
	 {
		 System.out.println(sid+"\t"+sname);
	 }
}
public class Lab261 {

	public static void main(String[] args) {
		Student2 stu=new Student2();
		stu.sid=99;
		stu.sname="Srinivas";
		stu.show();

	}

}
