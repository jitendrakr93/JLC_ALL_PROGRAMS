package com.classcore.jlc07;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Lab690 {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("D:\\D1\\abc.txt");FileOutputStream fos=new FileOutputStream("D:\\D1\\xyz.txt");){
			while(true){
				int asc=fis.read();
				if(asc == -1)
					break;
				fos.write(asc);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
