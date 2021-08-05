<html><body>
<jsp:useBean id="ST1" class="com.jlcindia.student.Student"/>
<jsp:setProperty property="sid" name="ST1"/>
<hr/><h1>Sid:
<jsp:getProperty property="sid" name="ST1"/>
<br/>Name:
<jsp:getProperty property="name" name="ST1"/>
<br/>Phone:
<jsp:getProperty property="phone" name="ST1"/>
</h1>
</body>
</html>