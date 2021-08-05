package com.classcore.palle03;

public class Lab114 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Amir");
		sb.append(" Khan");
		sb.insert(0,"Lagan ");
		sb.insert("Lagan ".length(),"Salman ");
		sb.delete(sb.indexOf("Salman ")+7,sb.indexOf(" Khan"));
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());

	}

}
