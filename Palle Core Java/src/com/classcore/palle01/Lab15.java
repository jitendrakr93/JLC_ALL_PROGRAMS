package com.classcore.palle01;

public class Lab15 {

	public static void main(String[] args) {
		int i=50;
		int j=40;
		int k=30;
		int big=((i > j && i > k) ? i :((j > k) ? j : k));
		System.out.println("Biggest Number is :"+big);

	}

}
