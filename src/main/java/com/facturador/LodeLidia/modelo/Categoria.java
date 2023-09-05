
package com.facturador.LodeLidia.modelo;


public class Categoria {
    
    private Integer id;
    private String nombre;
    
    public Categoria(){}

    public Categoria(int id, String nombre) {
        this.nombre = nombre;
        this.id = id;
    }
    
    public Categoria (Categoria categoria){
        this.id = categoria.getId();
        this.nombre = categoria.getNombre();
    }
    

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    
        
}
