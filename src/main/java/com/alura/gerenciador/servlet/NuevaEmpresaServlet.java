package com.alura.gerenciador.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class NuevaEmpresaServlet extends HttpServlet {
    /*Enviamos y obtenemos rspuesta al navegador,
    doPost obliga que el dato recibido sea usando post*/
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        
        String nombreEmpresa = req.getParameter("nombre");
        PrintWriter out= resp.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<p>Nueva empresa "+nombreEmpresa+" registrada <p>");
        out.println("</body>");
        out.println("</html>");

        System.out.println(" nueva Empresa registrada");
    }
}
