<%@page import="com.jlcindia.student.Student"%>
<html>
<body><h1>
<%
Student st=new Student();
st.setSid(99);
st.setName("Sri");
st.setPhone(65799999);
session.setAttribute("STUD", st);
%>
<hr/>
<%
Student std=(Student)session.getAttribute("STUD");
%>
Sid:<%=std.getSid()%><br/>
Name :<%=std.getName() %><br/>
Phone :<%=std.getPhone()%><br/>
</h1>
</body>
</html>