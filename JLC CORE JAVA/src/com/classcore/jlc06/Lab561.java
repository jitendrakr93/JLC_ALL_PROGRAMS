package com.classcore.jlc06;

public class Lab561 {

	public static void main(String[] args) {
		System.out.println("Stmt 0");
		try {
			System.out.println("Stmt 1");
			try {
				System.out.println("Stmt 2");
			} catch (Exception e) {
				System.out.println("Stmt 3");
			} finally {
				System.out.println("Stmt 4");
			}
			System.out.println("Stmt 5");
		} catch (Exception e) {
			System.out.println("Stmt 6");
			try {
				System.out.println("Stmt 7");
			} catch (Exception e1) {
				System.out.println("Stmt 8");
			} finally {
				System.out.println("Stmt 9");
			}
			System.out.println("Stmt 10");
		} finally {
			System.out.println("Stmt 11");
			try {
				System.out.println("Stmt 12");
			} catch (Exception e) {
				System.out.println("Stmt 13");
			} finally {
				System.out.println("Stmt 14");
			}
			System.out.println("Stmt 15");
		}
		System.out.println("Stmt 16");
	}

}
