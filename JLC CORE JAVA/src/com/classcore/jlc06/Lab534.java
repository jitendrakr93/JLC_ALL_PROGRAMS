package com.classcore.jlc06;

import java.math.BigInteger;

public class Lab534 {

	public static void main(String[] args) {
		BigInteger bint1=new BigInteger("4");
		System.out.println(bint1.bitCount());
				//Number of 1 bit
		System.out.println(bint1.bitLength());
			   //Number of total bits Allocated
		long val1=9223372036854775807L;//MAX VALUE
		long val2=100;
		long res=val1+val2;
		System.out.println(res);

	}

}
