<%--
  Created by IntelliJ IDEA.
  User: Ivan Cerros Brioso
  Date: 25/05/2023
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Potencia</title>
</head>
<body>
<h1>
<%
    String ope1 = request.getParameter("oper1");
    String ope2 = request.getParameter("oper2");
    double valor1 = Double.parseDouble(ope1);
    double valor2 = Double.parseDouble(ope2);
    double resultado = Math.pow(valor1,valor2);
%>
<%= "Este es el resultado de elevar ope1 a ope2 : "%>
<%= resultado %>
</h1>
</body>
</html>
