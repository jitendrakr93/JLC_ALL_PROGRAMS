package com.classcore.jlc03;

public class Lab293 {

	public static void main(String[] args) {
		Hello_39 h=new Hello_39();
		//System.out.println(h.show(x));
		//System.out.println(h.show(10,20));
		System.out.println(h.show(10));

	}

}
class Hello_39{
	int show(int x){
		System.out.println("show()");
		return x+1;
	}
}