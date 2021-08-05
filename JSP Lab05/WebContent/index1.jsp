<%@page import="java.io.IOException"%>
<%@page extends="javax.servlet.http.HttpServlet"%>
<html>
<body>
<h1>
<%!
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException ,IOException{
	System.out.println("Http Service method is called");
	_jspService(req, res);
}
%>
THIS IS JSP<br/>
</h1>
</body>
</html>