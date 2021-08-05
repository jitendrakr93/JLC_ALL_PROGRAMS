package com.classcore.jlc03;

public class Lab292 {

	public static void main(String[] args) {
		Hello_38 h=new Hello_38();
		System.out.println(h.isCDigit('A'));
		System.out.println(h.isCDigit('8'));

	}

}
class Hello_38{
	boolean isCDigit(char ch){
		System.out.println("isDigit():"+ch);
		if(ch>=48 && ch<=57)
			return true;
		else
			return false;
	}
}