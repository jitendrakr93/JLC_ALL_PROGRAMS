<html>
<body>
	<jsp:include page="header.jsp">
		<jsp:param value="Java Learning Center" name="cname" />
	</jsp:include>
	This is btm.jsp Home Page
	<br> which shows ${param.bn} branch details Contact email:
	${param.email}
	<jsp:include page="footer.jsp">
		<jsp:param value="Java Learning Center" name="cname" />
	</jsp:include>
</body>
</html>