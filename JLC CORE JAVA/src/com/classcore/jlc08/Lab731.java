package com.classcore.jlc08;

public class Lab731 {

	public static void main(String[] args) {
		Employee6 em=new Employee6(99, "Sri");
		System.out.println(em);

	}

}
class Employee6{
	int eid;
	String name;
	public Employee6(int eid, String name) {
		this.eid = eid;
		this.name = name;
	}
	public String tostring(){
		return eid+"\t"+name;
	}
	
}