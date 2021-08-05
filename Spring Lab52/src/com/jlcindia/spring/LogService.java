package com.jlcindia.spring;

public class LogService {
	public void logBefore(){
		System.out.println("** LS - logBefore");
	}
	public void logReturning(){
		System.out.println("** LS - logReturning");
	}
	public void logThrowing(){
		System.out.println("** LS - logThrowing");
		System.out.println();
	}
	public void logOk(){
		System.out.println("** LS - logOk");
	}
}
