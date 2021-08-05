<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html><body><center>
		<br><h1>Java Learning Center<br />
			<h2>Student Search Form</h2>
			<form:form action="searchStudent.jlc" method="post"
				commandName="sidSearchCommand">
				<table>
					<tr>
						<td><p>Enter Student ID:</td>
						<td><form:input path="sid" /></td>
						<td><font color="red" size="5"> <form:errors
									path="sid" />${msg}</font></td>
					</tr>
					<tr>
						<td align="center" colspan="3"><input type="submit"
							value="Search"></td>
					</tr>
				</table>
			</form:form>
	</center>
</body>
</html>