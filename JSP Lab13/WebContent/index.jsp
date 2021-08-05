<html><body>
<%
pageContext.setAttribute("MSG","Page Scope Message");
pageContext.setAttribute("MSG", "Request Message",PageContext.REQUEST_SCOPE);
pageContext.setAttribute("MSG", "Session Message", PageContext.SESSION_SCOPE);
pageContext.setAttribute("MSG", "Context Message",PageContext.APPLICATION_SCOPE);
pageContext.setAttribute("ERROR", "ERROR MESSAGE",PageContext.APPLICATION_SCOPE);
%>
<h1>USING WEB CONTAINER<br/>
<%
String msg1=request.getAttribute("MSG").toString();
String msg2=session.getAttribute("MSG").toString();
String msg3=application.getAttribute("MSG").toString();
%>
<%=msg1 %><br/>
<%=msg2 %><br/>
<%=msg3 %><br/>
<hr/>USING PAGE CONTEXT OBJECT<br/>
<%
String data1=pageContext.getAttribute("MSG").toString();
String data2=pageContext.getAttribute("MSG",PageContext.PAGE_SCOPE).toString();
String data3=pageContext.getAttribute("MSG",PageContext.REQUEST_SCOPE).toString();
String data4=pageContext.getAttribute("MSG",PageContext.SESSION_SCOPE).toString();
String data5=pageContext.getAttribute("MSG",PageContext.APPLICATION_SCOPE).toString();
%>
<%=data1 %><br/>
<%=data2 %><br/>
<%=data3 %><br/>
<%=data4 %><br/>
<%=data5 %><br/>
<hr/>
<%
Object obj1=pageContext.findAttribute("MSG");
Object obj2=pageContext.findAttribute("ERROR");
%>
<%=obj1%><br/>
<%=obj2%>
</h1>
</body>
</html>