package com.jlcindia.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener{

	public MySessionListener() {
		System.out.println("**MySessionListener() Def Cons");
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("**Session Created");
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("**Session Destroyed");
		
	}

}
