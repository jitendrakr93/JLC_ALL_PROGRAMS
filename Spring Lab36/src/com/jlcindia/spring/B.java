package com.jlcindia.spring;

public class B {
	private int b;
	private String str;
	static{
		System.out.println("B-S.B");
	}
	public B() {
		System.out.println("B-()");
	}
	public B(int b, String str) {
		this.b = b;
		this.str = str;
	}
	public void init(){
		System.out.println("B-init()");
	}
	@Override
	public String toString() {
		return b + "\t" + str;
	}
	
}
