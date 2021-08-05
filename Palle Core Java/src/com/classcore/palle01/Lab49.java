package com.classcore.palle01;

import java.io.IOException;
import java.util.Scanner;

public class Lab49 {

	public static void main(String[] args) throws IOException {
		System.out.println("Fruits Available");
		System.out.println("a-Apple");
		System.out.println("b-Bnana");
		System.out.println("o-Orange");
		System.out.println("***Prices of fruits are***");
		System.out.println("apple quantity <= 10 price INR 10/apple and "
				+ "if quantity > 10 then price INR 10/apple");
		System.out.println("bnana quantity <= 12 price INR 3/bnana and "
				+ "if quantity > 12 then price INR 2/bnana");
		System.out.println("orange quantity <= 15 price INR 6/orange and "
				+ "if quantity > 10 then price INR 4/orange");
		System.out.println("***************************");
		System.out.println("Enter the symbol of fruit which you want to purchase");
		char ch=(char) System.in.read();
		System.out.println("Charachet is "+ch);
		if((ch != 'a') && (ch != 'b') && (ch != 'o') )
		{
			System.out.println("Enter valid fruit symbol");
			return;
		}
		System.out.println("Enter quantity");
		Scanner sc=new Scanner(System.in);
		int qty=sc.nextInt();
		if(qty<=0)
		{
			System.out.println("Please Enter Valid quantity");
			return;
		}
		switch(ch)
		{
		case 'a' :
			if(qty <= 10)
			{
				int price=qty*12;
				System.out.println("You have to pay "+price+" rupees");
			}
			else
			{
				int price=qty*10;
				System.out.println("You have to pay "+price+" rupees");
			}
		case 'b' :
			if(qty <= 12)
			{
				int price=qty*3;
				System.out.println("You have to pay "+price+" rupees");
			}
			else
			{
				int price=qty*2;
				System.out.println("You have to pay "+price+" rupees");
			}
		case 'o' :
			if(qty <= 15)
			{
				int price=qty*6;
				System.out.println("You have to pay "+price+" rupees");
			}
			else
			{
				int price=qty*4;
				System.out.println("You have to pay "+price+" rupees");
			}
		}

	}

}
