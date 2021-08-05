package com.classcore.jlc03;

public class Lab224 {

	public static void main(String[] args) {
		int arr[][]=null;
		arr=new int[][]{{10,23,21},{12},{23,43,12,32},{98,34,32}};
		for(int ar[]:arr)
		{
			for(int a:ar)
			{
				System.out.print("\t"+a);
			}
			System.out.println();
		}

	}

}
