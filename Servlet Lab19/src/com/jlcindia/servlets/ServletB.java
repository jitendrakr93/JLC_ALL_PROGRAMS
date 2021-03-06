package com.jlcindia.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletB extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("**ServletB service() -> Started");
		RequestDispatcher rd=req.getRequestDispatcher("c.jlc");
		rd.forward(req, res);
		System.out.println("**ServletB service() -> Completed");
	}
}
