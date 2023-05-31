<%--
Directivas
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- 
HTML
--%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><%= "Calculadora de pila" %></title>
    <%-- CSS --%>
    <style>
        .div-center {
            position: absolute;
            left: 50%;
            top: 50%;
            transform: translate(-50%, -50%);
        }
    </style>
    <%--
    javascript/AJAX
    --%>
    <script src="https://code.jquery.com/jquery-latest.js"></script>
    <script>
        $(document).ready(function() {
            $('#borrar').click(function (event) {
                $('#resultado').html("0.0");
            });

            $('#calcular').click(function (event) {
                let textoVar = $('#texto').val(); // capta contenido de id='texto'

                console.log(textoVar.match(/[0-9] [0-9] .*/g))

                $.get('<%= "Calculadora" %>', {
                    texto: textoVar
                }, function (responseText) {
                    $('#resultado').html(responseText);
                })
                    .done(function() {
                        //alert( "second success" );
                    })
                    .fail(function(e) {
                        alert("Error del servidor :( Mirar consola.");
                        console.log(e)
                    });
            });
        });
    </script>

</head>
<body>
<div class="div-center">
    <h1><%= "Calculadora de pila" %></h1>

    <%--
    Formulario
    --%>
    <div style="border: 1px solid black; padding: 1em;">
        <form action="/Calculadora">
            <label>La ecuación a mandar a la calculadora:</label><br />
            <input type="text" id="texto" value="2 2 + 3 * =" placeholder="2 2 + 3 * ="/>
        </form>
        <div>
            <button id="borrar">Borrar</button>&nbsp;
            <button id="calcular">Calcular</button>
            <h1 id="resultado" style="text-align: right">0.0</h1>
        </div>
    </div>

</body>
</html>