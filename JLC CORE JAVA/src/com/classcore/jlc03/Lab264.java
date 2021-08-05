package com.classcore.jlc03;

class Student5{
	int sid;
	String sname;
	Student5(int id,String sn) {
		System.out.println("Student 2-Arg Constructor");
		sid=id;
		sname=sn;
	}
	Student5(){
		System.out.println("Student default constructor");
	}
	void show()
	{
		System.out.println(sid+"\t"+sname);
	}
}
public class Lab264 {

	public static void main(String[] args) {
		Student5 stu=new Student5();
		/*WE CANT CALL CONSTRUCTOR BY USING OBJECT*/
		//stu.Student5(77,"SD");
		stu.show();

	}

}
