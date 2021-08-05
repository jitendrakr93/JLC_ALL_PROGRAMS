package com.classcore.jlc07;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab633 {

	public static void main(String[] args) {
		System.out.println("** STUDENT INFO **");
		TreeSet set=new TreeSet();
		set.add(new Students(87, "Sri"));
		set.add(new Students(99, "Dande"));
		set.add(new Students(12, "SD"));
		set.add(new Students(45, "Nivas"));
		Iterator it=set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
class Students implements Comparable{
	int sid;
	String name;
	public Students(int sid,String name) {
		this.sid=sid;
		this.name=name;
	}
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Students){
			Students st=(Students) obj;
			return this.sid-st.sid;
		}
		return 0;
	}
	@Override
	public String toString() {
		return sid+"\t"+name;
	}
}