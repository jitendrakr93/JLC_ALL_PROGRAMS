package com.classcore.jlc06;

public class Lab571 {

	public static void main(String[] args) throws StudentNotFoundException4{
		System.out.println("main() starts");
		try{
			StudentService4 serv=new StudentService4();
			serv.getNameBySid(null);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("main() ends");
	}

}

class StudentService4 {
	String getNameBySid(String sid)throws StudentNotFoundException4{
		if(sid == null || sid.isEmpty() || sid.equals("JLC-099"))
			throw new StudentNotFoundException1(sid);
		else
			return "Srinivas";
	}
}

class StudentNotFoundException4 extends Exception{
	public StudentNotFoundException4(String sid) {
		super(sid);
	}
}