package com.classcore.palle02;

public class Lab95 {

	public static void main(String[] args) {
		int a[]={10,2,45,86,46,100,15,20,49,200,4000};
		int big=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>big)
			{
				big=a[i];
			}
		}
		System.out.println("Max :"+big);
	}

}
