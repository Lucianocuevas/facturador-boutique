
package com.facturador.LodeLidia.dao;

import com.facturador.LodeLidia.factory.ConnectionFactory;
import com.facturador.LodeLidia.modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ClienteDao {
    final private Connection con;
    
    public ClienteDao(Connection con){
        this.con = con;
    }
    
    public List<Cliente> listarNombre(String nombre){
        List<Cliente> resultado = new ArrayList<>();
        final Connection con = new ConnectionFactory().recuperaConexion();
        
        try (con){
            PreparedStatement stm = con.prepareStatement("SELECT ID, NOMBRE,"
                    + " APELLIDO, TELEFONO, LOCALIDAD FROM CLIENTES"
                    + " WHERE NOMBRE LIKE ? OR APELLIDO LIKE ? ");
            try(stm){
                
                stm.setString(1, "%" + nombre + "%");
                stm.setString(2, "%" + nombre + "%");
                stm.execute();
                
                ResultSet result  = stm.executeQuery();
                
                while(result.next()){
                    Cliente fila = new Cliente(result.getLong("id"),
                    result.getString("NOMBRE"), result.getString("APELLIDO"),
                    result.getString("TELEFONO"), result.getString("LOCALIDAD"));
                    
                    resultado.add(fila);
                }
            }
            
        }catch (SQLException e){
        
        throw new RuntimeException (e);
    }
        return resultado;
    }
}
