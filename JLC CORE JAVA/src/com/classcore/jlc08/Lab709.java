package com.classcore.jlc08;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Lab709 {

	public static void main(String[] args)throws Exception {
		try(FileOutputStream fos=new FileOutputStream("D:\\info.ser");ObjectOutputStream oos=new ObjectOutputStream(fos);){
			Address3 ad=new Address3("33/1","Mathikere");
			Student11 st=new Student11(99,"Sri",65799999,ad);
			Student11.count=9;
			System.out.println(st);
			oos.writeObject(st);
			System.out.println("Object Serialized");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
class Address3{
	String aid;
	String street;
	Address3(){}
	public Address3(String aid, String street) {
		this.aid = aid;
		this.street = street;
	}
	@Override
	public String toString() {
		return aid+"\t"+street;
	}
	
}
class Student11 implements Externalizable{
	int sid;
	transient String name="XXXX";
	long phone=333333;
	static int count=3;
	Address3 add;
	public Student11() {}
	
	public Student11(int sid, String name, long phone, Address3 add) {
		super();
		this.sid = sid;
		this.name = name;
		this.phone = phone;
		this.add = add;
	}
	@Override
	public String toString() {
		return sid+"\t"+name+"\t"+phone+"\t\t"+count+"\n"+add;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(count);
		out.writeObject(name);
		out.writeObject(add.aid);
		out.writeObject(add.street);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		count=in.readInt();
		name=in.readObject().toString();
		add=new Address3();
		add.aid=in.readObject().toString();
		add.street=in.readObject().toString();
		
	}
	
}
//Use Lab705 code to deserialize the object