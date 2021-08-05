package com.classcore.jlc07;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab639 {

	public static void main(String[] args) {
	TreeSet tset=new TreeSet(new SBComparator());
	tset.add(new StringBuilder("Manish"));
	tset.add(new StringBuilder("Sri"));
	tset.add(new StringBuilder("Nivas"));
	tset.add(new StringBuilder("Rahul"));
	tset.add(new StringBuilder("DK"));
	Iterator it=tset.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	}

}
class SBComparator implements Comparator{
	@Override
	public int compare(Object ob1, Object ob2) {
		if(ob1 instanceof StringBuilder && ob2 instanceof StringBuilder){
			String s1=ob1.toString();
			String s2=ob2.toString();
			return s1.compareTo(s2); //ASC
			//return s2.compareTo(s1); //Desc
		}
		return 0;
	}
}