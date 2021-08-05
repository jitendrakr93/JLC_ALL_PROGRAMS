package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab51 {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JlcConfig.class);
		CustomerService cs=(CustomerService) ctx.getBean("cs");
		cs.addCustomer();
		System.out.println("---------------------------------");
		cs.updateCustomer();
		System.out.println("----------------------------------");
		AccountService as=(AccountService) ctx.getBean("as");
		as.mydeposit();
		System.out.println("------------------------------------");
		as.getBal();
		System.out.println("-------------------------------------");
		try{
			as.mywithdraw();
		}catch(Exception e){
			System.out.println("Sorry-----");
		}

	}

}
