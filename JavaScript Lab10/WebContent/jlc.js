function displayAlert() {
	alert('Alert Message');
}

function displayPrompt() {
	var res=window.prompt("Enter Name", "Srinivas");
	alert(res);
}

function displayConfirm() {
	var res=window.confirm("Are you sure to delete");
	if(res){
		document.delForm.submit();
	}
	
}

function openWindow(){
	var newWin=window.open("http://www.jlcindia.com", 'New Win', 'height=300,width=500');
}
