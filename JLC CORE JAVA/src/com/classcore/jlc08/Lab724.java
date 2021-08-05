package com.classcore.jlc08;


public class Lab724 {

	public static void main(String[] args) throws Exception{
		String cname="com.jlc.ref.Hai";
		Class cl=Class.forName(cname);
		System.out.println("\n** PUBLIC INNER CLASSES**");
		Class[] PInCls=cl.getClasses();
		for (int i = 0; i < PInCls.length; i++) {
			Class c=PInCls[i];
			System.out.println(c);
		}
		System.out.println("\n** DECLARED INNER CLASSES**");
		Class[] aInCls=cl.getDeclaredClasses();
		for (int i = 0; i < aInCls.length; i++) {
			Class c=aInCls[i];
			System.out.println(c);
		}

	}

}
