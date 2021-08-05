package com.classcore.jlc02;

public class Lab197 {

	public static void main(String[] args) {
		byte b=5;
		int arr1[]=new int[b];
		short s=4;
		int arr2[]=new int[s];
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		char ch='A';
		int arr3[]=new int[ch];
		System.out.println(arr3.length);
		int arr4[]=new int[5];
		System.out.println(arr4.length);
		int arr5[]=new int[10+20/5];
		System.out.println(arr5.length);
		double d=12.345;
		int arr6[]=new int[(int)d];
		System.out.println(arr6.length);

	}

}
