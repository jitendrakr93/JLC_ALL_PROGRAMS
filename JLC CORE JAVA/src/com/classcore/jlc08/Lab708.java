package com.classcore.jlc08;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Lab708 {

	public static void main(String[] args) throws Exception{
		try(FileOutputStream fos=new FileOutputStream("D:\\info.ser");ObjectOutputStream oos=new ObjectOutputStream(fos);){
			Address2 ad=new Address2("33/1","Mathikere");
			Student10 st=new Student10(99, "Sri", 65799999, ad);
			Student10.count=9;
			System.out.println(st);
			oos.writeObject(st);
			System.out.println("Object Serialized");
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
//class Address2 implements Serializable{
class Address2{
	String aid;
	String street;
	public Address2(String aid, String street) {
		this.aid = aid;
		this.street = street;
	}
	@Override
	public String toString() {
		return aid+"\t"+street;
	}
}
class Student10 implements Serializable{
	int sid;
	transient String name="XXXX";
	long phone=333333;
	static int count=3;
	Address2 add;
	public Student10(int sid, String name, long phone, Address2 add) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
		this.add = add;
	}
	@Override
	public String toString() {
		return sid+"\t"+name+"\t"+phone+"\t\t"+count+"\n"+add;
	}
	
}
//Use Lab705 code to deserialize the object