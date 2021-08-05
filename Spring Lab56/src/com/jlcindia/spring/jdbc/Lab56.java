package com.jlcindia.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab56 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		CustomerDAO cdao=(CustomerDAO) ctx.getBean("cdao");
		//1.addCustomer
		CustomerTO cto=new CustomerTO(204, "srini", "sri@jlc", 9999, "Blore");
		cdao.addCustomer(cto);
		
		//2.updateCustomer
		CustomerTO cto1=new CustomerTO(205, "vas", "vas@jlc", 8888, "Blore");
		cdao.updateCustomer(cto1);
		
		//3.deleteCustomer
		cdao.deleteCustomer(204);
		System.out.println("Check your Database");
	}

}
