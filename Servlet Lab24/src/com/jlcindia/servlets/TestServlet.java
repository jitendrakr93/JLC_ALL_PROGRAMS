package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String em=req.getParameter("email");
		System.out.println(em);
		String method=req.getMethod();
		System.out.println(method);
		
		PrintWriter out=res.getWriter();
		HttpSession hs=req.getSession();
		out.println("<h1>isNew :"+hs.isNew());
		out.println("<h1>SID :"+hs.getId());
		out.println("<h1>CreationTime :"+hs.getCreationTime());
		out.println("<h1>LastAccessTime :"+hs.getLastAccessedTime());
		out.println("<h1>MaxInactiveInterval :"+hs.getMaxInactiveInterval());
		hs.setMaxInactiveInterval(10*60);
		out.println("<h1>MaxInactiveInterval :"+hs.getMaxInactiveInterval());
		ServletContext scContext=hs.getServletContext();
		hs.invalidate();
		hs=req.getSession();
		out.println("<h1>isNew :"+hs.isNew());
		out.println("<h1>SID :"+hs.getId());
		
	}
}
