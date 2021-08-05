package com.classcore.jlc07;

import java.io.File;

public class Lab695 {

	public static void main(String[] args) {
		File file=new File("D:\\");
		File files[]=file.listFiles();
		for(File f:files){
			System.out.println(f+" -> isFile :"+f.isFile()+",is Dir :"+f.isDirectory());
		}

	}

}
