package com.jlcindia.spring;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class JlcConfig {
	/*@Bean
	public AnnotationAwareAspectJAutoProxyCreator autoProxyCreator(){
		return new AnnotationAwareAspectJAutoProxyCreator();
	}*/
	@Bean
	public LogService logService(){
		return new LogService();
	}
	@Bean
	public SecurityService securityService(){
		return new SecurityService();
	}
	@Bean
	public TxService txService(){
		return new TxService();
	}
	@Bean(name="as")
	public AccountService accountService(){
		return new AccountService();
	}
	@Bean(name="cs")
	public CustomerService customerService(){
		return new CustomerServiceImpl();
	}
}
