package com.jlcindia.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyContextListener implements ServletContextListener{

	public MyContextListener() {
		System.out.println("**MyContextListener() Def Cons");
	}
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		ServletContext ctx=event.getServletContext();
		System.out.println("**contextDestroyed :"+ctx);
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext ctx=event.getServletContext();
		System.out.println("**contextInitialized :"+ctx);
		
	}

}
