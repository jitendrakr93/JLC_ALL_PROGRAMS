package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab23 {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JlcConfig.class);
		System.out.println("Spring Container is Ready");
		System.out.println("---------------");
		Hello hello=(Hello) ctx.getBean("hello");
		hello.show();

	}

}
