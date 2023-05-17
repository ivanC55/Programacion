<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>
    <!-- Delcaracion de expresiones con jsp, operacines con salida directa y sin ";" al final  -->
    <%= "Hello World!" + " esto es jsp" %>
    2 + 2 = <%= 2 + 2 %>
    Hoy es :
    <%= new java.util.Date() %>
</h1>
<p>
    <!--Codigo java en html -->
</p>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<div>
    <form>
        <label>Repeticiones : </label>
        <input type="text" value="repeticiones">
        <label>Texto : </label>
        <input type="text" value="texto">
        <input type="submit" value="Mandar instrucciones">

    </form>
</div>
</body>
</html>
<!--

Pagina para ejercicios de jsp y servlet
https://tc.luiscastelar.duckdns.org/jsp/tuto-0.jsp

-->