package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JlcConfig {
	@Bean(name="a01")
	public A createA1(){
		A aobj=new A();
		aobj.setA(10);
		aobj.setMsg("AAA");
		return aobj;
	}
	
	@Bean(name="a02")
	public A createA2(){
		A aobj=new A();
		aobj.setA(10);
		aobj.setMsg("AAA");
		return aobj;
	}
	
	@Bean
	public B createB(){
		B bobj= new B(20,"BBB");
		return bobj;
	}
	
	@Bean(autowire=Autowire.BY_TYPE)
	public Hello hello(){
		return new Hello();
	}
}
