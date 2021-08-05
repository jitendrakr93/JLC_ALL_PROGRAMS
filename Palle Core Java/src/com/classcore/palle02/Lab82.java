package com.classcore.palle02;

public class Lab82 {

	public static void main(String[] args) {
		int evenCount=0;
		int oddCount=0;
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int) (Math.random()*1000);
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("Total even :"+evenCount+" Total odd :"+oddCount);
	}

}
