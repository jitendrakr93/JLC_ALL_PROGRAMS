<!DOCTYPE html>
<html><body>
<script type="text/javascript">
var cd=new Date();
document.write("<p>"+cd);
var yy=cd.getYear();
var mm=cd.getMonth();
var dd=cd.getDate();
var hh=cd.getHours();
var min=cd.getMinutes();
var ssc=cd.getSeconds();
var ms=cd.getMilliseconds();
var ti=cd.getTime();
var mydate=""+hh+" : "+min+" : "+ssc+" : "+ms+" -- "+dd+"/"+mm+"/"+yy;
document.write("<p>"+mydate);
cd.setYear(2010);
cd.setMonth(0);
cd.setDate(1);
cd.setHours(10);
cd.setMinutes(30);
cd.setSeconds(30);
cd.setMilliseconds(300);
document.write("<p>"+cd);
var yy=cd.getYear();
var mm=cd.getMonth();
var dd=cd.getDate();
var hh=cd.getHours();
var min=cd.getMinutes();
var ssc=cd.getSeconds();
var ms=cd.getMilliseconds();
var ti=cd.getTime();
var mydate=""+hh+" : "+min+" : "+ssc+" : "+ms+" -- "+dd+"/"+mm+"/"+yy;
document.write("<p>"+mydate);
var d=new Date(2013,0,1,10,20,30,400);
document.write(d);
document.write(d.getFullYear());
window.status=d;
</script>
</body>
</html>