package com.classcore.jlc01;

public class Lab39 {

	public static void main(String[] args) {
		String str1=null;
		System.out.println(str1);
		/*We cant perform operation on null, so it will give NullPointerException*/
		int x=str1.length();
		System.out.println(x);
	}

}
