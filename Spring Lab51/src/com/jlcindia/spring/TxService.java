package com.jlcindia.spring;

import java.awt.color.CMMException;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TxService {

	
	@Pointcut(value="execution(* com.jlcindia.spring.AccountService.my*(..))")
	public void jlc1(){
		
	}
	@Pointcut(value="execution(* com.jlcindia.spring.CustomerService.up*(..))")
	public void jlc2(){
		
	}
	
	@Around("jlc1() or jlc2()")
	public void runTx(ProceedingJoinPoint pjp)throws Throwable{
		System.out.println("** TxService...runTx()...begin");
		begin();
		pjp.proceed();
		commit();
		System.out.println("**TxService...runTx()...end");
	}
	public void begin(){
		System.out.println("** TS-begin");
	}
	public void commit(){
		System.out.println("** TS- commit");
	}
	@AfterThrowing("jlc1() or jlc2()")
	public void rollback(){
		System.out.println("** TS...rollback()");
	}

}
