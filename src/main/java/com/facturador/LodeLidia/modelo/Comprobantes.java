
package com.facturador.LodeLidia.modelo;

import java.sql.Date;

public class Comprobantes {
    
    private long nComprobante;
    private Date Fecha;
    private long idCliente;
    private String descripcion;
    private String medioPago;
    private float importe;

    public Comprobantes(Date Fecha, long idCliente, String descripcion, String medioPago, float importe) {
        this.Fecha = Fecha;
        this.idCliente = idCliente;
        this.descripcion = descripcion;
        this.medioPago = medioPago;
        this.importe = importe;
    } 
    
    public Comprobantes(long nComprobante, Date Fecha, String descripcion, String medioPago, float importe) {
        this.nComprobante = nComprobante;
        this.Fecha = Fecha;        
        this.descripcion = descripcion;
        this.medioPago = medioPago;
        this.importe = importe;
    }  
    
    
    //<editor-fold defaultstate="collpased" desc="  Getter & Setters    ">
    public long getnComprobante() {
        return nComprobante;
    }

    public void setnComprobante(long nComprobante) {
        this.nComprobante = nComprobante;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }
    //</editor-fold>
    
}
