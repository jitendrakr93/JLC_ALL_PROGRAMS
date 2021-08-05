package com.classcore.palle03;

public class Lab113 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Palle Technologies");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.insert(6,"android");
		sb.delete(11, 16);
		sb.deleteCharAt(10);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());

	}

}
