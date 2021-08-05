package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//1. Request Parameter
		String un=req.getParameter("uname");
		String pw=req.getParameter("password");
		
		//2.display request parameters
		PrintWriter out=res.getWriter();
		out.println("<h1>Username :"+un);
		out.println("<br/>Password :"+pw);
		out.println("<hr/>");
		out.println("Request Headers");
		
		//3.Request Headers
		Enumeration e=req.getHeaderNames();
		while (e.hasMoreElements()) {
			String hn=e.nextElement().toString();
			String hv=req.getHeader(hn);
			out.println("<br/>"+hn+" : "+hv);	
		}
		out.println("<hr/>");
		out.println("Locale Info");
		
		//4. Locales supported by Browser.
		out.println("<br/>req.getLocale(): "+req.getLocale());
		out.println("<hr/>");
		out.println("Other Info");
		
		//5. Other information from Request
		out.println("<br/>METHOD : "+req.getMethod());
		out.println("<br/>RequestURI :"+req.getRequestURI());
		out.println("<br/>RequestURL :"+req.getRequestURL());
		out.println("<br/>getProtocol :"+req.getProtocol());
		out.println("<br/>ContentLength :"+req.getContentLength());
		out.println("<br/>ContentLength :"+req.getContentType());
		out.println("<br/>RemoteAddr :"+req.getRemoteAddr());
		out.println("<br/>RemotePort :"+req.getRemotePort());
		out.println("<br/>RemoteHost :"+req.getRemoteHost());
		out.println("<br/>ServerPort :"+req.getServerPort());
		out.println("<br/>ServerName :"+req.getServerName());
		out.println("<br/>QueryString :"+req.getQueryString());
		out.println("<br/>ServletPath :"+req.getServletPath());
		out.println("<br/>ContextPath :"+req.getContextPath());
	}
}
