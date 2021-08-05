<html>
<body>
	<jsp:include page="header.jsp">
		<jsp:param name="cname" value="Java Learning Center" />
	</jsp:include>
	<form action="test.jsp">
		<h1>Select the branch</h1>
		<select name="branch">
			<option value="MKR">Mathikere</option>
			<option value="BTM">BTM Layout</option>
		</select> <input type="submit" value="Submit" />
	</form>
	<jsp:include page="footer.jsp">
		<jsp:param name="cname" value="Java Learning Center" />
	</jsp:include>
</body>
</html>