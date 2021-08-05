package com.classcore.palle02;

public class Lab71 {

	public static void main(String[] args) {
		int num=371;
		int temp=num;
		int rev=0;
		while(num!=0)
		{
			int last=num%10;
			num=num/10;
			rev=(rev*10)+last;
		}
		if(rev == temp)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}

	}

}
