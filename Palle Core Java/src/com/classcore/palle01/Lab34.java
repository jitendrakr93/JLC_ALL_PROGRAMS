package com.classcore.palle01;

public class Lab34 {

	public static void main(String[] args) {
		int x = 1;
		switch (x++) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
		default:
			System.out.println("4");
		}
		System.out.println(x);
	}

}
