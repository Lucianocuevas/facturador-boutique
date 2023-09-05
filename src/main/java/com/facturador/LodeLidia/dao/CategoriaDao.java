
package com.facturador.LodeLidia.dao;

import com.facturador.LodeLidia.factory.ConnectionFactory;
import com.facturador.LodeLidia.modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CategoriaDao {
    
    
    private Connection con;
    
    public CategoriaDao(Connection con){
        this.con = con;
    }
    
    public List<Categoria> listarCategoria(){
        
        List<Categoria> resultado = new ArrayList<>();        
        final Connection con = new ConnectionFactory().recuperaConexion();        
        try(con){            
            PreparedStatement stm = con.prepareStatement("SELECT ID, CATEGORIA"
                    + " FROM CATEGORIAS");
            try(stm){
                stm.execute();                
                ResultSet result = stm.executeQuery();                
                while(result.next()){
                    Categoria fila = new Categoria(result.getInt("ID"),
                    result.getString("CATEGORIA"));                    
                    resultado.add(fila);
                }
            }            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }        
        return resultado;
    }
    
    public List<Categoria> listarCategoria(Integer id){
        
        List<Categoria> resultado = new ArrayList<>();        
        final Connection con = new ConnectionFactory().recuperaConexion();        
        try(con){            
            PreparedStatement stm = con.prepareStatement("SELECT ID, CATEGORIA"
                    + " FROM CATEGORIAS WHERE ID = ?");
            try(stm){
                
                stm.setInt(1, id);
                stm.execute();                
                ResultSet result = stm.executeQuery();                
                while(result.next()){
                    Categoria fila = new Categoria(result.getInt("ID"),
                    result.getString("CATEGORIA"));                    
                    resultado.add(fila);
                }
            }            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }        
        return resultado;
    }
}
