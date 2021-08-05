<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java Script Example</title>
<script type="text/javascript">
function process(){
	var ref=document.getElementById("uname");
	alert(ref);
	alert(ref.value);
	var ref2=document.getElementsByTagName("input");
	alert("Length "+ref2.length);
	alert(ref2[0].value);
	alert(ref2[1].value);
}

function submitRequest(){
	document.saveForm.submit();
}
</script>
</head>
<body>
<center>
<h1 id='msg'>THIS IS INDEX JSP</h1>
<h1>THIS IS INDEX JSP</h1>
<div id='divId'>DIV TAG</div>
<a href="#" onclick="process()">CLICK HERE</a><br/>
<form name="saveForm" action="save.jlc">
<input type="text" id="uname" value="Srinivas"/>
<input type="button" id="uname" value="Save" onclick="submitRequest()"/>
</form>
</center>
</body>
</html>