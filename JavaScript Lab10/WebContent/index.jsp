<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java Script Example</title>
<script type="text/javascript" src="jlc.js"></script>
<style>
.bodyClass{
background-color: red;
}
</style>
</head>
<body class="bodyClass">
<center>
<form name="delForm" action="delete.jlc">
<input type="text" style="font-size:25; color: yellow;background-color: black;"/>
<input type="button" value="Show Alert" onclick="displayAlert()" style="font-size:25; color: yellow;background-color: black;"/>
<input type="button" value="Show Prompt" onclick="displayPrompt()"/><br/>
<input type="button" value="Delete" onclick="displayConfirm()"/>
<input type="button" value="Open" onclick="openWindow()"/>
</form>
</center>
</body>
</html>