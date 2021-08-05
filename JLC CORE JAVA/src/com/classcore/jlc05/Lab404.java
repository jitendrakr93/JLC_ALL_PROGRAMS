package com.classcore.jlc05;

abstract class Shape404{
	abstract void area();
}
class Square404 extends Shape404{

	@Override
	void area() {
		System.out.println("Square -> area()");
	}
	
}
public class Lab404 {

	public static void main(String[] args) {
		Shape404 sp=new Square404();
		sp.area();

	}

}
