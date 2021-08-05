package com.classcore.jlc05;

abstract class Hello408{
	int a;
	Hello408(int a) {
		System.out.println("Hello (int) Cons");
		this.a=a;
	}
	{
		System.out.println("Hello408 -> 408");
	}
	void show(){
		System.out.println("Hello408 -> show()");
	}
}
class Hai408 extends Hello408{
	Hai408(int a) {
		super(a);
	}
}
public class Lab408 {

	public static void main(String[] args) {
		Hai408 hai=new Hai408(10);
		hai.show();
	}

}
