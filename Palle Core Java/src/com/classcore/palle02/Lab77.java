package com.classcore.palle02;

public class Lab77 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i == 5) {
				return;
			}
			System.out.println("hello");
		}
		System.out.println("Bye");
	}

}
