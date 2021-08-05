package com.classcore.jlc03;

class Student3{
	int sid;
	String sname;
	public Student3(int id,String sn) {
		System.out.println("Student 2-Arg Constructor");
		sid=id;
		sname=sn;
	}
	void show(){
		System.out.println(sid+"\t"+sname);
	}
}
public class Lab262 {

	public static void main(String[] args) {
		Student3 stu1=new Student3(88,"Srinivas");
		stu1.show();
		Student3 stu2=new Student3(99,"Dande");
		stu2.show();
		System.out.println(stu1.sid);

	}

}
