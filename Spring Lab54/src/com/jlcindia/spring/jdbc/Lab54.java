package com.jlcindia.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab54 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		TestService ts=(TestService) ctx.getBean("ts");
		ts.showOracleInfo();
		ts.showMySQLInfo();
	}
}
