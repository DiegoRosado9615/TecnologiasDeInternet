<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Spring Formulario-Práctica06</title>
		
</head>
<body>
	<style>
	body{
		background: blue;
		}
	</style>
<h2 align="center">Datos de registro</h2>
<div id="div-form" align="center">
<form:form method="post" action="addUsuario.html" class="formulario-clientes-01" onsubmit="validar()">

	<table bgcolor="#FFFFFF">
	<tr>
		<td><form:label path="primerNombre">Nombre</form:label></td>
		<td><form:input path="primerNombre" /></td> 
	</tr>
	
	<tr>
		<td><form:label path="email">Email</form:label></td>
		<td><form:input path="email" /></td>
	</tr>
	<tr>
		<td><form:label path="telefono">Telefono</form:label></td>
		<td><form:input path="telefono" /></td>
	</tr>
	<tr>
			<td>Sexo :</td>
			<td><form:radiobutton path="sexo" value="H" label="H" /> 
				<form:radiobutton path="sexo" value="M" label="M" />
			</td>
				
		</tr>
	<tr>
	<tr>
			<td>Series:</td>
			<td><form:select path="serie">
				   <form:option value="1" label="los simpson" />
				   <form:option value="2" label="padrinos magicos" />
				   <form:option value="3" label="Padre de familia" />
				   <form:option value="4" label="Steven universe" />
				    <form:option value="5" label="Hora de aventura" />
				   <form:option value="6" label="otro" />
			    </form:select></td>
			
	</tr>
	<tr>
			<td>Tipo de musica:</td>
			<td><form:select path="musica">
				   <form:option value="1" label="pop" />
				   <form:option value="2" label="rap" />
				   <form:option value="3" label="banda" />
				   <form:option value="4" label="metal" />
				    <form:option value="5" label="folk-rock" />
				   <form:option value="6" label="otro" />
			    </form:select></td>
			
	</tr>
		<td colspan="2">
			<input type="submit" value="Aceptar"/>
		</td>
	</tr>
</table>		
</form:form>
	</div>
	
	<script type="text/javascript">
		function validar(){
			
			
			var email = document.getElementById('email');
			var telefono = document.getElementById('telefono');
			
			
			
			var emailRegex = /^[-\w.%+]{1,64}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/i;
			var regCelular = /^[0-9]+$/;
			
			
		    	
			    	if (emailRegex.test(email.value)){
			   			if(regCelular.test(telefono.value)){
			   				
			   					window.alert("Datos válidos");	   				
			   			}else{
			   				window.alert("telefono inválido");	
			   			}
			    		
			 		}else {
			   			window.alert("La dirección de email es incorrecta.");
			  		}
		  		
		  		
			
			
		}
	
	</script>
	
	  
</body>
</html>