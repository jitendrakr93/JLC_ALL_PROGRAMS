package com.classcore.palle08;

public class MyProgram {

	public static void main(String[] args) {
		X x1=new X();
		Y y1=new Y();
		x1.i++;
		y1.i=x1.i+y1.j;
		y1.i++;
		System.out.println(x1.i);
		System.out.println(y1.i);
		System.out.println(y1.j);

	}

}
