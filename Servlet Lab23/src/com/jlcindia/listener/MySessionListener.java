package com.jlcindia.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent event) {
		HttpSession sess=event.getSession();
		ServletContext ctx=sess.getServletContext();
		int tv=(int) ctx.getAttribute("TV");
		tv++;
		ctx.setAttribute("TV", tv);
		int ta=(int) ctx.getAttribute("TA");
		ta++;
		ctx.setAttribute("TA", ta);
		
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		HttpSession sess=event.getSession();
		ServletContext ctx=sess.getServletContext();
		int ta=(int) ctx.getAttribute("TA");
		ta--;
		ctx.setAttribute("TA", ta);
	}

}
