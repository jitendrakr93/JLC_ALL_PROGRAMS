package com.classcore.jlc03;

public class Lab289 {

	public static void main(String[] args) {
		Hello_35 h=new Hello_35();
		System.out.println(h.show(10));

	}

}
class Hello_35{
	long show(int x){
		System.out.println("show()");
		return x+1;
	}
}