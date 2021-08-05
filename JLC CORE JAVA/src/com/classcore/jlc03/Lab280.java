package com.classcore.jlc03;

public class Lab280 {

	public static void main(String[] args) {
		Operation.showRemainder(10, 4);
		Operation.showRemainder(10, 0);

	}

}
class Operation{
	static void showRemainder(int a,int b){
		if(b==0)
			//return 0;/*method return type is void*/
		System.out.println(a%b);
	}
}