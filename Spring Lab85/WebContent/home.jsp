<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<body>
	<h1>
		<spring:message code="jlc.header" text="Java Learning Center" />
	</h1>
	<h1>
		<spring:message code="jlc.body" text="Welcome to JLC" />
	</h1>
	<br />
	<br />
	<h3>
		Language : <a href="?language=en">English</a>| <a href="?language=hi">Hindi</a>
	</h3>
</body>
</html>