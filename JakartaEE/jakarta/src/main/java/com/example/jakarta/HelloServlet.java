package com.example.jakarta;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet()
public class HelloServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String parametro = request.getParameter("pam");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<body>");
        out.println("<head>");
        out.println("<title>Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>pagina creada con servlet</p>");
        out.println("<h1>Esto es el valor del parametro: "+ parametro +"</h1>");
        out.println("</body>");
        out.println("</html>");


    }

    public void destroy() {
    }
}