<%-- 
    Document   : insertar
    Created on : 17/09/2018, 23:54:28
    Author     : enrique,ximena,elizabeth,patricia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Insertar</h1>
        <ul>
        	<li><a href="/MonsterUniversityGru07/ServletIndex">Ir a inicio</a></li>
        </ul>
        <%
        if(request.getAttribute("mensaje")!=null)
        {
        	%>
        	<b><%=request.getAttribute("mensaje")%></b>
        	<%
        }
        %>
        <form action="/MonsterUniversityGru07/ServletInsertar" method="post">
        	<label for="txtNombre">Nombre</label>
        	<input type="text" id="txtNombre" name="txtNombre">
        	<br>
        	<label for="txtApellido">Apellido</label>
        	<input type="text" id="txtApellido" name="txtApellido">
        	<br>
        	<label for="txtDocumentoIdentidad">Documento de identidad</label>
        	<input type="text" id="txtDocumentoIdentidad" name="txtDocumentoIdentidad">
        	<br>
        	<label for="txtCorreoElectronico">Correo electrónico</label>
        	<input type="text" id="txtCorreoElectronico" name="txtCorreoElectronico">
        	<br>
        	<label for="dateFechaNacimiento">Fecha de nacimiento</label>
        	<input type="date" id="dateFechaNacimiento" name="dateFechaNacimiento">
        	<br>
        	<input type="submit" value="Registrar persona">
        </form>
    </body>
</html>
