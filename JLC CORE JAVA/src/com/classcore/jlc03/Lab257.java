package com.classcore.jlc03;

public class Lab257 {

	public static void main(String[] args) {
		System.out.println("I am main()");
		{
			int a=10;
			System.out.println("I am Local Block 1 in main():"+a);
		}
		{
			int a=20;
			System.out.println("I am Local Block 2 in main():"+a);
		}
		{
			String a="JLC";
			System.out.println("I am Local Block 1 in main():"+a);
		}

	}

}
