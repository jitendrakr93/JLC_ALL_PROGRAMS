package com.classcore.palle01;

public class Lab12 {

	public static void main(String[] args) {
		int i=2;
		int j=i++ * ++i * i-- * --i;
		int k=++i * j++;
		System.out.println(--i);
		System.out.println(j++);
		System.out.println(k--);

	}

}
