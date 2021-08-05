package com.classcore.jlc03;

public class Lab290 {

	public static void main(String[] args) {
		Hello_36 h=new Hello_36();
		System.out.println(h.show(10));

	}

}
class Hello_36{
	boolean show(int x){
		System.out.println("show()");
		return true;
	}
}