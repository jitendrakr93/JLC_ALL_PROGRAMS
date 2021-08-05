package com.classcore.palle02;

public class Lab92 {

	public static void main(String[] args) {
		int arr[]={10,20,30,40,50,60,70,80,90,100};
		int i=0;
		for(int item : arr)
		{
			if(i%2==0)
			{
				System.out.println(item);
			}
			i++;
		}

	}

}
