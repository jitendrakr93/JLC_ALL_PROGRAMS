package com.classcore.jlc07;

import java.io.File;
import java.io.FileFilter;

public class Lab696 {

	public static void main(String[] args) {
		File file=new File("D:\\D1");
		File javaFiles[]=file.listFiles(new ExtFilter(".java"));
		System.out.println("** JAVA FILES **");
		if(javaFiles != null)
			for(File f: javaFiles)
				System.out.println(f);
		else 
			System.out.println("No Java File Found");
	}

}
class ExtFilter implements FileFilter{
	String ext;
	public ExtFilter(String ext){
		this.ext=ext;
	}
	@Override
	public boolean accept(File f) {
		return f.getName().endsWith(ext);
	}
	
}