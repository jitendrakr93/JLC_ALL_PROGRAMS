package com.classcore.jlc06;

public class Lab526 {

	public static void main(String[] args) {
		JLCService2 serv=new JLCService2();
		byte b1=12;
		byte b2=23;
		serv.show(b1,b2);

	}

}

class JLCService2{
	void show(Byte ab,Byte bc){
		System.out.println("\n--show(Byte,Byte)");
	}
	void show(byte...ab ){
		System.out.println("\n--show(byte...)");
	}
}