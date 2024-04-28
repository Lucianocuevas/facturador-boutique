package com.facturador.LodeLidia.dao;

import com.facturador.LodeLidia.factory.ConnectionFactory;
import com.facturador.LodeLidia.modelo.DetalleFactura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class DetalleFacturaDao {

    private Connection con;
    private String sql;

    public DetalleFacturaDao(Connection con) {
        this.con = con;
    }

    public void crearDetalle(List<DetalleFactura> items) {

        final Connection con = new ConnectionFactory().recuperaConexion();
        sql = "INSERT INTO items_factura(N_FACTURA, CODIGO, CANTIDAD, PRECIO) VALUES(?,?,?,?)";
        try (con) {
            con.setAutoCommit(false);
            PreparedStatement stm = con.prepareStatement(sql);
            try (stm) {
                for (DetalleFactura item : items) {
                    stm.setLong(1, item.getNfactura());
                    stm.setLong(2, item.getCodigoProducto());
                    stm.setInt(3, item.getCantidad());
                    stm.setFloat(4, item.getPrecio());
                    stm.addBatch();
                }
                stm.executeBatch();
                con.commit();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Detalle error", "ACA ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }

    }
}
