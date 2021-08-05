package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JlcConfig {
	@Bean(name="HELLO",autowire=Autowire.BY_NAME,initMethod="myInit",destroyMethod="mycleanup")
	public Hello hello(){
		Hello h=new Hello(99);
		h.setStr("Hello Guys");
		return h;
	}
	@Bean
	public static MyBeanPostProcessor myBeanPostProcessor(){
		return new MyBeanPostProcessor();
	}
	@Bean
	public B getB(){
		return new B(88,"BBB");
	}
	@Bean(name="AO")
	public A getA(){
		A aobj=new A();
		aobj.setA(99);
		aobj.setMsg("AAA");
		return aobj;
	}
}
