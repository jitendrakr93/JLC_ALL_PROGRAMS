package com.jlcindia.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Lab35 {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		//AbstractApplicationContext ctx=new FileSystemXmlApplicationContext("");
		System.out.println("Spring Container is Ready");
		System.out.println("--------------------------");
		Hello hello=(Hello) ctx.getBean("HELLO");
		hello.show();
		System.out.println("----------------------------");
		System.out.println("Spring Container going to shutdown");
		ctx.registerShutdownHook();
	}

}
