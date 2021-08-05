package com.classcore.jlc08;

import java.lang.reflect.Field;
public class Lab723 {

	public static void main(String[] args) throws Exception{
		String cname="com.jlc.ref.Hai";
		Class cl=Class.forName(cname);
		System.out.println("\n** PUBLIC FIELDS**");
		Field[] pFlds=cl.getFields();
		for (int i = 0; i < pFlds.length; i++) {
			Field f=pFlds[i];
			System.out.println(f);
		}
		System.out.println("\n** DECLARED FIELDS**");
		Field[] aFlds=cl.getDeclaredFields();
		for (int i = 0; i < aFlds.length; i++) {
			Field f=aFlds[i];
			System.out.println(f);
		}

	}

}
