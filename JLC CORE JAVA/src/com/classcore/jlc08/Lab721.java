package com.classcore.jlc08;

import java.lang.reflect.Constructor;

public class Lab721 {

	public static void main(String[] args) throws Exception{
		String cname="com.jlc.ref.Hai";
		Class cl=Class.forName(cname);
		System.out.println("\n PUBLIC CONSTRUCTORS**");
		Constructor[] pCons=cl.getConstructors();
		for (int i = 0; i < pCons.length; i++) {
			System.out.println(pCons[i]);
		}
		System.out.println("\n** DECLARED CONSTRUCTORS**");
		Constructor[] aCons=cl.getDeclaredConstructors();
		for (int i = 0; i < aCons.length; i++) {
			System.out.println(aCons[i]);
		}

	}

}
