package com.jlcindia.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor3 extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj)
			throws Exception {
		System.out.println("MyInterceptor3 -> preHandle "+obj);
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj,
			ModelAndView modelAndView) throws Exception {
		System.out.println("MyInterceptor3 -> postHandle "+obj);
	}
}

