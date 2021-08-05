package com.classcore.jlc02;

public class Lab193 {

	public static void main(String[] args) {
		int arr[];
		arr=new int[3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println();
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
