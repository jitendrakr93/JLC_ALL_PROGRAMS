package com.classcore.jlc03;

public class Lab295 {

	public static void main(String[] args) {
		Hello_41 h=new Hello_41();
		//h.show(65);
		h.show('A');
		h.show((char)65);

	}

}
class Hello_41{
void show(char x){
	System.out.println("show(char)");
}
}