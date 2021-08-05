package com.classcore.jlc07;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Lab663 {

	public static void main(String[] args) {
		Set s=Collections.singleton("JLC");
		System.out.println(s);
		s.add("HELLO");
		 //java.lang.UnsupportedOperationException
		List list=Collections.singletonList("JLC");
		System.out.println(list);
		list.add("HELLO");
		//java.lang.UnsupportedOperationException
	}

}
