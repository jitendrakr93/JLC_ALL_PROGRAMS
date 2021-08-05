package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JlcConfig {

	@Bean(autowire=Autowire.BY_TYPE)
	public Hello hello(){
		return new Hello();
	}
	
}
