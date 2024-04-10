
package com.facturador.LodeLidia.controller;

import com.facturador.LodeLidia.dao.DetalleFacturaDao;
import com.facturador.LodeLidia.factory.ConnectionFactory;
import com.facturador.LodeLidia.modelo.DetalleFactura;
import java.util.List;



public class DetalleFacturaController {
    
    private DetalleFacturaDao detalleDao;
    
    public DetalleFacturaController(){
        this.detalleDao = new DetalleFacturaDao(new ConnectionFactory().recuperaConexion());
    }

    public void CrearDetalle(List<DetalleFactura> items) {
        detalleDao.crearDetalle(items);
    }
}
