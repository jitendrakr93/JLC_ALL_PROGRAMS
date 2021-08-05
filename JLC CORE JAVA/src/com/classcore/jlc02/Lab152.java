package com.classcore.jlc02;

public class Lab152 {

	public static void main(String[] args) {
		char ch='A';
		if(ch>=65 && ch<=90){
			switch(ch){
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Character is vowel");
				break;
				default:
					System.out.println("Character is constant");
			}
		}else{
			System.out.println("Invalid Alphabet");
		}

	}

}
