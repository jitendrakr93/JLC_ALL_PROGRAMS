package com.jlcindia.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor2 implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object handlerMethod, Exception ex)
			throws Exception {
		System.out.println("MyInterceptor2 -> afterCompletion "+handlerMethod+"\t"+ex);
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView modelAndView)
			throws Exception {
		System.out.println("MyInterceptor2 -> postHandle "+obj);
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		System.out.println("\nMyInterceptor2 -> preHandle "+ obj);
		return true;
	}

}
