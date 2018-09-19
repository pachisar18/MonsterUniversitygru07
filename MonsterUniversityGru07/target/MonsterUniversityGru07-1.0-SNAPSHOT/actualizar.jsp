<%-- 
    Document   : actualizar.jsp
    Created on : 18/09/2018, 0:04:31
    Author     : ely,ximena,enrique,patricia.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Actualizar</h1>
        <ul>
        	<li><a href="/MonsterUniversityGru07/ServletIndex">Ir a inicio</a></li>
        </ul>
        <jsp:useBean id="persona" class="com.mycompany.bean.Persona" scope="request"></jsp:useBean>
        
        	<input type="hidden" id="txtId" name="txtId" value="<%=persona.getId()%>">
        	<label for="txtNombre">Nombre</label>
        	<input type="text" id="txtNombre" name="txtNombre" value="<%=persona.getNombre()%>">
        	<br>
        	<label for="txtApellido">Apellido</label>
        	<input type="text" id="txtApellido" name="txtApellido" value="<%=persona.getApellido()%>">
        	<br>
        	<label for="txtDocumentoIdentidad">Documento de identidad</label>
        	<input type="text" id="txtDocumentoIdentidad" name="txtDocumentoIdentidad" value="<%=persona.getDocumentoIdentidad()%>">
        	<br>
        	<label for="txtCorreoElectronico">Correo electrónico</label>
        	<input type="text" id="txtCorreoElectronico" name="txtCorreoElectronico" value="<%=persona.getCorreoElectronico()%>">
        	<br>
        	<label for="dateFechaNacimiento">Fecha de nacimiento</label>
        	<input type="date" id="dateFechaNacimiento" name="dateFechaNacimiento" value="<%=persona.getFechaNacimiento()%>">
        	<br>
        	<input type="submit" value="Editar persona">
        
    </body>
</html>
