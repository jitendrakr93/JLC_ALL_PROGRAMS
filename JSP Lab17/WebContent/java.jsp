<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<c:import url="header.jsp">
		<c:param name="companyName" value="Java Learning Center"></c:param>
	</c:import>
	<h1>
		This is java.jsp<br> Hello ! ${param.stuName},<br> You have selected
		${param.couName}
	</h1>
	<c:import url="footer.jsp">
		<c:param name="companyName" value="Java Learning Center" />
	</c:import>
</body>
</html>