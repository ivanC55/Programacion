<%--
  Created by IntelliJ IDEA.
  User: Ivan Cerros Brioso
  Date: 25/05/2023
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Calculadora</title>
</head>
<%! String titulo = "Calculadora"; %>
<body>
<h1>
    <%= titulo %>
</h1>
<br/>
<h3>Suma</h3>
<form action="suma.jsp" method="get">
    <label for="ope1">Operando 1:</label> <br>
    <input id="ope1" name="ope1" type="text" > <br>
    <label for="ope2">Operando 2:</label> <br>
    <input id="ope2" name="ope2" type="text" > <br>

    <input type="submit" value="+">
</form>
<h3>Potencia</h3>
<form action="potencia.jsp" method="get">
    <label for="oper1">Operando 1:</label> <br>
    <input id="oper1" name="oper1" type="text" > <br>
    <label for="oper2">Operando 2:</label> <br>
    <input id="oper2" name="oper2" type="text" > <br>

    <input type="submit" value="ab">
</form>

</body>
</html>