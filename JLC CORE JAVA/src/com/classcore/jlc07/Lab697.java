package com.classcore.jlc07;

import java.io.File;

public class Lab697 {

	public static void main(String[] args) {
		File file=new File("D:\\D1\\JAVA\\JLC");
		System.out.println("Dir Found :"+file.exists());
		file.mkdirs();
		System.out.println("Dir Found :"+file.exists());

	}

}
