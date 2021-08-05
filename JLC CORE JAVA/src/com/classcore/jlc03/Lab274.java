package com.classcore.jlc03;

public class Lab274 {

	public static void main(String[] args) {
	Hello_24 h=null;
	h.show();/*NullPointer Exception*/
	h=new Hello_24();
	h.show();
	//Hello_24.show();

	}

}
class Hello_24{
	void show(){
		System.out.println("Instance show() ");
	}
}