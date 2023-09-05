
package com.facturador.LodeLidia.dao;

import com.facturador.LodeLidia.factory.ConnectionFactory;
import com.facturador.LodeLidia.modelo.Categoria;
import com.facturador.LodeLidia.modelo.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDao {
    
    final private Connection con;    
    
    public ProductoDao(Connection con){
        this.con = con;
    }
    
    public List<Productos> listarProductos(String nombre){
        
        List<Productos> resultado = new ArrayList<>();
        
        Connection con = new ConnectionFactory().recuperaConexion();
        
        try(con){
            
            PreparedStatement stm = con.prepareStatement("SELECT A.CODIGO, A.NOMBRE, "
                    + "B.ID, B.CATEGORIA, A.PRECIO FROM PRODUCTOS A "
                    + "INNER JOIN CATEGORIAS B ON A.CATEGORIA = B.ID "
                    + "WHERE A.NOMBRE LIKE ?");
            
            
            try(stm){
                
                stm.setString(1, "%" + nombre + "%");
                stm.execute();
                
                ResultSet result = stm.executeQuery();
                while(result.next()){
                    
                    Productos fila = new Productos(result.getLong("A.CODIGO"),
                    result.getString("A.NOMBRE"), new Categoria(result.getInt("B.ID"),
                    result.getString("B.CATEGORIA")),
                    result.getFloat("A.PRECIO"));
                resultado.add(fila);
                }
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        
        return resultado;
    }
}
