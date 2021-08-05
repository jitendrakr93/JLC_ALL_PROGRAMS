package com.classcore.jlc05;

interface inter421{
	void show();
}
class A1{
	public void show(){
		System.out.println("A -> show()");
	}
}
class B1 extends A1 implements inter421{}
public class Lab421 {

	public static void main(String[] args) {
		B1 ref=new B1();
		ref.show();

	}

}
