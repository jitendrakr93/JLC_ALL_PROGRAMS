package com.classcore.jlc06;

public class Lab527 {

	public static void main(String[] args) {
		JLCService3 serv=new JLCService3();
		byte b1=12;
		byte b2=23;
		serv.show(b1,b2);

	}

}

class JLCService3{
	void show(byte...ab ){
		System.out.println("\n--show(byte...)");
	}
}