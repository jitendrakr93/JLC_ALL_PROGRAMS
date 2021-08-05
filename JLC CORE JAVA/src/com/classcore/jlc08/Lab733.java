package com.classcore.jlc08;

public class Lab733 {

	public static void main(String[] args) {
		Employee8 em=new Employee8(99, "Sri");

	}

}
class Employee8{
	int eid;
	String name;
	public Employee8(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	@Override
	public String toString() {
		return eid+"\t"+name;
	}
}