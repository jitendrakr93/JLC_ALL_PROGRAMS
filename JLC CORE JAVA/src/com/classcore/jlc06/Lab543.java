package com.classcore.jlc06;

public class Lab543 {

	public static void main(String[] args) {
		Student10 st=new Student10(99, "Srinivas", 65799999);
		System.out.println(st);

	}

}
final class Student10{
	private final int sid;
	private final String name;
	private final long phone;
	public Student10(int sid, String name, long phone) {
		super();
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}
	public int getSid() {
		return sid;
	}
	public String getName() {
		return name;
	}
	public long getPhone() {
		return phone;
	}
	@Override
	public String toString() {
		return "Sid :"+sid+", Name :"+name+", Phone :"+phone;
	}
	
	
}