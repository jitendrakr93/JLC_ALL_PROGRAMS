package com.classcore.jlc08;

import java.lang.reflect.Method;

public class Lab722 {

	public static void main(String[] args) throws Exception{
		String cname="com.jlc.ref.Hai";
		Class cl=Class.forName(cname);
		System.out.println("\n** PUBLIC METHODS**");
		Method[] pMthd=cl.getMethods();
		for (int i = 0; i < pMthd.length; i++) {
			Method m=pMthd[i];
			System.out.println(m);
		}
		System.out.println("\n** DECLARED METHODS**");
		Method[] aMthd=cl.getDeclaredMethods();
		for (int i = 0; i < aMthd.length; i++) {
			Method m=aMthd[i];
			System.out.println(m);
		}

	}

}
