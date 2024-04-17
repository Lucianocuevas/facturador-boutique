package com.facturador.LodeLidia.dao;

import com.facturador.LodeLidia.factory.ConnectionFactory;
import com.facturador.LodeLidia.modelo.Factura;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FacturaDao {

    final private Connection con;

    public FacturaDao(Connection con) {
        this.con = con;
    }

    public long crearFactura(Factura factura) {
        final Connection con = new ConnectionFactory().recuperaConexion();
        long resultado = 0;
        try (con) {
            PreparedStatement stm = con.prepareStatement("INSERT INTO"
                    + " factura(FECHA_VENTA, ID_CLIENTE,FORMA_DE_PAGO,"
                    + " MEDIO_DE_PAGO, TOTAL) VALUES(?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

            stm.setDate(1, factura.getFechaCliente());
            stm.setLong(2, factura.getIdCliente());
            stm.setString(3, factura.getFormaPago());
            stm.setString(4, factura.getMedioPago());
            stm.setFloat(5, factura.getTotal());
            stm.execute();

            ResultSet result = stm.getGeneratedKeys();
            try (result) {
                while(result.next()){
                    resultado = result.getLong(1);
                }
                con.close();
                return resultado;                
            }
           
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
