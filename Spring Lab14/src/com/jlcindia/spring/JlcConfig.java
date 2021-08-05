package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JlcConfig {
	@Bean
	public A aobj() {
		A aobj = new A();
		aobj.setA(10);
		aobj.setMsg("AAA");
		return aobj;
	}

	@Bean
	public B createB() {
		return new B(20, "BBB");
	}

	@Bean(name = "hello", autowire = Autowire.BY_TYPE)
	public Hello hello() {
		return new Hello();
	}
}
