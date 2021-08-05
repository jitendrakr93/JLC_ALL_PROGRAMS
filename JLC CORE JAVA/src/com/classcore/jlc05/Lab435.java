package com.classcore.jlc05;


class Outer1{
	int a=11;
	class Inner{
		int a=22;
		void show(){
			System.out.println("Inner -->show()");
			int a=33;
			System.out.println(a);
			System.out.println(this.a);
			//System.out.println(super.a);
			System.out.println(Outer1.this.a);
		}
	}
}
public class Lab435 {

	public static void main(String[] args) {
		new Outer1().new Inner().show();

	}

}
