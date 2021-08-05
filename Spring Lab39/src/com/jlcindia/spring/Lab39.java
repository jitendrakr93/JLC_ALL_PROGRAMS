package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab39 {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JlcConfig.class);
		TestBean tb=(TestBean) ctx.getBean("test");
		tb.show();

	}

}
