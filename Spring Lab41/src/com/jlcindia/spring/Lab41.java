package com.jlcindia.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab41 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(JlcConfig.class);
		TestBean tb=(TestBean) ctx.getBean("test");
		tb.showEnglish();
		tb.showHindi();

	}

}
