package com.jlcindia.spring.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab68 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		AccountDAO adao=(AccountDAO) ctx.getBean("adao");
		System.out.println(adao.getBalance(101));
		System.out.println(adao.getBalance(102));
		
		//1.deposit
		adao.deposit(101, 2000.0);
		
		//2.withdraw
		adao.withdraw(102, 5000.0);
		
		//3.getBalance
		System.out.println(adao.getBalance(101));
		System.out.println(adao.getBalance(102));
		
		//4.fundsTransfer
		System.out.println(adao.getBalance(103));
		System.out.println(adao.getBalance(101));
		adao.fundsTransfer(103, 101, 30000.0);
		System.out.println(adao.getBalance(103));
		System.out.println(adao.getBalance(101));
	}
}
