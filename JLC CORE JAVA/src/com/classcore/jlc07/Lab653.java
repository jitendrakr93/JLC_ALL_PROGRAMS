package com.classcore.jlc07;
import java.util.ArrayList;
import java.util.List;

public class Lab653 {

	public static void main(String[] args) {
		ArrayList<Integer> inList=new ArrayList<Integer>();
		inList.add(1234);
		inList.add(4567);
		inList.add(8910);
		showElement(inList);
		ArrayList<String> stList=new ArrayList<String>();
		//showElement(stList);
	}
	static void showElement(List<? extends Number > list){
		for(Number num:list){
			System.out.println(num+",");
		}
		System.out.println("\n");
	}

}
