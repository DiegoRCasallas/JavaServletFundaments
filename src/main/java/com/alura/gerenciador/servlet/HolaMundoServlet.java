package com.alura.gerenciador.servlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/hola")
public class HolaMundoServlet extends HttpServlet {

    /*Enviamos y obtenemos rspuesta al navegador*/
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter out= resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<H1>Felicitaciones por crear tu primer Servlet</H1>");
        out.println("</body>");
        out.println("</html>");

        System.out.println("SE EJECUTO EL SERVLET");
    }
}
