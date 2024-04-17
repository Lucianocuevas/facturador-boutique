
package com.facturador.LodeLidia.controller;

import com.facturador.LodeLidia.dao.ProductoDao;
import com.facturador.LodeLidia.factory.ConnectionFactory;
import com.facturador.LodeLidia.modelo.Productos;
import java.util.List;


public class ProductoController {
    
    
    private ProductoDao productoDao;
    
    public ProductoController(){
        this.productoDao = new ProductoDao(new ConnectionFactory().recuperaConexion());
    }
    
    public List<Productos> listarProductos(String buscar){
        return productoDao.listarProductos(buscar);
    }

    public Long registrarProducto(Productos producto) {
        return productoDao.registrar(producto);
    }

    public int ComprobarProducto(String nombre) {
        return productoDao.comprobarProducto(nombre);
    }

   
}
