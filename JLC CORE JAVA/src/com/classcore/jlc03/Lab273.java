package com.classcore.jlc03;

public class Lab273 {

	public static void main(String[] args) {
		Hello_23 h1=new Hello_23();

	}

}
class Hello_23{
	Hello_23(){
		this(10);
	}
	Hello_23(int a){
		/*Constructor looping is not possible*/
		//this();
	}
}