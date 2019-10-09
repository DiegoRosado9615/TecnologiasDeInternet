<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Practica 05 JSP</title>
	
</head>
<body>
<h2 align="center">Solicitud </h2>
<div id="div01" align="center">
<form:form method="post" action="addContact.html" class="formulario" >

	<table bgcolor="#518C62">
	<tr>
		<td><form:label path="Nombre">Nombre</form:label></td>
		<td><form:input path="Nombre" /></td> 
	</tr>
	<tr>
		<td><form:label path="Apellido">Apellido </form:label></td>
		<td><form:input path="Apellido" /></td>
	</tr>
	<tr>
		<td><form:label path="correoElectronico">Correo electronico</form:label></td>
		<td><form:input path="correoElectronico" /></td>
	</tr>
	<tr>
		<td><form:label path="celular">Celular</form:label></td>
		<td><form:input path="celular" /></td>
	</tr>
	<tr>
			<td>Sexo (H , M) :</td>
			<td><form:radiobutton path="sexo" value="H" label="H" /> 
				<form:radiobutton path="sexo" value="M" label="M" />
			</td>
				
		</tr>
	<tr>
	<tr>
			<td>País :</td>
			<td><form:select path="pais">
				   <form:option value="" label="Selecciona" />
				   <form:option value="1" label="Mexico" />
				   <form:option value="2" label="Argentina" />
				   <form:option value="3" label="Chile" />
				   <form:option value="5" label="brasil" />
				   <form:option value="6" label="USA" />
				   <form:option value="4" label="Otro" />
			    </form:select></td>
			    
			    <td>Tipo de sangre :</td>
			<td><form:select path="pais">
				   <form:option value="" label="Selecciona" />
				   <form:option value="1" label="A" />
				   <form:option value="2" label="B" />
				   <form:option value="3" label="O" />
				   <form:option value="4" label="Otra" />
				  
			    </form:select></td>
			    
			    <td>Estatura :</td>
			<td><form:select path="pais">
				   <form:option value="" label="Selecciona" />
				   <form:option value="1" label="1:10 cm - 1:30 cm" />
				   <form:option value="2" label="1:30 cm - 1:60 cm" />
				   <form:option value="3" label="1:60 - 1:80" />
				   <form:option value="4" label="Mayor a 1:80" />
				  
			    </form:select></td>
			
	</tr>
		<td colspan="2">
			<input type="submit" value="Add Contact"/>
		</td>
	</tr>
</table>		
</form:form>
	</div>
	
	
	
	  
</body>
</html>