package com.classcore.jlc06;

public class Lab556 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		try{
			int res=10/3;
			System.out.println("result :"+res);
			return;
		}catch(Exception e){
			System.out.println("Invalid Input");
		}
		System.out.println("Main Completed");
	}

}
