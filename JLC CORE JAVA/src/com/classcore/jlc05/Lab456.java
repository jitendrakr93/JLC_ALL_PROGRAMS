package com.classcore.jlc05;

public class Lab456 {

	public static void main(String[] args) {
		

	}

}
class Employee1{
	String eid;
	double add[]=new double[123456];
	Employee1(String eid) {
		this.eid=eid;
		System.out.println("\nObject created with id :"+eid);
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("FINALIZE- "+eid);
	}
}