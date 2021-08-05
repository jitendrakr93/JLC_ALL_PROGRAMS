package com.classcore.jlc02;

public class Lab187 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i==3)
					continue;
				System.out.println(i+"\t"+j);
			}
		}

	}

}
