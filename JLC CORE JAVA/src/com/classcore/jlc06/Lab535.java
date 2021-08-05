package com.classcore.jlc06;

import java.math.BigInteger;

public class Lab535 {

	public static void main(String[] args) {
		BigInteger in1=new BigInteger("9223372036854775807L");
		BigInteger in2=new BigInteger("100");
		BigInteger res1=in1.add(in2);
		System.out.println(res1);

	}

}
