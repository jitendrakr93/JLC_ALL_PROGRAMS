<%@page isELIgnored="false"%>
<html><body>
<h1>This is Index Page</h1>
<%
request.setAttribute("NAME", "Srinivas");
%>
<br/>Name: ${NAME}
</body></html>