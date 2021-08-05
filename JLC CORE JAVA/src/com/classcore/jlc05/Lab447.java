package com.classcore.jlc05;

public class Lab447 {

	public static void main(String[] args) {
		Student4 st1 = new Student4(99, "Sri");
		System.out.println(st1);
		System.out.println("\n*** Default Implementation***");
		String cname = st1.getClass().getName();
		int hc = st1.hashCode();
		String hx = Integer.toHexString(hc);
		String msg = cname + "@" + hx;
		System.out.println(msg);

	}

}

class Student4 {
	int sid;
	String name;

	Student4(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}
}