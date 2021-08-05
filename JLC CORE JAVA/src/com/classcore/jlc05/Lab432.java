package com.classcore.jlc05;

interface Inter432{}
class A432 implements Inter432{}
class B432 extends A432{}
class C432 extends A432{}
public class Lab432 {

	public static void main(String[] args) {
		Inter432 arr[]=null;
		arr=new B432[3];
		arr[0]=new A432();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
