package com.classcore.jlc06;

public class Lab525 {

	public static void main(String[] args) {
		JLCService1 serv=new JLCService1();
		byte b1=12;
		byte b2=23;
		serv.show(b1,b2);

	}

}

class JLCService1{
	void show(int ab,int bc){
		System.out.println("\n--show(int,int)");
	}
	void show(Byte ab,Byte bc){
		System.out.println("\n--show(Byte,Byte)");
	}
	void show(byte...ab ){
		System.out.println("\n--show(byte...)");
	}
}