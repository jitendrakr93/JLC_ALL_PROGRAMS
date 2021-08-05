package com.jlcindia.util;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

@WebListener
public class Log4Util implements ServletContextListener{
	Logger log=Logger.getLogger(Log4Util.class);

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}
	public static ServletContext context;
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		PropertyConfigurator.configure("log4j.properties");
		log.info("Log4J System is initialized at Container Startup");
		
	}

}
