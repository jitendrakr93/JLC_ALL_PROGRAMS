package com.jlcindia.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("** service of TestServlet");
		String unm=req.getParameter("uname");
		String pwd=req.getParameter("password");
		Writer out=res.getWriter();
		out.write("<h1>Hi,Welcome to JLC");
		String page="";
		if(unm.equals(pwd)){
			page="/WEB-INF/home.html";
			RequestDispatcher rd=req.getRequestDispatcher(page);
			rd.forward(req, res);
		}else {
			page="/WEB-INF/login.html";
			RequestDispatcher rd=req.getRequestDispatcher(page);
			rd.forward(req, res);
		}
		out.write("<h1>Again,Welcome to JLC");
		System.out.println("**service completed -LAST STATEMENT**");
		
	}
}
