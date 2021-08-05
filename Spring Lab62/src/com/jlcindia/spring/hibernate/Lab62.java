package com.jlcindia.spring.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab62 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		CustomerDAO cdao=(CustomerDAO) ctx.getBean("cdao");
		
		//1.addCustomer
		CustomerTO cto=new CustomerTO(401, "srini", "sri@jlc", 90099, "Blore");
		cdao.addCustomer(cto);
		
		//2.updateCustomer
		CustomerTO cto1=new CustomerTO(203, "vas", "vas@jlc", 8888, "Blore");
		cdao.updateCustomer(cto1);
		
		//3.deleteCustomer
		cdao.deleteCustomer(206);
		
		System.out.println("Check Your Database");
		//4.getCustomersByCid
		System.out.println("getCustomersByCid");
		cto=cdao.getCustomerByCid(301);
		System.out.println(cto);
	}

}
