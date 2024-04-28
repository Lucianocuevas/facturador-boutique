
package com.facturador.LodeLidia.controller;

import com.facturador.LodeLidia.dao.FacturaDao;
import com.facturador.LodeLidia.factory.ConnectionFactory;
import com.facturador.LodeLidia.modelo.Cliente;
import com.facturador.LodeLidia.modelo.Factura;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FacturaController { 
    
    private final FacturaDao facturaDao;
    
    
    
    public FacturaController(){
        this.facturaDao = new FacturaDao(new ConnectionFactory().recuperaConexion());
    }

    public long crearFactura(Factura factura) {
        
        return facturaDao.crearFactura(factura);
        
    }
    
    public List<Factura> verFacturas(Cliente c){
        return facturaDao.verFacturas(c);
    }
    
    
}
