package com.jlcindia.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Lab37 {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("jlcindia.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		System.out.println("Spring Container Is Resdy");
		System.out.println("--------------------------");
		Hello hello=(Hello) factory.getBean("HELLO");
		hello.show();
		System.out.println("---------------------------");
		System.out.println("Spring Container going to shutdown...");
	}

}
