package com.classcore.jlc07;

import java.io.File;

public class Lab698 {

	public static void main(String[] args) throws Exception{
		File file=new File("D:\\Hello.java");
		System.out.println("File Found :"+file.exists());
		file.createNewFile();
		System.out.println("File Found :"+file.exists());
		

	}

}
