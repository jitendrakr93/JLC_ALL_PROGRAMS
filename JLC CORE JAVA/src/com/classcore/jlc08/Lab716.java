package com.classcore.jlc08;

public class Lab716 {

	public static void main(String[] args) {
		String className="com.classcore.jlc08.Hello";
		try{
			Class cls=Class.forName(className);
			System.out.println("Class loaded successfully");
			System.out.println("Class Name :"+cls.getName());
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
class Hello{
	
}