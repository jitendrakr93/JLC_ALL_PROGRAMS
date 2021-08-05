package com.classcore.jlc08;

import java.io.Serializable;

public class Lab707 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Student9 implements Serializable{
	int sid;
	transient String name="XXXX";
	long phone=333333;
	static int count=3;
	public Student9(int sid, String name, long phone) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return sid+"\t"+name+"\t"+phone+"\t"+count;
	}
	
}
//Use Lab705 code to deserialize the object
//Student and Person class will be from Lab706