package com.facturador.LodeLidia.dao;

import com.facturador.LodeLidia.factory.ConnectionFactory;
import com.facturador.LodeLidia.modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {

    final private Connection con;
    private Cliente cliente;

    public ClienteDao(Connection con) {
        this.con = con;
    }
    
    public Cliente buscarCliente(String nombre) {
        final Connection con = new ConnectionFactory().recuperaConexion();

        try (con) {

            PreparedStatement stm = con.prepareStatement("SELECT ID, NOMBRE,"
                    + " APELLIDO, TELEFONO, LOCALIDAD FROM CLIENTES"
                    + " WHERE NOMBRE = ?");

            try (stm) {
                stm.setString(1, nombre);
                stm.execute();

                ResultSet result = stm.executeQuery();

                while (result.next()) {
                    cliente = new Cliente(result.getLong("id"),
                            result.getString("NOMBRE"), result.getString("APELLIDO"),
                            result.getString("TELEFONO"), result.getString("LOCALIDAD"));
                }
            }
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cliente;
    }

    public Long crearCliente(Cliente cliente) {
        final Connection con = new ConnectionFactory().recuperaConexion();
        try (con) {
            PreparedStatement stm = con.prepareStatement("INSERT INTO CLIENTES"
                    + "(nombre, apellido, telefono, localidad, limite, fechaCreacion) "
                    + "VALUES(?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            try (stm) {
                stm.setString(1, cliente.getNombre());
                stm.setString(2, cliente.getApellido());
                stm.setString(3, cliente.getTelefono());
                stm.setString(4, cliente.getLocalidad());
                stm.setFloat(5, cliente.getLimite());
                stm.setDate(6, cliente.getFechaCreacion());
                stm.execute();

                ResultSet result = stm.getGeneratedKeys();
                try (result) {
                    while (result.next()) {
                        cliente.setId(Long.valueOf(result.getInt(1)));
                    }                    
                    return cliente.getId();

                }

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    
    public List<Cliente> listarNombre(String nombre) {
        List<Cliente> resultado = new ArrayList<>();
        final Connection con = new ConnectionFactory().recuperaConexion();

        try (con) {
            PreparedStatement stm = con.prepareStatement("SELECT ID, NOMBRE,"
                    + " APELLIDO, TELEFONO, LOCALIDAD FROM CLIENTES"
                    + " WHERE NOMBRE LIKE ? OR APELLIDO LIKE ? ");
            try (stm) {

                stm.setString(1, "%" + nombre + "%");
                stm.setString(2, "%" + nombre + "%");
                stm.execute();

                ResultSet result = stm.executeQuery();

                try (result) {
                    while (result.next()) {
                        Cliente fila = new Cliente(result.getLong("id"),
                                result.getString("NOMBRE"), result.getString("APELLIDO"),
                                result.getString("TELEFONO"), result.getString("LOCALIDAD"));

                        resultado.add(fila);
                    }
                }
            }

        } catch (SQLException e) {

            throw new RuntimeException(e);
        }
        return resultado;
    }    
    
    public List<Cliente> listarCuentas(String nombre) {
        List<Cliente> resultado = new ArrayList<>();
        final Connection con = new ConnectionFactory().recuperaConexion();

        try (con) {
            PreparedStatement stm = con.prepareStatement("SELECT A.ID, A.NOMBRE,"
                    + " A.APELLIDO, B., LOCALIDAD FROM CLIENTES"
                    + " WHERE NOMBRE LIKE ? OR APELLIDO LIKE ? ");
            try (stm) {

                stm.setString(1, "%" + nombre + "%");
                stm.setString(2, "%" + nombre + "%");
                stm.execute();

                ResultSet result = stm.executeQuery();

                while (result.next()) {
                    Cliente fila = new Cliente(result.getLong("id"),
                            result.getString("NOMBRE"), result.getString("APELLIDO"),
                            result.getString("TELEFONO"), result.getString("LOCALIDAD"));

                    resultado.add(fila);
                }
            }
            
        } catch (SQLException e) {

            throw new RuntimeException(e);
        }
        return resultado;
    }

    public List<Cliente> listarTelefonos(String entrada) {
        List<Cliente> resultado = new ArrayList<>();
        final Connection con = new ConnectionFactory().recuperaConexion();

        try (con) {
            PreparedStatement stm = con.prepareStatement("SELECT ID, NOMBRE,"
                    + " APELLIDO, TELEFONO, LOCALIDAD FROM CLIENTES"
                    + " WHERE TELEFONO LIKE ? ");
            try (stm) {

                stm.setString(1, "%" + entrada + "%");
                stm.execute();

                ResultSet result = stm.executeQuery();

                while (result.next()) {
                    Cliente fila = new Cliente(result.getLong("id"),
                            result.getString("NOMBRE"), result.getString("APELLIDO"),
                            result.getString("TELEFONO"), result.getString("LOCALIDAD"));

                    resultado.add(fila);
                }
            }
            
        } catch (SQLException e) {

            throw new RuntimeException(e);
        }
        return resultado;
    }

    public List<Cliente> listarCodigo(long entrada) {
        List<Cliente> resultado = new ArrayList<>();
        final Connection con = new ConnectionFactory().recuperaConexion();

        try (con) {
            PreparedStatement stm = con.prepareStatement("SELECT ID, NOMBRE,"
                    + " APELLIDO, TELEFONO, LOCALIDAD FROM CLIENTES"
                    + " WHERE id = ?");
            try (stm) {

                stm.setLong(1, entrada);
                stm.execute();

                ResultSet result = stm.executeQuery();

                try (result) {
                    while (result.next()) {
                        Cliente fila = new Cliente(result.getLong("id"),
                                result.getString("NOMBRE"), result.getString("APELLIDO"),
                                result.getString("TELEFONO"), result.getString("LOCALIDAD"));

                        resultado.add(fila);
                    }
                }
            }

        } catch (SQLException e) {

            throw new RuntimeException(e);
        }
        return resultado;
    }
}
