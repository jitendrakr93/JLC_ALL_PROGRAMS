package com.jlcindia.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="testServlet",urlPatterns="/test.jlc")
public class TestServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("TestServlet -> service()");
		System.out.println("Accessing session object");
		HttpSession sess=req.getSession();
		String eml=req.getParameter("email");
		ServletContext ctx=getServletContext();
		System.out.println("Storing attribute in Context");
		ctx.setAttribute("email", eml);
		System.out.println("Replacing attribute in Context");
		ctx.setAttribute("email", "nivas@jlc.com");
		System.out.println("Removing attribute in context");
		ctx.removeAttribute("email");
		System.out.println("Invalidating Session Object");
		sess.invalidate();
		Writer out=res.getWriter();
		out.write("<h1>Verify the server console");
	}
}
