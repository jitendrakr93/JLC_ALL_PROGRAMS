package com.jlcindia.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//1.COLLECTING CLIENT DATA
		String unm=req.getParameter("username");
		String pwd=req.getParameter("password");
		String msg="";
		
		//2.VERIFYING CLIENT DATA
		if(unm.equals(pwd)){
			msg="<h1>Login Success<br/>Welcome, This is JLC Home Page";
		}else{
			msg="<h1>Login Failed<br/>Invalid Username or Password";
		}
		
		//3.PREPARING THE RESPONSE
		Writer out=res.getWriter();
		out.write(msg);
	}
}
