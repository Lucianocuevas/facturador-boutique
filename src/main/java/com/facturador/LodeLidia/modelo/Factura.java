
package com.facturador.LodeLidia.modelo;

import java.sql.Date;

public class Factura {
    
    //<editor-fold defaultstate="collapsed" desc="  Variables   ">
    private long nFactura;
    private Date fechaCliente;
    private long cliente;
    private String formaPago;
    private String medioPago;
    private float total;
    //</editor-fold>

    public Factura(Date fechaCliente, Cliente cliente, String formaPago, String medioPago, float total) {
        this.fechaCliente = fechaCliente;
        this.cliente = cliente.getId();
        this.formaPago = formaPago;
        this.medioPago = medioPago;
        this.total = total;
    }
        
    public Factura(long nFactura, Date fechaCliente, Cliente cliente, String formaPago, String medioPago, float total) {
        this.nFactura = nFactura;
        this.fechaCliente = fechaCliente;
        this.cliente = cliente.getId();
        this.formaPago = formaPago;
        this.medioPago = medioPago;
        this.total = total;
    }

    //<editor-fold defaultstate="collpased" desc="  Getter & Setter ">
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    public long getnFactura() {
        return nFactura;
    }

    public Date getFechaCliente() {
        return fechaCliente;
    }

    public long getIdCliente() {
        return cliente;
    }

    public void setnFactura(long nFactura) {
        this.nFactura = nFactura;
    }

    public void setFechaCliente(Date fechaCliente) {
        this.fechaCliente = fechaCliente;
    }

    public void setCliente(long cliente) {
        this.cliente = cliente;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public String getMedioPago() {
        return medioPago;
    }
    //</editor-fold>    
}
