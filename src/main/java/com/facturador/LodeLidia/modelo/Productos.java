
package com.facturador.LodeLidia.modelo;


public class Productos {
    
    private Long codigo;
    private String nombre;
    private float precio;
    private Categoria categoria;

    public Productos(Long codigo, String nombre,float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    public Productos(String nombre, float precio, Categoria categoria){
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = new Categoria(categoria);
    }

    public Productos(Long codigo, String nombre, Categoria categoria, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = new Categoria(categoria);
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = new Categoria(categoria);
    }
    
    public void setCodigo(Long codigo){
        this.codigo = codigo;
    }
    
}
