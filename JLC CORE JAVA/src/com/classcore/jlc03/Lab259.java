package com.classcore.jlc03;

public class Lab259 {

	public static void main(String[] args) {
		System.out.println("I am main()");
		{
			int a=10;
			System.out.println("I am Local Block 1 in main():"+a);
		}
		int a=90;
		System.out.println("I am main():"+a);
	}

}
