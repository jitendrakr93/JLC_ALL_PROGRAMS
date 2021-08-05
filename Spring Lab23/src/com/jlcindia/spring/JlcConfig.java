package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JlcConfig {
	
	@Bean
	public Hello hello(){
		Hello h=new Hello();
		return h;
	}
	
	/*@Bean
	public A createA(){
		A aobj=new A();
		aobj.setA(88);
		aobj.setMsg("Hello Guys");
		return aobj;
	}*/
	
	@Bean(autowire=Autowire.BY_TYPE)
	public B createB(){
		return new B(99,"Hai Guys");
	}
}
