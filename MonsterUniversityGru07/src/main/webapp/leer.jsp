<%-- 
    Document   : leer.jsp
    Created on : 18/09/2018, 0:03:02
    Author     : enrique,ximena,patricia,elizabeth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Leer</h1>
        <ul>
        	<li><a href="/appwebcrud/ServletIndex">Ir a inicio</a></li>
        </ul>
        <table border="1">
        	<thead>
        		<th>NOMBRE</th>
        		<th>APELLIDO</th>
        		<th>DOCUMENTO DE IDENTIDAD</th>
        		<th>CORREO ELECTRÓNICO</th>
        		<th>FECHA DE NACIMIENTO</th>
        		<th>FECHA DE REGISTRO</th>
        		<th>FECHA DE ACTUALIZACIÓN</th>
        		<th></th>
        		<th></th>
        	</thead>
        	<tbody>
        		<c:forEach var="item" items="${listaPersona}">
        			<tr>
	        			<th><c:out value="${item.getNombre()}"></c:out></th>
		        		<th><c:out value="${item.getApellido()}"></c:out></th>
		        		<th><c:out value="${item.getDocumentoIdentidad()}"></c:out></th>
		        		<th><c:out value="${item.getCorreoElectronico()}"></c:out></th>
		        		<th><c:out value="${item.getFechaNacimiento()}"></c:out></th>
		        		<th><c:out value="${item.getFechaRegistro()}"></c:out></th>
		        		<th><c:out value="${item.getFechaActualizacion()}"></c:out></th>
		        		<th><input type="button" value="Eliminar" onclick="eliminar('${item.getId()}');"></th>
		        		<th><input type="button" value="Editar" onclick="editar('${item.getId()}');"></th>
	        		</tr>
        		</c:forEach>
        	</tbody>
        </table>
    </body>
    <script>
    	function eliminar(id)
    	{
    		window.location.href="/appwebcrud/ServletEliminar?id="+id;
    	}
    	
    	function editar(id)
    	{
    		window.location.href="/appwebcrud/ServletActualizar?id="+id;
    	}
    </script>
</html>
