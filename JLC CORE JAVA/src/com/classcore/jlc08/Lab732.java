package com.classcore.jlc08;

public class Lab732 {

	public static void main(String[] args) {
		Employee7 em=new Employee7(99, "Sri");
		System.out.println(em);

	}

}
class Employee7{
	int eid;
	String name;
	public Employee7(int eid, String name) {
		this.eid = eid;
		this.name = name;
	}
	/*@Override
	public String tostring(){
		return eid+"\t"+name;
	}*/
	
}