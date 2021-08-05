package com.classcore.palle02;

public class Lab83 {

	public static void main(String[] args) {
		int arr[]=new int[5];
		System.out.println(arr[0]);
		//System.out.println(arr[5]);
		arr[0]=10;
		arr[1]=arr[0]*2;
		arr[2]=arr[0]+arr[1];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
