package com.jlcindia.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab58 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		CustomerDAO cdao=(CustomerDAO) ctx.getBean("cdao");
		
		//1.getCustomersByCid
		System.out.println("getCustomersByCid");
		CustomerTO cto=cdao.getCustomerByCid(201);
		System.out.println(cto);
		
		//2.getAllCustomers
		System.out.println("getAllCustomers");
		List<CustomerTO> list=cdao.getAllCustomers();
		for(CustomerTO ct:list)
			System.out.println(ct);
		
		//3.getCustomersByEmail
		System.out.println("getCustomersByEmail");
		cto=cdao.getCustomerByEmail("vas@jlc");
		System.out.println(cto);
		
		//4.getCustomersByCity
		System.out.println("getCustomersByCity");
		list=cdao.getCustomerByCity("Blore");
		System.out.println(cto);
		for(CustomerTO ct:list)
			System.out.println(ct);
		
		//5.getCustomerCount
		System.out.println("getCustomerCount");
		int count=cdao.getCustomersCount();
		System.out.println("No of Cust :"+count);
		
		//6.getCustomerCityByEmail
		System.out.println("getCustomerCityByEmail");
		String ci=cdao.getCustomerCityByEmail("vas@jlc");
		System.out.println(ci);
		
		//7.getCustomerPhoneByEmail
		System.out.println("getCustomerPhoneByEmail");
		long ph=cdao.getCustomerPhoneByEmail("vas@jlc");
		System.out.println(ph);
		
	}

}
