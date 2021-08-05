package com.classcore.jlc05;

abstract class Person{
	public abstract void sleeping();
}

class Student extends Person{

	public void sleeping() {
		System.out.println("Student -> sleeping");
		
	}
	
}
public class Lab439 {

	public static void main(String[] args) {
		Person p=new Student();
		p.sleeping();

	}

}
