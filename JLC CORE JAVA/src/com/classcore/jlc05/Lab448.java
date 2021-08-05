package com.classcore.jlc05;

public class Lab448 {

	public static void main(String[] args) {
		Student5 st1=new Student5(99, "Sri");
		Student5 st2=new Student5(88, "Nivas");
		System.out.println(st1);
		System.out.println(st2);

	}

}

class Student5{
	int sid;
	String name;
	Student5(int sid,String name) {
		this.sid=sid;
		this.name=name;
	}
	public String toString(){
		return sid+"\t"+name;
	}
}