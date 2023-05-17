<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        <%@ include file="estilo.css"%>
    </style>
</head>
<body>
<form action="proceso.jsp" method="post">
    Nombre:
    <input type="text" name="nombre">
    <br>
    Apellido:
    <input type="text" name="apellido">
    <br>
    Edad:
    <input type="text" name="edad">
    <br>

    Lenguaje preferido:
    <select name="lenguaje">
        <option value="java">java</option>
        <option value="jsp" selected>jsp</option>
        <option value="php">php</option>
        <option value="C/C++">C/C++</option>
        <option value="C#">C#</option>
        <option value="Asp">Asp</option>
        <option value="AS3">AS3</option>
    </select>
    <br>
    Me gusta el:
    <input type="Radio" name="preferencia" value="Diseño" checked>Diseño
    <br>
    <input type="Radio" name="preferencia" value="Programacion" checked>Programacion
    <br>
    <input type="Radio" name="preferencia" value="Modelado" checked>Modelado
    <br>
    <input type="Radio" name="preferencia" value="Gerencia" checked>Gerencia de proyectos
    <br>
    <input type="submit" value="Enviar">

</form>
</body>
</html>