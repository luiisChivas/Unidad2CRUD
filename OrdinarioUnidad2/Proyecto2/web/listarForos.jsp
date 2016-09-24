<%-- 
    Document   : listarForos
    Created on : 23-sep-2016, 11:26:55
    Author     : jony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <table>
            <thead>
                <tr>
                    <th>Id foro</th>
                    <th>Titulo</th>
                    <th>Descripción</th>
                    <th>Estado</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach  var="foro" items="${foros}">
                    <tr>
                        <td>${foro.idForo}</td>
                        <td>${foro.titulo}</td>
                        <td>${foro.descripcion}</td>
                        <td>${foro.estado}</td>
                        <td><a href="ForoController?action=cambiar&idForo=${foro.idForo}">Cambiar</a></td> 
                        <td><a href="ForoController?action=borrar&idForo=${foro.idForo}">Borrar</a></td> 
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <p>
            <a href="ForoController?action=agregar">Nuevo Foro</a>
        </p>

    </body>
</html>
