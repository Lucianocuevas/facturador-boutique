
package com.facturador.LodeLidia.controller;

import com.facturador.LodeLidia.dao.ComprobanteDao;
import com.facturador.LodeLidia.factory.ConnectionFactory;
import com.facturador.LodeLidia.modelo.Cliente;
import com.facturador.LodeLidia.modelo.Comprobantes;
import java.util.List;


public class ComprobantesController {
    
    private ComprobanteDao comprobanteDao;

    public ComprobantesController() {
        this.comprobanteDao = new ComprobanteDao(new ConnectionFactory().recuperaConexion());
    }

    public long CrearComprobante(Comprobantes comprobante) {
        return comprobanteDao.CrearComprobante(comprobante);
    }

    public List<Comprobantes> verComprobantes(Cliente cliente) {
        return comprobanteDao.ListarComprobantes(cliente);
    }

       
}
