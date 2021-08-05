package com.classcore.jlc03;

class Student4 {
	int sid;
	String sname;
	String email;
	long phone;

	Student4(int id, String sn, String em, long ph) {
		System.out.println("Student 4-Arg Constructor");
		sid = id;
		sname = sn;
		email = em;
		phone = ph;
	}

	Student4(int id, String sn, String em) {
		System.out.println("Student 3-Arg Constructor");
		sid = id;
		sname = sn;
		email = em;
	}

	Student4(int id, String sn) {
		System.out.println("Student 2-Arg Constructor");
		sid = id;
		sname = sn;
	}

	Student4() {
		System.out.println("Student default constructor");
	}

	void show() {
		System.out.println(sid + "\t" + sname + "\t" + email + "\t" + phone);
	}
}

public class Lab263 {

	public static void main(String[] args) {
		Student4 stu1 = new Student4(99, "Sri", "Sri@jlc", 99999);
		stu1.show();
		Student4 stu2 = new Student4(88, "Vas", "vas@jlc");
		stu2.show();
		Student4 stu3 = new Student4(88, "SD");
		stu3.show();
		Student4 stu4 = new Student4();
		stu4.show();

	}

}
