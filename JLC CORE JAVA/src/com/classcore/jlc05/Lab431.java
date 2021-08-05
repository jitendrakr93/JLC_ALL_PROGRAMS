package com.classcore.jlc05;

interface Inter431{}
class A431 implements Inter431{}
class B431 extends A431{}
class C431 extends A431{}
public class Lab431 {

	public static void main(String[] args) {
		Inter431 arr[]=new Inter431[3];
		arr[0]=new A431();
		arr[1]=new B431();
		arr[2]=new C431();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
