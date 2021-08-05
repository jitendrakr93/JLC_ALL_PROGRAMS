package com.classcore.palle02;

public class Lab72 {

	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int arm=0;
		while(num!=0)
		{
			int last=num%10;
			num=num/10;
			arm=(arm)+(last*last*last);
		}
		if(arm == temp)
		{
			System.out.println("It is armstrong");
		}
		else
		{
			System.out.println("Number is not armstrong");
		}
	}

}
