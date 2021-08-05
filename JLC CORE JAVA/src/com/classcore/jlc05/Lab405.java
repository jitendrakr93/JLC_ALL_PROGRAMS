package com.classcore.jlc05;

abstract class Person405{
	abstract void sleeping();
	abstract void walking();
}
abstract class Student405 extends Person405{
	@Override
	void sleeping() {
		System.out.println("Student -> sleeping()");
		
	}
}
class CurrentStudent405 extends Student405{

	@Override
	void walking() {
		System.out.println("CurrentStudent -> walking()");
		
	}
	
}
public class Lab405 {

	public static void main(String[] args) {
		Person405 pob=new CurrentStudent405();
		pob.sleeping();
		pob.walking();

	}

}
