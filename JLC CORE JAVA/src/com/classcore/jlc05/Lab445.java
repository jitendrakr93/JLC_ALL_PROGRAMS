package com.classcore.jlc05;

public class Lab445 {

	public static void main(String[] args) {
		System.out.println("\n**** With Employee");
		Employee em1=new Employee(99,31903290);
		Employee em2=new Employee(99,31903290);
		Employee em3=new Employee(88,65799999);
		Employee em4=em1;
		System.out.println(em1.hashCode());
		System.out.println(em2.hashCode());
		System.out.println(em3.hashCode());
		System.out.println(em4.hashCode());
		System.out.println(em1 == em2);
		System.out.println(em1 == em3);
		System.out.println(em1 == em4);
		System.out.println(em3 == em4);

	}

}
class Employee{
	int eid;
	long phone;
	Employee(int eid,long phone) {
		this.eid=eid;
		this.phone=phone;
	}
	public int hashCode(){
		return (int)(phone | eid);
	}
}