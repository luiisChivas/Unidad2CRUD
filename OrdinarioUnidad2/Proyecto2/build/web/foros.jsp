<%-- 
    Document   : foros
    Created on : 23-sep-2016, 11:31:07
    Author     : jony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="ForoController" method="post">
            <fieldset>
                
                <div>
                    <label>Id de Foro:</label>
                    <input type="text" name="idForo" value="${foro.idForo}"
                           placeholder="idForo"
                           readonly="readonly"/>

                </div>
                <div>
                    <label>Titulo</label>
                    <input type="text" name="titulo" value="${foro.titulo}"
                           placeholder="Foro"/>
                </div>
                <div>
                    <label>Descripción</label>
                    <input type="text" name="descripcion" value="${foro.descripcion}"
                           placeholder="Descripción"/>
                </div>
                <div>
                <div>
                    <label>Estado</label>
                    <input type="number" name="estado" value="${foro.estado}"
                           placeholder="Estado"/>
                </div>
                <div>
                    <input type="submit" value="Guardar"/>
                </div>
            </fieldset>

        </form>
    </body>
</html>
