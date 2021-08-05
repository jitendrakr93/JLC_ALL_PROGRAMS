package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="demoServlet",urlPatterns={"/demo.jlc"},initParams={@WebInitParam(name="city",value="Chennai")})
public class DemoServlet extends HttpServlet{

	@Override
	public void init(ServletConfig sc) throws ServletException {
		System.out.println("**DemoServlet-init()");
		String ci=sc.getInitParameter("city");
		System.out.println(ci);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("DemoServlet-service()");
		String nm=req.getParameter("name");
		String em=req.getParameter("email");
		String ip=req.getRemoteAddr();
		String msg="<h1>Hello !"+nm+"<br>";
		msg=msg+"Your Email id is "+em+"<br>";
		msg=msg+"You are sending the requesting from IP Address :"+ip;
		req.setAttribute("MSG", msg);
		PrintWriter out=res.getWriter();
		out.println(msg);
	}
	@Override
	public void destroy() {
		System.out.println("DemoServlet-destroy()");
	}


}
