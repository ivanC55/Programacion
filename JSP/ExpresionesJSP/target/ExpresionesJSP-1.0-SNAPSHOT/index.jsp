<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
    Hoy es :
    <%= new java.util.Date() %>
</h1>
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