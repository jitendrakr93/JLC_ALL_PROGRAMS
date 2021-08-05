package com.classcore.jlc08;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Lab706 {

	public static void main(String[] args) throws Exception{
		try(FileOutputStream fos=new FileOutputStream("D:\\info.ser");ObjectOutputStream oos=new ObjectOutputStream(fos);){
			Student8 st=new Student8(99, "Sri", 65799999L);
			Student8.count=9;
			System.out.println(st);
			oos.writeObject(st);
			System.out.println("Object Serialized");
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
//class Person implements Serializable{
class Person1{
	String name="XXXX";
	long phone=333333;
}
class Student8 extends Person1 implements Serializable{
	int sid;
	static int count=3;
	Student8(int sid,String name,long phone){
		this.sid=sid;
		this.name=name;
		this.phone=phone;
		
	}
	@Override
	public String toString() {
		return sid+"\t"+name+"\t"+phone+"\t"+count;
	}
}
//Use Lab705 code to deserialize the object