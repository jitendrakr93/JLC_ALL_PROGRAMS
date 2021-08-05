package com.classcore.jlc06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Lab600 {

	public static void main(String[] args) {
		Collection col=new ArrayList();
		col.add("Sri");
		col.add("Srinivas");
		col.add("Dande");
		Iterator it=col.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
			if(obj.equals("Sri"))
				it.remove();
		}
		System.out.println(col);
	}

}
