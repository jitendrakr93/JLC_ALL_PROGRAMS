package com.classcore.palle02;

public class Lab87 {

	public static void main(String[] args) {
		int count = 0;
		char name[] = { 'J', 'I', 'T', 'E', 'N', 'D', 'R', 'A' };
		for (int i = 0; i < name.length; i++) {
			if (name[i] == 'A' || name[i] == 'E' || name[i] == 'I' || name[i] == 'O' || name[i] == 'U') {
				count++;
			}
		}
		System.out.println("Total number of count is :"+count);
	}

}
