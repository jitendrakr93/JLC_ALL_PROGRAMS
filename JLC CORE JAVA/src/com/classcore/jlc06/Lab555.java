package com.classcore.jlc06;

public class Lab555 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		try{
			int res=10/0;
			System.out.println("result :"+res);
		}catch(NumberFormatException e){
			System.out.println("Invalid input");
		}finally {
			System.out.println("finally block");
			System.out.println("Main Completed");
		}

	}

}
