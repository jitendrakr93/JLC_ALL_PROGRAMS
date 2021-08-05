package com.classcore.jlc07;
import java.util.Date;

public class Lab673 {

	public static void main(String[] args) {
		Date dt=new Date();
		System.out.println(dt);
		System.out.println("DATE\t"+dt.getDate());
		System.out.println("MON\t"+dt.getMonth());
		System.out.println("MON+1\t"+(dt.getMonth()+1));
		System.out.println("YEAR\t"+dt.getYear());
		System.out.println("YEAR+1900\t"+dt.getYear()+1900);
		System.out.println("HOUR\t"+dt.getHours());
		System.out.println("MIN\t"+dt.getMinutes());
		System.out.println("SEC\t"+dt.getSeconds());
		System.out.println("\nStoring date");
		dt.setDate(9);
		dt.setMonth(2);
		dt.setYear(108);
		System.out.println(dt);

	}

}
