package com.jlcindia.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyRequestListener implements ServletRequestListener {
	public MyRequestListener() {
		System.out.println("MyRequestListener() def constructor");
	}

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("**requestDestroyed");

	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("\n**requestInitialized");

	}

}
