<%-- 
    Document   : estudiante
    Created on : 20/09/2016, 12:25:02 PM
    Author     : juan-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estudiante</title>
    </head>
    <body>
        <form action="EstudianteController" method="post"> 
            <fieldset>
                <legend>Formulario registro </legend>
            
                
                <div>
                    <label for="idEstudiante">ID Estudiante:</label>
                    <input type="text" name="idEstudiante" value="${estudiante.idEstudiante}" 
                           readonly="readonly" placeholder="Id de estudiante"/>
                </div>
                <div>
                    <label for="nombre">Nombre:</label>
                    <input type="text" name="nombre" value="${estudiante.nombre}" 
                           placeholder="Nombre del estudiante"/>
                </div>
                <div>
                    <label for="apellidos">Apellidos:</label>
                    <input type="text" name="apellidos" value="${estudiante.apellidos}"
                           placeholder="Apellidos de estudiante"/>
                </div>
                 <div>
                    <label for="curso">Curso:</label>
                    <input type="text" name="curso" value="${estudiante.curso}"
                           placeholder="Curso del estudiante"/>
                </div>
                <div>
                    <label for="anio">Año:</label>
                    <input type="text" name="anio" value="${estudiante.anio}" 
                           placeholder="Año"/>
                </div>
                 <div>
                    <input type="submit" value="Guardar"/>
                </div>
            </fieldset>           
        </form>
    </body>
</html>
