package com.classcore.jlc03;

public class Lab217 {

	public static void main(String[] args) {
		if(args.length>=2)
		{
			String str1=args[0];
			String str2=args[1];
			System.out.println(str1+str2);
			int a=Integer.parseInt(str1);//we can use number as a string
			int b=Integer.parseInt(str2);//we can use number as a string
			System.out.println(a+b);
		}
		else
		{
			System.out.println("Enter two int values as CLA");
		}

	}

}
