package com.classcore.jlc03;

class Student6{
	int sid;
	String sname;
	Student6(int id,String sn) {
		System.out.println("Student 2-Arg Constructor");
		sid=id;
		sname=sn;
	}
	Student6(){
		System.out.println("Student default constructor");
	}
	void show()
	{
		System.out.println(sid+"\t"+sname);
	}
}
public class Lab265 {

	public static void main(String[] args) {
		Student6 stu=new Student6();
		//stu.Student6(77,"SD");
		stu.show();
		//Student6 st1=new Student6(88,"MK");
	}

}
