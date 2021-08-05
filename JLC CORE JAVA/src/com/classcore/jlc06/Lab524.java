package com.classcore.jlc06;

public class Lab524 {

	public static void main(String[] args) {
		JLCService serv=new JLCService();
		byte b1=12;
		byte b2=23;
		serv.show(b1,b2);

	}

}

class JLCService{
	void show(int ab,int bc){
		System.out.println("\n--show(int,int)");
	}
	void show(byte ab,byte bc){
		System.out.println("\n--show(byte,byte)");
	}
	void show(Byte ab,Byte bc){
		System.out.println("\n--show(Byte,Byte)");
	}
	void show(byte...ab ){
		System.out.println("\n--show(byte...)");
	}
}