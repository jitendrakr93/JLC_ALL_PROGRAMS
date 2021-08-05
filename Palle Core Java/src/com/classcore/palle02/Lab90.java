package com.classcore.palle02;

import java.util.Arrays;

public class Lab90 {

	public static void main(String[] args) {
		int []arr={10,20,30,40,50};
		System.out.println("---Using Array predefined class of JDK---");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("---Using for loop---");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("---Using advanced for loop/enhanced for loop---");
		for(int item: arr)
		{
			System.out.println(item);
		}

	}

}
