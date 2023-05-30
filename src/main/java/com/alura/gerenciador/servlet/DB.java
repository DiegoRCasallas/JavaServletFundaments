package com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class DB {
    private static List<Empresa> listaEmpresas= new ArrayList<>();

    static {
        Empresa empresa1 = new Empresa("CocaCola");
        Empresa empresa2= new Empresa ("Pepsi");
        listaEmpresas.add(empresa1);
        listaEmpresas.add(empresa2);
    }

    public void agregarEmpresa(Empresa empresa) {
        listaEmpresas.add(empresa);
    }

    public static List<Empresa> getEmpresas() {
        return listaEmpresas;
    }


}
