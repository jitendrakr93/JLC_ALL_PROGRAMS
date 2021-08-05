package com.classcore.jlc07;
import java.util.Arrays;

public class Lab672 {

	public static void main(String[] args) {
		int arr[]=new int[]{12,32,34};
		System.out.println("Len :"+arr.length);
		System.out.println(Arrays.toString(arr));
		arr=Arrays.copyOf(arr, 5);
		System.out.println("Len :"+arr.length);
		System.out.println(Arrays.toString(arr));

	}

}
