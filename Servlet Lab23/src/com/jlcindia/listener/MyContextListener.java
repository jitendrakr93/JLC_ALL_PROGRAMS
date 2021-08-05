package com.jlcindia.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyContextListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("**ContextDestroyed");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("**ContextInitialized");
		ServletContext ctx=event.getServletContext();
		ctx.setAttribute("TV", 0);
		ctx.setAttribute("TA", 0);
	}

}
