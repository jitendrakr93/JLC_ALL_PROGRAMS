package com.classcore.jlc02;

public class Lab186 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			System.out.println("\n"+i);
			for(int j=1;j<=5;j++,System.out.println("J++"))
			{
				if(i==3)
					continue;
				System.out.println("JLC"+j);
			}
		}

	}

}
