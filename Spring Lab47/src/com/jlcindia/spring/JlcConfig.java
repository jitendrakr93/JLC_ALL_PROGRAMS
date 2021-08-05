package com.jlcindia.spring;

import org.springframework.context.annotation.Configuration;

@Configuration
public class JlcConfig {
	public Student student(){
		Student st=new Student();
		st.setName("Sri");
		return st;
	}
}
