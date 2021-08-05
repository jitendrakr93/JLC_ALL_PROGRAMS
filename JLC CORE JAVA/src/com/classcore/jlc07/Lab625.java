package com.classcore.jlc07;
import java.util.LinkedHashSet;

public class Lab625 {

	public static void main(String[] args) {
		LinkedHashSet set=new LinkedHashSet();
		set.add(new Long(65));
		set.add(new Byte((byte)65));
		set.add(new Integer(65));
		set.add("A");
		System.out.println(set);
	}

}
