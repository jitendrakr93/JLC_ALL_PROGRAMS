package com.classcore.jlc06;

public class Lab552 {

	public static void main(String[] args) {
		System.out.println("Main started");
		String data=null;
		try{
			data=args[0];
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Provide one value as CLA");
		}
		int x=0;
		try{
			x=Integer.parseInt(data);
		}catch(NumberFormatException e){
			System.out.println("Provide int value as CLA");
		}
		try{
			int res=10/x;
			System.out.println("result :"+res);
		}catch(ArithmeticException e){
			System.out.println("Provide non zero int value as CLA");
		}
		System.out.println("Main Completed");
	}

}
