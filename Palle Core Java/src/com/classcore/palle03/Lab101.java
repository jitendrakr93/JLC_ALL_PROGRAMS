package com.classcore.palle03;

public class Lab101 {

	public static void main(String[] args) {
		char name[]={'J','I','T','E','N','D','R','A'};
		String names="JITENDRA KUMAR";
		System.out.println("******USING ARRAY*******");
		for(int i=0;i<name.length;i++)
		{
			System.out.print(name[i]);
		}
		System.out.println();
		System.out.println("******USING STRING*******");
		for(int i=0;i<names.length();i++)
		{
			System.out.print(names.charAt(i));
		}
	}

}
