package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab49 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jlcindia.xml");
		CustomerService cs = (CustomerService) ctx.getBean("cs");
		cs.addCustomer();
		cs.updateCustomer();
		AccountService as = (AccountService) ctx.getBean("as");
		as.mydeposit();
		as.getBal();
		try {
			as.mywithdraw();
		} catch (Exception e) {
			System.out.println("Sorry---");
		}
	}
}
