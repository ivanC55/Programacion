<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%!
    String titulo = "Calculdora de pila";
    String servlet = "Calculadora";
%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><%= titulo %></title>
    <style>
        .div-center {
            position: absolute;
            left: 50%;
            top: 50%;
            transform: translate(-50%, -50%);
        }
    </style>
    <script src="https://code.jquery.com/jquery-latest.js"></script>
    <script>
        $(document).ready(function (event) {
            $('#borrar').click(function (event) {
                $(`#resultado`).html("RESULTADO");
            });

            $('#calcular').click(function (event) {
                let textoVar = $('#ajax').val();//capta contenido de id = 'texto'
                $.get('<%= servlet %>',{
                    ajax : textoVar
                },function (responseText) {
                    $('#resultado').html(responseText);
                })
                    .done(function (){
                        //alert(second success);
                    })
                    .fail(function (e) {
                        alert("error "+ e)
                    });
            });
            $('#miPrimerServlet').click(function (event) {
                window.location.href = "escucha-peticiones";
                //$('#resultado').html("RESULTADO");
            });
        });
    </script>
</head>
<body>
<div class="div-center">
    <h1><%= titulo %></h1>
    <!-- Formulario -->
    <div style="border: 1px solid #500101; padding: 1em">
        <form>
            <label for="ajax">La ecuacion a resolver es : </label><br>
            <input type="text" id="ajax" value="2 2 + 3 *">
        </form>
        <div>
            <button id="borrar">Borrar</button>&nbsp;
            <button id="calcular">Calcular</button>
            <h1 id="resultado" style="text-align: center">RESULTADO</h1>
        </div>
    </div>
    <div style="height: 3em;"></div>
    <div style="border: 1px solid black; padding: 1em">
        <div id="miPrimerServlet">Ir a mi primer servlet</div>
    </div>
</div>
</body>
</html>