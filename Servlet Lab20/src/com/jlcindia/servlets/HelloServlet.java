package com.jlcindia.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	System.out.println("**HelloServlet class service() started");
	Writer out=res.getWriter();
	out.write("<h1>Verify the server console");
	System.out.println("HelloServlet class service() Completed");
}
}
