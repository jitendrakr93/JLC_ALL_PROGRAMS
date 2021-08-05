package com.classcore.jlc08;

import java.io.File;

public class Lab703 {

	public static void main(String[] args) throws Exception{
		File f=new File("sri\\jlc\\io");
		f.mkdirs();
		File f1=new File(f,"jlc.txt");
		System.out.println("f1.getName()\t"+f1.getName());
		System.out.println("before creating f1.exists()\t"+f1.exists());
		f1.createNewFile();
		System.out.println("file hi.txt is created sri\\jlc\\io");
		System.out.println("f1.getAbsolutePath()\t:"+f1.getAbsolutePath());
		System.out.println("f1.get.Parent()\t"+f1.getParent());
		System.out.println("f1.get.Path()\t"+f1.getPath());
		System.out.println("after creating f1.exists\t"+f1.exists());
		System.out.println("f1.canRead()\t"+f1.canRead());
		System.out.println("f1.canWrite()\t"+f1.canWrite());
		f1.setReadOnly();
		System.out.println("marked read only");
		System.out.println("f1.canRead()\t"+f1.canRead());
		System.out.println("f1.canWrite()\t"+f1.canWrite());
		File f2=new File("hello.txt");
		f2.createNewFile();
		System.out.println("f2.getAbsolutePath()\t:"+f2.getAbsolutePath());
		System.out.println("f2.getParent()\t:"+f2.getParent());
		System.out.println("f2.getPath()\t:"+f2.getPath());

	}

}
