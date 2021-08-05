package com.classcore.palle02;

public class Lab85 {

	public static void main(String[] args) {
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=1000-(i*100);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
