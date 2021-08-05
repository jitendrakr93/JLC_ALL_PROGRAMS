package com.jlcindia.spring.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab66 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		CustomerDAO cdao=(CustomerDAO) ctx.getBean("cdao");
		//1.addCustomer
		CustomerTO cto=new CustomerTO(119,"srini", "sri@jlc", 789456, "Blore");
		cdao.addCustomer(cto);
		System.out.println("Check your Database");

	}

}
