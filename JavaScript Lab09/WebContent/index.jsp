<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java Script Example</title>
<script type="text/javascript">
function calculate(){
var str="Hello";
document.write("<h1>");
document.write("<br/>"+str);
document.write("<br/>"+str.length);
document.write("<br/>"+str.charAt(3));
document.write("<br/>"+str.toLowerCase());
document.write("<br/>"+str.toUpperCase());
document.write("<br/>"+str.fontsize(18));
document.write("<br/>"+str.fontcolor('red'));
document.write("<br/>"+str.substring(1,4));
document.write("<br/>"+str.link("http://www.jlcindia.com"));
document.write("<hr/>");
var str1='2';
document.write("<br/>A "+str1.sup());
document.write("<br/>A "+str1.sub());

var dt=new Date();
document.write("<hr/>");
document.write("<br/>"+dt);
document.write("<br/>"+dt.getDate());
document.write("<br/>"+dt.getDay());
document.write("<br/>"+dt.getMonth());
document.write("<br/>"+dt.getFullYear());
document.write("<hr/>");
var dt1=new Date(2012,6,12,8,23,34,400);
document.write("<br/>"+dt1);
dt1.setDate(25);
dt1.setDate(8);
dt1.setDate(2015);
document.write("<br/>"+dt1);
document.write("<hr/>");
var names=new Array("Sri","Nivas","Kishore","Siva");
document.write("<br/>"+names.length);
document.write("<br/>"+names[0]);
document.write("<br/>"+names[1]);
document.write("<br/>"+names[2]);
document.write("<br/>"+names[3]);
document.write("<hr/>");
var courses=new Array("Java","JDBC","JSP");
var Arr=names.concat(courses);
document.write("<br/>"+new Arr.length);
for(var ab in new Arr){
	document.write("<br/>"+new Arr[ab]);
}
}
</script>
</head>
<body>
<center>
<h1 id='msg'>THIS IS INDEX JSP</h1>
<input type="submit" value="Calculate" onclick="calculate()"/>
</center>

</body>
</html>