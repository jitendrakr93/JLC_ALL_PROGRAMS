package com.classcore.jlc03;

public class Lab288 {

	public static void main(String[] args) {
		Hello_34 h=new Hello_34();
		System.out.println(h.show(10));

	}

}
class Hello_34{
	long show(int x){
		System.out.println("show()");
		return 'A';
	}
}