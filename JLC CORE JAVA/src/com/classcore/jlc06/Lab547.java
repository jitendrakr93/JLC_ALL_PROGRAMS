package com.classcore.jlc06;

public class Lab547 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		try {
			String data = args[0];
			int x = Integer.parseInt(data);
			int res = 10 / x;
			System.out.println("result :" + res);
		} catch (Exception e) {
			System.out.println("Provide correct value");
		} /*catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Provide one value as cla");
		} catch (NumberFormatException e) {
			System.out.println("Provide int value as cla");
		} catch (ArithmeticException e) {
			System.out.println("provide non zero int value as cla ");
		}*/
		System.out.println("Main completed");
	}

}
