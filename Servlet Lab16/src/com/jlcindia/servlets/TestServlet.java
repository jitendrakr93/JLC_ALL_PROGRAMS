package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		HttpSession hs=req.getSession();
		out.println("<h1>isNew :"+hs.isNew());
		Cookie cks[]=req.getCookies();
		out.println("<h1>"+cks);
		boolean jsidflag=false;
		boolean jlcflag=false;
		if(cks == null || cks.length==0){
			out.println("<h1>OOOOO No Coookiesss</h1>");
		}else{
			for(Cookie ck:cks){
				String cn=ck.getName();
				String cv=ck.getValue();
				out.println("<h1>"+cn+"-------"+cv+"</h1>");
				if(cn.equals("JSESSIONID")){
					jsidflag=true;
				}
				if(cn.equals("JLC")){
					jlcflag=true;
					ck.setMaxAge(0);
					res.addCookie(ck);
				}
			}
		}
		if(jsidflag)
			out.println("<h1>JSESSIONID Cookie is Found...");
			else
				out.println("<h1>JSESSIONID Cookie is Not Found...");
		if(jlcflag)
			out.println("<h1>JLC Cookie is Found...");
		else
			out.println("<h1>JLC Cookie is Not Found...");
		Cookie c1=new Cookie("JLC", "Welcome to JLC");
		res.addCookie(c1);
		Cookie c2=new Cookie("EM", "sri@jlc");
		res.addCookie(c2);
		Cookie c3=new Cookie("PH", "9999");
		res.addCookie(c3);
			
		}
	}

