package com.jlcindia.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession sess=req.getSession();
		Writer out=res.getWriter();
		out.write("<h1><br/>ID :"+sess.getId());
		out.write("<h1>isNew :"+sess.isNew());
	}
}
