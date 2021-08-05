package com.classcore.jlc03;

public class Lab282 {

	public static void main(String[] args) {
		Operation2.showRemainder(10, 4);
		Operation2.showRemainder(10, 0);

	}

}
class Operation2{
	static void showRemainder(int a,int b){
		if (b==0)
			//return 0;
		System.out.println(a%b);
	}
}