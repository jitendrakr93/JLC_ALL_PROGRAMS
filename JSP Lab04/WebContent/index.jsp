<%@page import="java.util.*" session="true"%>
<%@page language="java"%>
<html>
<body>
<center>
<h1>This is JSP<br/>
<%=session %> <%--no compilation error --%>
<br/>
<%=session.getId() %>
</h1>
</center>
</body>
</html>