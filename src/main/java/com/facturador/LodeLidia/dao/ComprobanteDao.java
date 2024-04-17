package com.facturador.LodeLidia.dao;

import com.facturador.LodeLidia.factory.ConnectionFactory;
import com.facturador.LodeLidia.modelo.Comprobantes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ComprobanteDao {

    private Connection con;

    public ComprobanteDao(Connection con) {
        this.con = con;
    }

    public long CrearComprobante(Comprobantes comprobante) {
        final Connection con = new ConnectionFactory().recuperaConexion();

        try (con) {
            PreparedStatement stm = con.prepareStatement("INSERT INTO comprobante_pago(FECHA, ID_CLIENTE, "
                    + "DESCRIPCION, MEDIO_DE_PAGO, IMPORTE) VALUES(?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            
            try(stm){
                stm.setDate(1, comprobante.getFecha());
                stm.setLong(2, comprobante.getIdCliente());
                stm.setString(3, comprobante.getDescripcion());
                stm.setString(4, comprobante.getMedioPago());
                stm.setFloat(5, comprobante.getImporte());
                
                stm.execute();
                
                ResultSet rs = stm.getGeneratedKeys();
                try(rs){
                    while(rs.next()){
                        comprobante.setnComprobante(rs.getLong(1));
                    }
                    return comprobante.getnComprobante();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
}


