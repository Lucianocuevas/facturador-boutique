
package com.facturador.LodeLidia.controller;

import com.facturador.LodeLidia.dao.FacturaDao;
import com.facturador.LodeLidia.factory.ConnectionFactory;
import com.facturador.LodeLidia.modelo.Factura;
import com.facturador.LodeLidia.modelo.Productos;
import java.sql.Connection;
import java.util.List;
import java.util.stream.DoubleStream;


public class FacturaController { 
    
    private FacturaDao facturaDao;
    
    public FacturaController(){
        this.facturaDao = new FacturaDao(new ConnectionFactory().recuperaConexion());
    }

    public long crearFactura(Factura factura) {
        return facturaDao.crearFactura(factura);
    }
    
    
}
