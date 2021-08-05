package com.classcore.jlc08;

public class Lab730 {

	public static void main(String[] args) {
		Student6 st=new Student6("Sri");
		System.out.println(st);
		Student6 st1=new Student6(99,"Sri");
		System.out.println(st1);

	}

}
class Student6{
	int sid;
	String name;
	public Student6(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}
	@Deprecated
	public Student6(String name) {}
	public String toString(){
		return sid+"\t"+name;
	}
	
}