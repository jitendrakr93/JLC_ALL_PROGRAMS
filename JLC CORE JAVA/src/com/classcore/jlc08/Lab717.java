package com.classcore.jlc08;

public class Lab717 {
	

	public static void main(String[] args) {
		showClassInfo("OK");
		//showClassInfo(new Lab1365());
		Hello1 h=new Hello1();
		showClassInfo(h);
	}
	static void showClassInfo(Object obj){
		Class cls=obj.getClass();
		System.out.println("\nClass Name :"+cls.getName());
	}

}
class Hello1{
	
}