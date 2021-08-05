package com.classcore.jlc07;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab638 {

	public static void main(String[] args) {
		TreeSet tset=new TreeSet(new StringDescComparator());
		tset.add("Manish");
		tset.add("Sri");
		tset.add("Nivas");
		tset.add("Rahul");
		tset.add("DK");
		Iterator it=tset.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
class StringDescComparator implements Comparator{
	@Override
	public int compare(Object ob1, Object ob2) {
		if(ob1 instanceof String && ob2 instanceof String){
			String s1=(String) ob1;
			String s2=(String) ob2;
			return s2.compareTo(s1); //DESC
			//return s1.compareTo(s2); //ASC
		}
		return 0;
	}
}