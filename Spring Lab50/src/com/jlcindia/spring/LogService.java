package com.jlcindia.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogService {
	
	@Pointcut(value="execution(* com.jlcindia.spring.AccountService.my*(..))")
	public void jlc1(){
		
	}
	@Pointcut(value="execution(* com.jlcindia.spring.CustomerService.up*(..))")
	public void jlc2(){
		
	}
	@Before("jlc1() or jlc2()")
	public void logBefore(){
		System.out.println("** LS-logBefore");
	}
	@AfterReturning("jlc1()")
	public void logReturning(){
		System.out.println("** LS-logReturning");
	}
	
	@After("jlc1()")
	public void logOk(){
		System.out.println("** LS...logOk()");
	}
}
