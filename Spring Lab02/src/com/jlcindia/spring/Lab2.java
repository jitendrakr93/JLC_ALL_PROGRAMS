package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab2 {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JLCConfig.class);
		System.out.println("Container is ready");
		System.out.println("-------------------");
		Hello h=(Hello) ctx.getBean("hello");
		h.show();
	}

}
