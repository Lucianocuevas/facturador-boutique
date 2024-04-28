package com.facturador.LodeLidia.dao;

import com.facturador.LodeLidia.factory.ConnectionFactory;
import com.facturador.LodeLidia.modelo.Cliente;
import com.facturador.LodeLidia.modelo.Factura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FacturaDao {

    private Connection con;

    public FacturaDao(Connection con) {
        this.con = con;
    }

    public long crearFactura(Factura factura) {
        final Connection con = new ConnectionFactory().recuperaConexion();
        
        try (con) {
            con.setAutoCommit(false);
            PreparedStatement stm = con.prepareStatement("INSERT INTO"
                    + " factura(FECHA_VENTA, ID_CLIENTE,FORMA_DE_PAGO,"
                    + " MEDIO_DE_PAGO, TOTAL) VALUES(?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

            try (stm) {
                stm.setDate(1, factura.getFechaCliente());
                stm.setLong(2, factura.getIdCliente());
                stm.setString(3, factura.getFormaPago());
                stm.setString(4, factura.getMedioPago());
                stm.setFloat(5, factura.getTotal());
                stm.execute();
                con.commit();
                final ResultSet result = stm.getGeneratedKeys();
                try (result) {
                    while (result.next()) {
                        factura.setnFactura(result.getLong(1));
                    }
                    return factura.getnFactura();                   
                }                
            }

        } catch (SQLException e) {            
            Mensaje("Hubo un error al realizar la factura, intente nuevamente", "¡Error al crear!", JOptionPane.ERROR_MESSAGE);            
            throw new RuntimeException(e);
        }
    }

    public List<Factura> verFacturas(Cliente c) {
        final Connection con = new ConnectionFactory().recuperaConexion();
        List<Factura> resultado = new ArrayList<>();
        String sql = "SELECT N_FACTURA, FECHA_VENTA, FORMA_DE_PAGO,"
                + " MEDIO_DE_PAGO, TOTAL FROM factura WHERE ID_CLIENTE = ? ORDER BY N_FACTURA";
        try (con) {
            PreparedStatement stm = con.prepareStatement(sql);
            try (stm) {
                stm.setLong(1, c.getId());
                stm.execute();

                ResultSet result = stm.executeQuery();
                try (result) {
                    while (result.next()) {
                        resultado.add(new Factura(result.getLong("N_FACTURA"),
                                result.getDate("FECHA_VENTA"),
                                result.getString("FORMA_DE_PAGO"),
                                result.getString("MEDIO_DE_PAGO"),
                                result.getFloat("TOTAL")));
                    }
                    return resultado;
                }
            }

        } catch (SQLException e) {
            Mensaje("Hubo un error", "¡Error!", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }

    }

    private void Mensaje(String msg, String titulo, int ERROR_MESSAGE) {
        JOptionPane.showMessageDialog(null, msg, titulo, ERROR_MESSAGE);
    }
}
