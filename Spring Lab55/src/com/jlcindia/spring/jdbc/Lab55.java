package com.jlcindia.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab55 {
	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JlcConfig.class);
		TestService ts=(TestService) ctx.getBean("ts");
		ts.showOracleInfo();
		ts.showMySQLInfo();
	}
}
