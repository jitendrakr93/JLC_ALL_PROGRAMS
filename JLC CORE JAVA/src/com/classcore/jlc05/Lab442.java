package com.classcore.jlc05;

abstract class Person3 {
	public abstract void sleeping();
}

public class Lab442 {

	public static void main(String[] args) {
		 Person2 stu=new Person2() {

			@Override
			public void sleeping() {
				System.out.println("Student ->sleeping");
				
			}};
			stu.sleeping();
	}
}
