package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "regServlet", urlPatterns = { "/register.jlc" })
public class RegisterServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// 1.COLLECT DATA
		String name = req.getParameter("fname");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String gender = req.getParameter("gender");
		String courses[] = req.getParameterValues("course");
		String timings = req.getParameter("timings");
		String remarks = req.getParameter("remarks");

		// 2.PROCESS THE DATA
		String msg = "Your Enquiry Has been added successfully";
		System.out.println("Full name :" + name);
		System.out.println("Email ID :" + email);
		System.out.println("Phone No :" + phone);
		System.out.println("Gender :" + gender);
		System.out.println("Timings :" + timings);
		System.out.println("Course :" + courses);
		System.out.println("All Courses");
		if (courses != null)
			for (String c : courses) {
				System.out.println(c);
			}
		System.out.println("Remarks :" + remarks);

		// Send Response
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>Java Learning Center</h1>");
		out.print("<h1>" + msg + "</h1>");
		out.print("<h1>Full Name :" + name);
		out.print("<h1>Email ID: " + email);
		out.print("<h1>Phone No :" + phone);
		out.print("<h1>Gender :" + gender);
		out.print("<h1>Timings :" + timings);
		out.print("<h1>Course :" + courses);
		out.print("<h1>All Courses");
		if (courses != null)
			for (String c : courses) {
				out.println("</br>" + c);
			}
		System.out.println("<h1>Remarks :" + remarks);
	}
}
