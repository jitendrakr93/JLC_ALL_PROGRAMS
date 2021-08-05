package com.classcore.jlc08;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Lab704 {
	public static void main(String[] args) throws Exception{
		try(FileOutputStream fos=new FileOutputStream("D:\\info.ser");ObjectOutputStream oos=new ObjectOutputStream(fos);){
			Student7 st=new Student7(99, "Sri", 6579999999L);
			Student7.count=9;
			System.out.println(st);
			oos.writeObject(st);
			System.out.println("Object Serialized");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
class Student7 implements Serializable{
	int sid;
	String name;
	Long phone;
	static int count=3;
	public Student7(int sid, String name, Long phone) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return sid+"\t"+name+"\t"+phone+"\t"+count;
	}
	
}