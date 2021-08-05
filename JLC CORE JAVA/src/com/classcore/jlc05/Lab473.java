package com.classcore.jlc05;

public class Lab473 {

	public static void main(String[] args) {
		Student9 stu=new Student9();
		String st1=String.valueOf(stu);
		System.out.println(st1);
		Employee9 emp=new Employee9();
		String st2=String.valueOf(emp);
		System.out.println(st2);

	}

}
class Student9{

}
class Employee9{
	int eid;
	@Override
	public String toString() {
		return "Eid :"+eid;
	}
}