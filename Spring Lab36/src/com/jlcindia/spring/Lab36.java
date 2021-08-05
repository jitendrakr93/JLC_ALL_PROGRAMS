package com.jlcindia.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Lab36 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(JlcConfig.class);
		System.out.println("Spring Container is Ready...");
		System.out.println("------------------------------");
		Hello hello=(Hello) ctx.getBean("HELLO");
		hello.show();
		System.out.println("--------------------------------");
		System.out.println("Spring Container going to shutdown..");
		ctx.registerShutdownHook();
	}

}
