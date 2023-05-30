package com.alura.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListaEmpresasServlet extends HttpServlet {

    public static ArrayList<Empresa> generarListaEmpresa(){
        ArrayList<Empresa>empresas=new ArrayList<>();
        empresas.add(new Empresa("Ecopetrol"));
        empresas.add(new Empresa("Nutresa"));
        empresas.add(new Empresa("Postobon"));
        empresas.add(new Empresa("Google"));
        empresas.add(new Empresa("IA COl"));
        return empresas;
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DB dateBase = new DB();
        List<Empresa> listaEmpresas = dateBase.getEmpresas();
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<H2>Lista de Empresas registradas</H2>");
        for (Empresa empresa : listaEmpresas) {
            out.println("<li>"+empresa.getNombre()+"</li>");
        }
        out.println("</body>");
        out.println("</html>");
    }
}

