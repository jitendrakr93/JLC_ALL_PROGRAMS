package com.classcore.jlc07;
import java.util.HashSet;

public class Lab626 {

	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(new Student(99));
		set.add(new Student(99));
		set.add(new Student(99));
		set.add(new Student(99));
		System.out.println(set);
	}

}
class Student{
	int sid;
	public Student(int sid) {
		this.sid=sid;
	}
	public String toString(){
		return ""+sid;
	}
}