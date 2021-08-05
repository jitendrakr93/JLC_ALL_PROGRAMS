package com.classcore.jlc05;

public class Lab451 {

	public static void main(String[] args) {
		Student7 st1=new Student7(99, "Sri");
		Student7 st2=new Student7(99, "Sri");
		Student7 st3=new Student7(88, "Manish");
		Student7 st4=st1;
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

class Student7 {
	int sid;
	String sname;

	public Student7(int sid, String name) {
		this.sid = sid;
		this.sname = sname;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Student7) {
			Student7 st = (Student7) obj;
			return this.sid == st.sid && this.sname.equals(st.sname);
		}
		return false;
	}
}