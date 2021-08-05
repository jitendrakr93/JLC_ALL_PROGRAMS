<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<center>
		<br>
		<h1>
			Java Learning Center<br />
			<h2>Student Search Form</h2>
			<form:form action="searchStudent.jlc" method="post"
				commandName="bidSearchCommand">
				<table>
					<tr>
						<td><p>Enter Batch ID</td>
						<td><form:input path="bid" /></td>
						<td><font color="red" size="5"><form:errors path="bid" /></font></td>
					</tr>
					<tr>
						<td align="center" colspan="3"><input type="submit"
							value="Search" /></td>
					</tr>
				</table>
			</form:form>
	</center>
</body>
</html>