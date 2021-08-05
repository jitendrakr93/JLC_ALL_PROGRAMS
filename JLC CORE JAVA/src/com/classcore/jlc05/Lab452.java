package com.classcore.jlc05;

class Hai{
	int x;
	Hai(int x){
		this.x=x;
	}
}
class Hello1 implements Cloneable{
	int y;
	Hai hai;
	Hello1(int y,Hai hai){
		this.y=y;
		this.hai=hai;
	}
	void show(){
		System.out.println("Hello -> y:"+y);
		System.out.println("Hai -> x :"+hai.x);
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
public class Lab452 {

	public static void main(String[] args) throws CloneNotSupportedException{
		Hai hai=new Hai(10);
		Hello1 h1=new Hello1(20,hai);
		Hello1 h2=(Hello1)h1.clone();
		h1.show();
		h2.show();
		System.out.println( h1 == h2);
		System.out.println(h1.hai == h2.hai);
		h2.y=30;
		h1.show();
		h2.show();
		h2.hai.x=111;
		h1.show();
		h2.show();

	}

}
