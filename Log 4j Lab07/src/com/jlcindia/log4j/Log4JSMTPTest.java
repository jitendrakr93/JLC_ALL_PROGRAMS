package com.jlcindia.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
/*Using Property Configurator (SMTPAppender)*/
public class Log4JSMTPTest {
	static{
		PropertyConfigurator.configure("src/jlc-log4j.properties");
	}
	static Logger log=Logger.getLogger(Log4JSMTPTest.class);
	public static void main(String[] args) {
		System.out.println("Started");
		log.error("This is TEST MAIL");
		System.out.println("Main Completed");
	}
}
