package com.classcore.jlc03;

public class Lab300 {

	public static void main(String[] args) {
		Hello_46 h=new Hello_46();
		byte b=20;
		h.add(10, b);
		h.add(b, b);

	}

}
class Hello_46{
	void add(int a,byte b){
		System.out.println("add(int,byte)");
	}
}