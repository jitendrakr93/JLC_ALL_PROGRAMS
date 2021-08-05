package com.classcore.jlc07;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab636 {

	public static void main(String[] args) {
		TreeSet tset=new TreeSet(new SidComparator());
		tset.add(new Student3(88,"Manish"));
		tset.add(new Student3(44,"Sri"));
		tset.add(new Student3(22,"Nivas"));
		tset.add(new Student3(99,"Rahul"));
		tset.add(new Student3(77,"Abhi"));
		Iterator it=tset.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
class Student3{
	int sid;
	String name;
	public Student3(int sid,String name) {
		this.sid=sid;
		this.name=name;
	}
	@Override
	public String toString() {
		return sid+"\t"+name;
	}
}
class SidComparator implements Comparator{
	@Override
	public int compare(Object ob1, Object ob2) {
		if(ob1 instanceof Student3 && ob2 instanceof Student3){
			Student3 s1=(Student3) ob1;
			Student3 s2=(Student3) ob1;
			return s1.sid-s2.sid;
		}
		return 0;
	}
}