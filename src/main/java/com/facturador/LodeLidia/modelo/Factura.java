/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facturador.LodeLidia.modelo;

import java.sql.Date;

public class Factura {
    
    private long nFactura;
    private Date fechaCliente;
    private long idCliente;
    private String formaPago;
    private String medioPago;

    public Factura(Date fechaCliente, long idCliente, String formaPago, String medioPago) {
        this.fechaCliente = fechaCliente;
        this.idCliente = idCliente;
        this.formaPago = formaPago;
        this.medioPago = medioPago;
    }
    
    public Factura(long nFactura, Date fechaCliente, long idCliente, String formaPago, String medioPago) {
        this.nFactura = nFactura;
        this.fechaCliente = fechaCliente;
        this.idCliente = idCliente;
        this.formaPago = formaPago;
        this.medioPago = medioPago;
    }

    public long getnFactura() {
        return nFactura;
    }

    public Date getFechaCliente() {
        return fechaCliente;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public String getMedioPago() {
        return medioPago;
    }
    
    
}
