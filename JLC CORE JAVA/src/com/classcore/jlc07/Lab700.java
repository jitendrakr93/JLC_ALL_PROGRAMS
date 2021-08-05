package com.classcore.jlc07;

import java.io.File;

public class Lab700 {

	public static void main(String[] args) throws Exception {
		File[] far = File.listRoots();
		System.out.println(far.length);
		System.out.println("FileName\tisDirectory\tisFile\tisAbsolute\tgetPath");
		for (int i = 0; i < far.length; i++) {
			System.out.println(far[i].getName() + "\t\t" + far[i].isDirectory() + "\t\t" + far[i].isFile() + "\t\t"
					+ far[i].isAbsolute() + "\t\t" + far[i].getPath());
		}
		File f = new File(far[1], "hi.txt");
		f.createNewFile();

	}

}
