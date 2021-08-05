package com.classcore.jlc03;

class Student1
{
	int sid;
	String sname;
	void show(){
		System.out.println(sid+"\t"+sname );
	}
}
public class Lab260 {

	public static void main(String[] args) {
		Student1 stu1=new Student1();
		stu1.show();
		Student1 stu2=new Student1();
		stu2.show();
	}

}
