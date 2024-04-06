
package com.facturador.LodeLidia.modelo;

import java.sql.Date;


public class Cliente {
    

    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String localidad;
    private float limite;
    private Date FechaCreacion;
    
    public Cliente(){ }

    public Cliente(Long id, String nombre, String apellido, String telefono, String localidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.localidad = localidad;
        
    }

    public Cliente(String nombre, String apellido, String telefono, String localidad, float limite, Date fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.localidad = localidad;
        this.limite = limite;
        this.FechaCreacion = fecha;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void setFechaCreacion(Date FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }
    
    public Cliente(Cliente clienteElegido) {
        this.id = clienteElegido.getId();
        this.nombre = clienteElegido.getNombre();
        this.apellido = clienteElegido.getApellido();
        this.telefono = clienteElegido.getTelefono();
        this.localidad = clienteElegido.getLocalidad();
    }
    
    public float getLimite(){
        return limite;
    }
    
    public Date getFechaCreacion(){
        return FechaCreacion;
    }

    public void setId(long id){
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getLocalidad() {
        return localidad;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }    
    
}
