
package com.facturador.LodeLidia.controller;

import com.facturador.LodeLidia.dao.ClienteDao;
import com.facturador.LodeLidia.factory.ConnectionFactory;
import com.facturador.LodeLidia.modelo.Cliente;
import java.sql.Connection;
import java.util.List;


public class ClienteController {
    
    
    private ClienteDao clienteDao;
    
    public ClienteController(){
        this.clienteDao = new ClienteDao(new ConnectionFactory().recuperaConexion());
    }
    
    public List<Cliente> listarPorNombre(String nombre){
        return clienteDao.listarNombre(nombre);
    }
    
    public List<Cliente> listarPorCodigo(long entrada){
        return clienteDao.listarCodigo(entrada);
    }

    public List<Cliente>listarCuentas(String nombre) {
        return null;//clienteDao.listarCuentas(nombre);
    }

    public Cliente buscarCliente(String cliente) {
        return clienteDao.buscarCliente(cliente);
    }

    public Long crearNuevo(Cliente nuevoCliente) {
       return clienteDao.crearCliente(nuevoCliente);
    }

    public List<Cliente> listarPorTelefono(String entrada) {
        return clienteDao.listarTelefonos(entrada);
    }    
}
