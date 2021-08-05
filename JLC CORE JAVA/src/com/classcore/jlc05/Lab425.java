package com.classcore.jlc05;

public class Lab425 {

	public static void main(String[] args) {
		A aobj=new D();
		if(aobj instanceof C){
			C cobj=(C) aobj;
		}
		System.out.println("Hello Guys");
	}

}
