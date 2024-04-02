
package com.facturador.LodeLidia.controller;

import com.facturador.LodeLidia.dao.FacturaDao;
import com.facturador.LodeLidia.factory.ConnectionFactory;
import java.sql.Connection;
import java.util.stream.DoubleStream;


public class FacturaController { 
    
    private FacturaDao facturaDao;
    
    public FacturaController(){
        this.facturaDao = new FacturaDao(new ConnectionFactory().recuperaConexion());
    }
    
    
}
