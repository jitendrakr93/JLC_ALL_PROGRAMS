package com.classcore.jlc04;

public class Lab305 {

	public static void main(String[] args) {
		Hello5 h=new Hello5();
		h.show("JLC");
		h.show(h);
		//h.show(null);
		
		

	}

}
class Hello5{
	void show(String str){
		System.out.println("show(String)");
	}
	void show(Hello5 str){
		System.out.println("Show(Hello)");
	}
}