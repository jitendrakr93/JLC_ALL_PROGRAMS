package com.classcore.jlc07;

import java.io.PrintWriter;

public class Lab693 {

	public static void main(String[] args) throws Exception{
		PrintWriter pw=new PrintWriter("Welcome.txt");
		pw.println(97);
		pw.println(97);
		pw.println(10.0);
		pw.println(true);
		pw.println(true);
		pw.println("JLC");
		pw.close();
	}

}
