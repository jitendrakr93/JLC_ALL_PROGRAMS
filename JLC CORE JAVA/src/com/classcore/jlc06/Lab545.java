package com.classcore.jlc06;

public class Lab545 {

	public static void main(String[] args) {
		System.out.println("Main started");
		try{
			String data=args[0];
			int x=Integer.parseInt(data);
			int res=10/x;
			System.out.println("Result :"+res);
		}
		catch(Exception e){
			System.out.println("*Enter correct value");
		}
		System.out.println("Main completed");
	}

}
