package com.classcore.jlc03;

public class Lab281 {

	public static void main(String[] args) {
		Operation1.showRemainder(10, 4);
		Operation1.showRemainder(10, 0);
	}

}
class Operation1{
	static void showRemainder(int a,int b){
		if (b==0)
			return;
		System.out.println(a%b);
	}
}