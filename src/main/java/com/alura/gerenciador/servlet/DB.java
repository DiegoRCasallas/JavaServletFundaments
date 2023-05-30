package com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class DB {
    private static List<Empresa> listaEmpresas= new ArrayList<>();
    public void agregarEmpresa(Empresa empresa) {
        this.listaEmpresas.add(empresa);
    }

    public static List<Empresa> getListaEmpresas() {
        return listaEmpresas;
    }
}
