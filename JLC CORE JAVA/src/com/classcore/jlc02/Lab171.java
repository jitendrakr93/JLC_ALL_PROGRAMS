package com.classcore.jlc02;

public class Lab171 {

	public static void main(String[] args) {
		char ch='A';
		int rows=0;
		while(rows<5)
		{
			int cols=0;
			while(cols<rows)
			{
				System.out.print(ch+" ");
				cols++;
			}
			System.out.println();
			rows++;
		}
		
	}

}
