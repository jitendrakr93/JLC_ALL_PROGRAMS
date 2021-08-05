package com.classcore.jlc04;

public class Lab306 {

	public static void main(String[] args) {
		Hello6 h=new Hello6();
		int n=4;
		long fac=h.factorial(n);
		System.out.println(fac);

	}

}
class Hello6{
	long factorial(int n){
		if(n==0 || n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
}