<html>
<body>
<h1>
<br/>1)Storing attribute in Context Scope
<br/>A)Using PageContext object
<%
pageContext.setAttribute("MSG1", "ServletContext -> Message1",PageContext.APPLICATION_SCOPE);
%>
<br/>B)Using ServletContext object
<%
application.setAttribute("MSG2", "ServletContext -> Message 2");
%>
<br/>2)Storing attribute in Session Scope
<br/>A)Using PageContext object
<%
pageContext.setAttribute("MSG3","HttpSession -> Message 3",PageContext.SESSION_SCOPE);
%>
<br/>B)Using HttpSession object
<%
session.setAttribute("MSG4", "HttpSession -> Message 4");
%>
<br/>3)Storing attribute in Request Scope
<br/>A)Using PageContext object
<%
pageContext.setAttribute("MSG5", "ServletRequest -> Message5",PageContext.REQUEST_SCOPE);
%>
<br/>B)Using Request object
<%
request.setAttribute("MSG6", "ServletRequest -> Message 6");
%>
<br/>4)Storing attribute in Page Scope
<br/>A)Using PageContext object
<%
pageContext.setAttribute("MSG7", "Page -> Message 7",PageContext.PAGE_SCOPE);
pageContext.setAttribute("MSG8", "Page -> Message 8");
%>
<hr/>
<br/><%=pageContext.getAttribute("MSG1", PageContext.APPLICATION_SCOPE)%>
<br/><%=pageContext.getAttribute("MSG2", PageContext.APPLICATION_SCOPE)%>
<br/><%=pageContext.getAttribute("MSG3", PageContext.SESSION_SCOPE)%>
<br/><%=pageContext.getAttribute("MSG4", PageContext.SESSION_SCOPE)%>
<br/><%=pageContext.getAttribute("MSG5", PageContext.REQUEST_SCOPE)%>
<br/><%=pageContext.getAttribute("MSG6", PageContext.REQUEST_SCOPE)%>
<br/><%=pageContext.getAttribute("MSG7", PageContext.PAGE_SCOPE)%>
<br/><%=pageContext.getAttribute("MSG8")%>






</h1>
</body>
</html>