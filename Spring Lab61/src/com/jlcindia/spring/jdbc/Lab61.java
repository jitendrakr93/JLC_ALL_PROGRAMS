package com.jlcindia.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab61 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		CustomerDAO cdao=(CustomerDAO) ctx.getBean("cdao");
		
		//1.AddCustomer
		CustomerTO cto=new CustomerTO(206, "srini", "sri@jlc", 9999, "Blore");
		cdao.addCustomer(cto);
		System.out.println("Call Completed");

	}

}
