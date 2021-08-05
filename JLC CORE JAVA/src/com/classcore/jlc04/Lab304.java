package com.classcore.jlc04;

public class Lab304 {

	public static void main(String[] args) {
		Hello4 h=new Hello4();
		h.show(null);
		h.show("JLC");
		h.show(h);

	}

}
class Hello4{
	void show(String str){
		System.out.println("show(String)");
	}
	void show(Object str){
		System.out.println("show(object)");
	}
}