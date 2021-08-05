package com.classcore.jlc04;

public class Lab315 {

	public static void main(String[] args) {
		Hello15 h=new Hello15();
		h.show(10);
		h.show(10,20);
		h.show(10,20,30);
		

	}

}

class Hello15 {
	void show(int a, int... arr) {
		System.out.println("\nshow(int,int...)");
	}
}