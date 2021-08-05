package com.classcore.jlc01;

class Hello1
{
	char ch;
	void show()
	{
		System.out.println(ch==0);
		System.out.println(ch==' ');
		System.out.println(ch=='\u0000');
		
	}
}
public class Lab02 {

	public static void main(String[] args) {
		Hello1 h=new Hello1();
		h.show();

	}

}
