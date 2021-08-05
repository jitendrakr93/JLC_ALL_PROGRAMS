package com.jlcindia.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab59 {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("jlcindia.xml");
		CustomerDAO cdao=(CustomerDAO) ctx.getBean("cdao");
		
		//1.addCustomer
		CustomerTO cto=new CustomerTO(301,"Manish","manish@jlc",9999,"Blore");
		cdao.addCustomer(cto);
	
		//2.updateCustomer
		CustomerTO cto1=new CustomerTO(203, "vas", "vas@jlc", 8888, "Blore");
		cdao.updateCustomer(cto1);
		
		//3.deleteCustomer
		cdao.deleteCustomer(205);
		
		//4.getCustomerByCid
		System.out.println("getCustomerByCid");
		CustomerTO cto2=cdao.getCustomerByCid(203);
		System.out.println(cto2);
		
		//5.getAllCustomers
		System.out.println("getAllCustomers");
		List<CustomerTO> list=cdao.getAllCustomers();
		for(CustomerTO ct:list){
			System.out.println(ct);
		}
	}
}
