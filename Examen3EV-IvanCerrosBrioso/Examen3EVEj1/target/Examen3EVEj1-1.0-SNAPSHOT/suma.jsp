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
    <title>Suma</title>
</head>
<body>
<h1>
    <%! String titulo = "Resultado de la suma :\t"; %>
    <%= titulo %>
    <%
        String ope1 = request.getParameter("ope1");
        String ope2 = request.getParameter("ope2");
        int valor1 = Integer.parseInt(ope1);
        int valor2 = Integer.parseInt(ope2);
    %>
    <%= valor1 + valor2 %>
</h1>
</body>
</html>
