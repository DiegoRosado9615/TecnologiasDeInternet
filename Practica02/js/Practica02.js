alert("Gracias por ingresar a nuestra formulario");






function nombreCorto(nombre){
	$("#result").text("");
	if (nombre.length<=30) {
		alert("Nombre guardado")
	}
	alert("tu nombre no fue guardad")
}


function validarEmail(email) {
	var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
	return re.test(email);
}
result="";
function validate() {
	$("#result").text("");
	var dirrecionEmail = $("#email").val();
	if (validarEmail(dirrecionEmail)) {
		$("#result").text(dirrecionEmail + " es valido :)");	
		$("#result").css("color", "green");
	} else {
		$("#result").text(dirrecionEmail + " No es correcto");
		$("#result").css("color", "red");
	}
	return false;
}
	$("#validate").bind("click", validate);	

let d = new Date();
document.body.innerHTML = "<h1>Time right now is:  " + d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds()"</h1>"
