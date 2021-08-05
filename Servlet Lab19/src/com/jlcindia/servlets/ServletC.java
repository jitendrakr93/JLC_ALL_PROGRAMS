package com.jlcindia.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletC extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("**ServletC service() -> Started");
		Writer out=res.getWriter();
		out.write("<h2><br/>Verify the Server console");
		System.out.println("**ServletC Service() -> completed");
	}

}
