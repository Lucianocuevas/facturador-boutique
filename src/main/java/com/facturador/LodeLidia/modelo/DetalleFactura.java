
package com.facturador.LodeLidia.modelo;

import java.util.List;


public class DetalleFactura {
    
    private long nfactura;
    private long codigoProducto;
    private int cantidad;
    private float precio;

    public DetalleFactura(long nfactura, long codigoProducto, int cantidad, float precio) {
        this.nfactura = nfactura;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public DetalleFactura(long nfactura, long codigoProducto, int cantidad) {
        this.nfactura = nfactura;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
    }

    public DetalleFactura() {
  
    }
    
    public long getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(long codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public long getNfactura() {
        return nfactura;
    }
    
        
}
