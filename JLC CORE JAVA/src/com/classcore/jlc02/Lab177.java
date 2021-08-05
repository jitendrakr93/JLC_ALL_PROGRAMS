package com.classcore.jlc02;

public class Lab177 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			if(i==5)
				break;
			System.out.println("**INSIDE LOOP");
		}
		System.out.println("OUTSIDE LOOP");
	}

}
