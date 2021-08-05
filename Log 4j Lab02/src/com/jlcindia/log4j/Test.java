package com.jlcindia.log4j;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
/* Using Basic Configurator (Console Appender & Pattern Layout */
public class Test {
	static{
		Layout lay=new PatternLayout(" '%d' '%C' '%p' '%c' '%M' '%m' '%l' %n ");
		Appender app=null;
		try{
			app=new ConsoleAppender(lay);
			BasicConfigurator.configure(app);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	static Logger log=Logger.getLogger(Test.class);
	public static void main(String[] args) {
		Logger root=Logger.getRootLogger();
		root.setLevel(Level.DEBUG);
		log.info("--Main Method Started-- ");
		log.debug("Values as CLA :"+args.length);
		for(int i=0;i<2;i++){
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		if(args.length==0){
			log.warn("No command line argument Specified");
		}
		log.debug("1st Value in Main :"+args[0]);
		log.debug("2nd Value in Main :"+args[1]);
		log.info("Creating JlcOperator object");
		JlcOperator op=new JlcOperator();
		log.info("JlcOperator object created");
		log.info("Invoking the getRemainder () from JlcOperator");
		int rem=op.getRemainder(args[0], args[1]);
		System.out.println("Remainder in main :"+rem);
		log.info("-Main Method Completed-");
		
	}
}
