<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

 <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.8.0/jquery.min.js" integrity="sha512-AODL7idgffQeNsYdTzut09nz9AINcjhj4jHD72HcLirsidbC8tz+dof7gceOCQD8WskeuRFfJ9CsgZTHlMiOYg==" crossorigin="anonymous"></script>
  <script>
        
        	
        	$.get('obtenerTarjetasDigitales', function(responseText) {
        		//alert(responseText);
				$("#tabla").html(responseText);
				
				//$( "#tabla" ).append("</table>");
			});
// 	            $.ajax({
// 	                url: 'obtenerTarjetasDigitales',
// 	                dataType: 'json',
// 	                data: { },
// 	                type: 'get'
// 	            });
   
            
        </script>
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

<br/>
<div id="tabla"></div>	
	
</body>
</html>