package com.classcore.palle02;

public class Lab68 {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=10;j++)
			{
				k=11-i;
				if(j<=i || j>=k)
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print("");
				}
			}
			System.out.println();
		}

	}

}
