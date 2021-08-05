package com.classcore.jlc07;

import java.io.BufferedInputStream;
import java.io.BufferedReader;

public class Lab686 {

	public static void main(String[] args) {
		System.out.println("Enter data");
		try(BufferedInputStream bis=new BufferedInputStream(System.in);){
			while(true){
				int asc=bis.read();
				if(asc == 13)
					break;
				char ch=(char) asc;
				System.out.println(ch);
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
