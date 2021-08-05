package com.jlcindia.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SearchBookServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("------SearchBookServlet------------");
		String cat=req.getParameter("category");
		if(cat!=null && cat.equals("Java")){
			ArrayList<String> blist=new ArrayList<>();
			blist.add("Java");
			blist.add("JDBC");
			blist.add("Servlets");
			blist.add("JSP");
			blist.add("EJB");
			blist.add("RMI");
			HttpSession sess=req.getSession();
			sess.setAttribute("BOOKS", blist);
		}else{
			req.setAttribute("MSG", "No book found with category"+cat);
		}
		RequestDispatcher rd=req.getRequestDispatcher("showbooks.jsp");
		rd.forward(req, res);
	}
}
