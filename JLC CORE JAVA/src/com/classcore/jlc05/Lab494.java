package com.classcore.jlc05;

public class Lab494 {

	public static void main(String[] args) {
		char cArr[]={'J','L','C','I','N','D','I','A'};
		byte bArr[]={65,66,67,97,98,99,49,50};
		String st1=new String(cArr,3,5);
		String st2=new String(bArr,3,5);
		System.out.println("st1 :"+st1);
		System.out.println("st2 :"+st2);
	}

}
