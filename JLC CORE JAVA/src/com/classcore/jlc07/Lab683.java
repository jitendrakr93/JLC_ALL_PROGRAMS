package com.classcore.jlc07;
import java.util.Formatter;

public class Lab683 {

	public static void main(String[] args) {
		Formatter fmt=new Formatter();
		String res=fmt.format("Sum of %d and %d is %d", 10,20,(10+20)).toString();
		System.out.println(res);
		fmt.close();

	}

}
