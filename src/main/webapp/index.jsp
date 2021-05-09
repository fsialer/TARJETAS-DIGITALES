<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Crea una tarjeta</h1>
<br/>
<form action="addTarjeta" method="post">

	Banco: <input name="banco" type="text"><br/>
	Cliente: <input name="cliente" type="text"><br/>
	Numero: <input name="numero" type="text"><br/>
	fechaVencimiento: <input name="fechaVencimiento" type="text"><br/>
	<input type="submit" value="Agregar Tarjeta">
</form>
</body>
</html>