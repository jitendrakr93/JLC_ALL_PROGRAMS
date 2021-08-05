package com.classcore.jlc07;
import java.util.Formatter;

public class Lab684 {

	public static void main(String[] args) {
		Formatter fmt1=new Formatter();
		String name="Srinivas";
		int age=23;
		fmt1.format("My Name is %s and age is %d",name,age);
		System.out.println(fmt1);
		Formatter fmt2=new Formatter();
		fmt2.format("%c - %f - %b %n%05d -%o -%x","C",99.99,true,3456,3456,3456);
		System.out.println(fmt2);

	}

}
