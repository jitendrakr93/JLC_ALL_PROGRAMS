package com.jlcindia.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class TxService {

	
	@Pointcut(value="execution(* com.jlcindia.spring.AccountService.my*(..))")
	public void jlc1(){
		
	}
	@Pointcut(value="execution(* com.jlcindia.spring.CustomerService.up*(..))")
	public void jlc2(){
		
	}
	@Before("jlc1()")
	public void begin(){
		System.out.println("** TS-begin");
	}
	@AfterReturning("jlc1()")
	public void commit(){
		System.out.println("** TS-commit");
	}
	
	@AfterThrowing("jlc1()")
	public void rollback(){
		System.out.println("** TS...rollback()");
	}

}
