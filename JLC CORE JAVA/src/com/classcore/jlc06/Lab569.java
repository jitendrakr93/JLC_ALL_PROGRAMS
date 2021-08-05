package com.classcore.jlc06;

public class Lab569 {

	public static void main(String[] args) {
		System.out.println("Main() Starts");
		try{
			StudentService1 serv=new StudentService1();
			serv.getNameBySid(null);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("main() ends");
	}

}
class StudentService1{
	String getNameBySid(String sid){
		if(sid == null || sid.isEmpty() || sid.equals("JLC-099"))
			throw new StudentNotFoundException1(sid);
		else
			return "Srinivas";
	}
	
}
class StudentNotFoundException1 extends RuntimeException{
	StudentNotFoundException1(String sid){
		super(sid);
	}
}