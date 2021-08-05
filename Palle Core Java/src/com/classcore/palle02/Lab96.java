package com.classcore.palle02;

public class Lab96 {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==10)
				{
					System.out.println(arr[i]+"+"+arr[j]+"=10");
				}
			}
		}

	}

}
