package com.classcore.jlc07;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab637 {

	public static void main(String[] args) {
		TreeSet tset=new TreeSet(new NameComparator());
		tset.add(new Student4(88, "Manish"));
		tset.add(new Student4(44, "Sri"));
		tset.add(new Student4(22, "Nivas"));
		tset.add(new Student4(99, "Rahul"));
		tset.add(new Student4(77, "Abhi"));
		Iterator it=tset.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
class Student4{
	int sid;
	String name;
	public Student4(int sid,String name) {
		this.sid=sid;
		this.name=name;
	}
	@Override
	public String toString() {
		return sid+"\t"+name;
	}
}
class NameComparator implements Comparator{
	@Override
	public int compare(Object ob1, Object ob2) {
		if(ob1 instanceof Student4 && ob2 instanceof Student4){
			Student3 s1=(Student3) ob1;
			Student3 s2=(Student3) ob1;
			return s1.name.compareTo(s2.name);
		}
		return 0;
	}
}