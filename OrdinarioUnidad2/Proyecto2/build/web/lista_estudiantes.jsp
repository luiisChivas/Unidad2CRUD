<%-- 
    Document   : lista_estudiantes
    Created on : 20/09/2016, 12:24:45 PM
    Author     : juan-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Estudiantes</title>
    </head>
    <body>
        <table>
            <thead>
            <tr>
                <th>ID estudiante</th>
                <th>Nombre</th>
                <th>Apellidos</th>
                <th>Curso</th>
                <th>Año</th>
            </tr>
            </thead>
            <tbody>
                <c:forEach var="estudiante" items="${estudiantes}">
                    <tr>
                        <td>${estudiante.idEstudiante}</td>
                        <td>${estudiante.nombre}</td>
                        <td>${estudiante.apellidos}</td>
                        <td>${estudiante.curso}</td>
                        <td>${estudiante.anio}</td>
                        <td><a href="EstudianteController?action=cambiar&idEstudiante=${estudiante.idEstudiante}">Cambiar</a></td>
                        <td><a href="EstudianteController?action=borrar&idEstudiante=${estudiante.idEstudiante}">Borrar</a></td>
                         
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <p><a href="EstudianteController?action=agregar">Agregar estudiante</a></p>
    </body>
</html>
