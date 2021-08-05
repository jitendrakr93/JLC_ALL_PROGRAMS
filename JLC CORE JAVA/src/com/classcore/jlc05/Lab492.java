package com.classcore.jlc05;

public class Lab492 {

	public static void main(String[] args) {
		String str="JLCINDIA";
		byte bArr[]=str.getBytes();
		System.out.println("\n** byte array **");
		for (int i = 0; i < bArr.length; i++) {
			byte b=bArr[i];
			System.out.println(i+"\t"+b+"\t"+(char)b);
		}

	}

}
