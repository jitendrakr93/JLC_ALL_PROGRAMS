package com.classcore.jlc05;

interface Inter433{}
class A433 implements Inter433{}
class B433 extends A433{}
class C433 extends A433{}

public class Lab433 {

	public static void main(String[] args) {
		Inter433 arr[]=new B433[3];
		arr[0]=new B433();
		arr[1]=new B433();
		arr[2]=new C433();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
