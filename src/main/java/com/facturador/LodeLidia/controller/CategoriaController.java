
package com.facturador.LodeLidia.controller;

import com.facturador.LodeLidia.dao.CategoriaDao;
import com.facturador.LodeLidia.factory.ConnectionFactory;
import com.facturador.LodeLidia.modelo.Categoria;
import java.util.List;


public class CategoriaController {
    
    private CategoriaDao categoriaDao;
    
    public CategoriaController(){
        this.categoriaDao = new CategoriaDao(new ConnectionFactory().recuperaConexion());
    }
    
    public List<Categoria> listarCategoria(){       
        return categoriaDao.listarCategoria();
    }

    public Categoria buscarCategoria(String nombre) {
        return categoriaDao.buscar(nombre);
    }
    
}
