package com.classcore.palle01;

public class Lab35 {

	public static void main(String[] args) {
		int x = 2;
		int y = 1;
		switch (x) {
		case 1:
			System.out.println("Hi");
			break;
		case 2:
			System.out.println("Hello");
			switch (y) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
			}
			System.out.println("Bye");
			break;
		default:
			System.err.println("Java");
			break;
		}

	}

}
