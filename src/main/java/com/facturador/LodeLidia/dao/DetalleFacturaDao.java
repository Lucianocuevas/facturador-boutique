
package com.facturador.LodeLidia.dao;

import com.facturador.LodeLidia.factory.ConnectionFactory;
import com.facturador.LodeLidia.modelo.DetalleFactura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DetalleFacturaDao {
    
    private Connection con;
    private String sql;
    
    public DetalleFacturaDao(Connection con){
        this.con = con;
    }

    public void crearDetalle(List<DetalleFactura> items) {
        try{
            final Connection con = new ConnectionFactory().recuperaConexion();
            sql = "INSERT INTO items_factura(N_FACTURA, CODIGO, CANTIDAD, PRECIO) VALUES(?,?,?,?)";
            con.setAutoCommit(false);
            try(con){
                
                PreparedStatement stm = con.prepareStatement(sql);
                for (DetalleFactura item: items){
                    stm.setLong(1, item.getNfactura());
                    stm.setLong(2,item.getCodigoProducto());
                    stm.setInt(3,item.getCantidad());
                    stm.setFloat(4, item.getPrecio());
                    stm.addBatch();
                }
                stm.executeBatch();
                con.commit();
                
            }catch(SQLException e){
                con.rollback();
                throw new RuntimeException(e);
            }
        }catch(SQLException ex){
            Logger.getLogger(DetalleFacturaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
