package com.classcore.palle02;

public class Lab70 {

	public static void main(String[] args) {
		int fno=0;
		int sno=1;
		int total=fno+sno;
		System.out.println(fno);
		System.out.println(sno);
		while(total<100)
		{
			System.out.println(total);
			fno=sno;
			sno=total;
			total=fno+sno;
		}

	}

}
