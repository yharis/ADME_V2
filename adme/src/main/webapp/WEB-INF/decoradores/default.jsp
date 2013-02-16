<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<% String contexto = request.getContextPath(); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>adme <sitemesh:title default="Inicio"/></title>
        <link rel="stylesheet" type="text/css" href="<%=contexto%>/css/standard.css" media="screen"><!-- Espacio intencional --></link>
        <link rel="stylesheet" type="text/css" href="<%=contexto%>/css/adme.css" media="screen"><!-- Espacio intencional --></link>
        <link rel="stylesheet" type="text/css" href="<%=contexto%>/resources/dijit/themes/tundra/tundra.css"><!-- Espacio intencional --></link>
        <script type="text/javascript">var djConfig="en"; </script>
        <script type="text/javascript" src="<%=contexto%>/resources/dojo/dojo.js"><!-- Espacio intencional --></script>
        <script type="text/javascript" src="<%=contexto%>/resources/spring/Spring.js"><!-- Espacio intencional --></script>
        <script type="text/javascript" src="<%=contexto%>/resources/spring/Spring-Dojo.js"><!-- Espacio intencional --></script>
        <script language="JavaScript" type="text/javascript">dojo.require("dojo.parser");</script>
        <sitemesh:head/>
    </head>
    <body class="tundra spring">
        <div id="page">
            <div id="header-box" class="alinear_logo"><%--<img src="<%=contexto%>/images/banner-lania.jpg" alt="Adme"/>!--%></div>
            <div style="text-align: right;" class="franja">
                <%--<b>--%>
                    Usuario:&nbsp;&nbsp;${pageContext.request.userPrincipal.name}
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="<%=contexto%>/resources/j_spring_security_logout">Salir</a>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <%--</b>--%>
            </div>
            <%--<div id="menu-box"></div>--%>
            <div id="body-box"><div id="content" class="area_trabajo"><sitemesh:body/><br></div></div>
            <div class="franja"><br></div>
        </div>
    </body>
</html>