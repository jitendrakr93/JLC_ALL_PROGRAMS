package com.jlcindia.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab60 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		CustomerDAO cdao=(CustomerDAO) ctx.getBean("cdao");
		//1.Add Customer
		CustomerTO cto=new CustomerTO(208, "srini", "sri@jlc", 9999, "Blore");
		cdao.addCustomer(cto);
		
		//2.Get All Customer
		System.out.println("getAllCustomer");
		List<CustomerTO> list=cdao.getAllCustomers();
		for(CustomerTO ct: list){
			System.out.println(ct);
		}

	}

}
