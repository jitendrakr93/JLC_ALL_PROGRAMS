package com.classcore.jlc07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lab688 {

	public static void main(String[] args) {
	try(InputStreamReader isr=new InputStreamReader(System.in); BufferedReader br=new BufferedReader(isr);){
		System.out.println("Enter Id");
		String id=br.readLine();
		System.out.println("Enter Name");
		String nm=br.readLine();
		System.out.println(id+"\t"+nm);
	}catch (Exception e) {
		e.printStackTrace();
	}

	}

}
