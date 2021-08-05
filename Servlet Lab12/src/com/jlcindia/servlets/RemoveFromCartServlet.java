package com.jlcindia.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RemoveFromCartServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("-----RemoveFromCartServlet-------");
		HttpSession sess=req.getSession(false);
		if(sess == null){
			req.setAttribute("MSG", "Session is destroyed");
		}else{
			String bnm=req.getParameter("bname");
			//Removing the client selected book from session
			sess.removeAttribute(bnm);
		}
		RequestDispatcher rd=req.getRequestDispatcher("showcart.jlc");
		rd.forward(req, res);
	}
}
