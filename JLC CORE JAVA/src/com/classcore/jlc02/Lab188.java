package com.classcore.jlc02;

public class Lab188 {

	public static void main(String[] args) {
		JLC:
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=3;j++)
				{
					if(i==3)
						continue JLC;
					System.out.println(i+"\t"+j);
				}
			}

	}

}
