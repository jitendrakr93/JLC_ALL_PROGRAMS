package com.classcore.palle01;

public class Lab11 {

	public static void main(String[] args) {
		int i=1;
		int j=i++ * ++i;
		int k=++j;
		int l=k++ * i++ * ++j;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);

	}

}
