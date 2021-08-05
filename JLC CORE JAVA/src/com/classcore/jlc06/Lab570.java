package com.classcore.jlc06;

public class Lab570 {

	public static void main(String[] args) {
		System.out.println("main() starts");
		try{
			StudentService2 serv=new StudentService2();
			serv.getNameBySid(null);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("main() ends");
	}

}
class StudentService2{
	String getNameBySid(String sid)throws StudentNotFoundException2{
		if(sid == null || sid.isEmpty() || sid.equals("JLC-099"))
			throw new StudentNotFoundException1(sid);
		else
			return "Srinivas";
	}
	
}
class StudentNotFoundException2 extends RuntimeException{
	StudentNotFoundException2(String sid){
		super(sid);
	}
}