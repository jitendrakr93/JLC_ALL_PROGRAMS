package com.classcore.jlc08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class Lab705 {

	public static void main(String[] args) throws Exception{
		try(FileInputStream fis=new FileInputStream("D:\\info.ser");ObjectInputStream ois=new ObjectInputStream(fis);){
			Object obj=ois.readObject();
			System.out.println(obj);
			System.out.println("Object Deserialized");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
//Student7.class file is required created in Last example
