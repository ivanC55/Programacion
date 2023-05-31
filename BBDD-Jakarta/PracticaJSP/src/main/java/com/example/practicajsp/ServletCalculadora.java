package com.example.practicajsp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "com.example.practicajspcalculadora", value = "/Calculadora")
public class ServletCalculadora extends HttpServlet {
    // Declaraciones globales (de clase)
    private float resultado;
    private String texto;
    private CalculadoraPila calculadora;

    // Inicialización
    public void init() {
        calculadora = new CalculadoraPila();
    }

    // Cuando apagamos para ordenar y limpiar (sólo se ejecuta 1 vez)
    public void destroy() {
    }

    // Peticiones GET
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Tipo de respuesta ofrecida (texto, imagen, etc)
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        texto = request.getParameter("texto");
        resultado = calculadora.imprimirResultado(texto);

        out.print("<html><body>" +
                resultado
                + "</body></html>"
        );
    }

    // Peticiones POST
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
