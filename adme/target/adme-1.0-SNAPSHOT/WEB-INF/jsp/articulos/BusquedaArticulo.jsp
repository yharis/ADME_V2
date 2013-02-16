<%-- 
    Document   : BusquedaArticulo
    Created on : 16/02/2013, 07:39:58 AM
    Author     : yharis
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" tagdir="/WEB-INF/tags/form/fields"%>
<%@taglib prefix="springform" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Búsqueda de articulo</title>
    </head>
    <body>
        <form id="forma" name="forma" action="buscarArticulo" method="POST">
          
            <p>Introduzca el parametro(s) de búsqueda.</p>
            <input type="text" name="parametro"></input>
            <button type="submit" name="buscarAlumno" id="buscarAlumno">BUSCAR</button>
        </form>
        <c:if test="${not empty articulos}">
            <h3>Resultados de la búsqueda:</h3>
            <table>
                <tr>
                    <th>Descripción</th>
                    <th>Precio venta</th>
                    <th>existencia</th>                    
                </tr>
                <c:forEach items="${articulos}" var="articulo">
                    <tr>
                        <td>${articulo.descripcion}</td>
                        <td>
                            ${articulo.precioVenta}
                        </td>
                        <td>
                            ${articulo.existencia}
                        </td>                        
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>
