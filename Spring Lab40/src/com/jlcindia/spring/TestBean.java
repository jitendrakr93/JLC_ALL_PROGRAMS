package com.jlcindia.spring;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class TestBean {
	
	@Autowired
	ApplicationContext ctx=null;
	
	void showEnglish(){
		String m1=ctx.getMessage("username.required", null,null);
		System.out.println(m1);
		
		String m2=ctx.getMessage("password.required", new Object[]{"Password"}, null);
		System.out.println(m2);
		
		String m3=ctx.getMessage("errors.min", new Object[]{"Username","5"}, null);
		System.out.println(m3);
		
		String m4=ctx.getMessage("errors.max", new Object[]{"Username","10"}, null);
		System.out.println(m4);
																							
		String m5=ctx.getMessage("errors.range", new Object[]{"Password","6","12"}, null);
		System.out.println(m5);
		
		String m6=ctx.getMessage("errors.range", new Object[]{"Password","6","12"}, "Username range is Not OK",null);
		System.out.println(m6);
		
	}
	
	void showHindi(){
		Locale local=new Locale("hi");
		String m1=ctx.getMessage("username.required", null,local);
		System.out.println(m1);
		
		String m2=ctx.getMessage("password.required", new Object[]{"Password"}, local);
		System.out.println(m2);
		
		String m3=ctx.getMessage("errors.min", new Object[]{"Username","5"}, local);
		System.out.println(m3);
		
		String m4=ctx.getMessage("errors.max", new Object[]{"Username","10"}, local);
		System.out.println(m4);
																							
		String m5=ctx.getMessage("errors.range", new Object[]{"Password","6","12"}, local);
		System.out.println(m5);
		
		String m6=ctx.getMessage("errors.range", new Object[]{"Password","6","12"}, "Username range is Not OK",local);
		System.out.println(m6);
	}
}
