package com.classcore.jlc05;

abstract class Person406{
	abstract void sleeping();
}
abstract class Student406 extends Person406{
	@Override
	void sleeping() {
		System.out.println("Student -> sleeping()");
		
	}
}
class CurrentStudent406 extends Student406{}
public class Lab406 {

	public static void main(String[] args) {
		Person406 pob=new CurrentStudent406();
		pob.sleeping();

	}

}
