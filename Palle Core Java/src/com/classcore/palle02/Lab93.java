package com.classcore.palle02;

public class Lab93 {

	public static void main(String[] args) {
		int val1[]={10,20,30,40,50};
		int val2[]={20,60,30,80,100};
		for(int item : val1)
		{
			for(int items : val2){
				if(item == items)
				{
					System.out.println(items);
				}
			}
		}

	}

}
