package com.alura.gerenciador.servlet;

public class Empresa {
    private String id;
    private String nombre;

    /*Cosntructores*/
    public Empresa(){}
    public Empresa(String nombre){
        this.nombre= nombre;
    }
    /*GyS*/
    public void setId(String id){
        this.id=id;
    }
    public String getId() {
        return id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}
