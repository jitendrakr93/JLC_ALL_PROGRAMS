<html><body><h1>
<hr/>USING useBean and other tags
<jsp:useBean id="ST" class="com.jlcindia.student.Student" scope="session">
</jsp:useBean>
<jsp:setProperty property="sid" name="ST" value="88"/>
<jsp:setProperty property="name" name="ST" value="Nivas"/>
<jsp:setProperty property="phone" name="ST" value="31903290"/>
<br/>
Sid :<jsp:getProperty property="sid" name="ST"/><br/>
Name :<jsp:getProperty property="name" name="ST"/><br/>
Phone :<jsp:getProperty property="phone" name="ST"/><br/>
</h1></body></html>