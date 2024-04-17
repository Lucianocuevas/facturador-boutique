/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.facturador.LodeLidia.views;

import com.facturador.LodeLidia.controller.ClienteController;
import com.facturador.LodeLidia.controller.ProductoController;
import com.facturador.LodeLidia.modelo.Cliente;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuClientes extends javax.swing.JFrame {

    int xMouse, yMouse;
    private ClienteController clienteController;
    private ProductoController productoController;
    private String[] cargaTablaClientes, cargaTablaCuenta;
    private DefaultTableModel modeloCliente;
    private Cliente nuevoCliente,cliente;
    private Calendar fechaActual = new GregorianCalendar();

    public MenuClientes() {
        initComponents();
        cargarTablas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgEstadoCuenta = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        lblDlgEstadoCuentaCliente = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnDlgEstadoCuentaCambiarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDlogEstadoCuentaCuenta = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        Contenedor = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        lblClientes = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblAtras = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        pnListadoClientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        tfTelefono = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblCliente = new javax.swing.JLabel();
        btnEliminarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnVerEstado = new javax.swing.JButton();
        tfNombre = new javax.swing.JTextField();
        lblCliente1 = new javax.swing.JLabel();
        btnBuscarTelefono = new javax.swing.JButton();
        btnCrearFactura = new javax.swing.JButton();
        btnCrearNotaCredito = new javax.swing.JButton();
        pnCargaCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtLocalidad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtLimite = new javax.swing.JTextField();
        btnAceptarCrear = new javax.swing.JButton();
        btnCancelarCrear = new javax.swing.JButton();
        dcFechaCreacion = new com.toedter.calendar.JDateChooser();

        dlgEstadoCuenta.setModal(true);
        dlgEstadoCuenta.setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDlgEstadoCuentaCliente.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblDlgEstadoCuentaCliente.setText("Cliente");
        jPanel1.add(lblDlgEstadoCuentaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jButton1.setText("jButton1");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, -1, -1));

        btnDlgEstadoCuentaCambiarCliente.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\buscar_cliente.png")); // NOI18N
        btnDlgEstadoCuentaCambiarCliente.setText("Cambiar Cliente");
        jPanel1.add(btnDlgEstadoCuentaCambiarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, -1, -1));

        tbDlogEstadoCuentaCuenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbDlogEstadoCuentaCuenta);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 207, 760, 300));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 204, 0));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 330, -1));

        javax.swing.GroupLayout dlgEstadoCuentaLayout = new javax.swing.GroupLayout(dlgEstadoCuenta.getContentPane());
        dlgEstadoCuenta.getContentPane().setLayout(dlgEstadoCuentaLayout);
        dlgEstadoCuentaLayout.setHorizontalGroup(
            dlgEstadoCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgEstadoCuentaLayout.setVerticalGroup(
            dlgEstadoCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headerMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        lblClientes.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClientes.setText("Clientes");

        lblSalir.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("X");
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalirMouseExited(evt);
            }
        });

        lblMinimizar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimizar.setText("-");
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseExited(evt);
            }
        });

        lblAtras.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAtras.setText("<");
        lblAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAtrasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAtras)
                .addGap(487, 487, 487)
                .addComponent(lblClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
                .addComponent(lblMinimizar)
                .addGap(18, 18, 18)
                .addComponent(lblSalir)
                .addGap(86, 86, 86))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClientes)
                    .addComponent(lblSalir)
                    .addComponent(lblMinimizar)
                    .addComponent(lblAtras))
                .addContainerGap())
        );

        Contenedor.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 40));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbClientes);

        btnBuscar.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\search.png")); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblCliente.setText("Buscar por nombre");

        btnEliminarCliente.setText("Eliminar Cliente");

        btnEditarCliente.setText("Editar Cliente");

        btnVerEstado.setText("Estado de cuenta");
        btnVerEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEstadoActionPerformed(evt);
            }
        });

        lblCliente1.setText("Buscar por celular");

        btnBuscarTelefono.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\search.png")); // NOI18N
        btnBuscarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTelefonoActionPerformed(evt);
            }
        });

        btnCrearFactura.setText("Crear Factura");
        btnCrearFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearFacturaActionPerformed(evt);
            }
        });

        btnCrearNotaCredito.setText("Crear Nota De Credito");

        javax.swing.GroupLayout pnListadoClientesLayout = new javax.swing.GroupLayout(pnListadoClientes);
        pnListadoClientes.setLayout(pnListadoClientesLayout);
        pnListadoClientesLayout.setHorizontalGroup(
            pnListadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListadoClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnListadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnListadoClientesLayout.createSequentialGroup()
                        .addGroup(pnListadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnListadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnListadoClientesLayout.createSequentialGroup()
                                .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarTelefono))
                            .addGroup(pnListadoClientesLayout.createSequentialGroup()
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)))))
                .addGap(35, 35, 35)
                .addGroup(pnListadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearNotaCredito, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        pnListadoClientesLayout.setVerticalGroup(
            pnListadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnListadoClientesLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(pnListadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnListadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCliente)
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(pnListadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnListadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCliente1))
                    .addComponent(btnBuscarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnListadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnListadoClientesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearNotaCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        jTabbedPane2.addTab("Listado de Clientes", pnListadoClientes);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setText("Localidad");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel4.setText("Telefono");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel5.setText("Limite Credito");

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        txtApellido.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        txtLocalidad.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        txtLimite.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        btnAceptarCrear.setBackground(new java.awt.Color(0, 204, 0));
        btnAceptarCrear.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnAceptarCrear.setForeground(new java.awt.Color(51, 51, 51));
        btnAceptarCrear.setText("Crear");
        btnAceptarCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarCrearActionPerformed(evt);
            }
        });

        btnCancelarCrear.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelarCrear.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnCancelarCrear.setText("Cancelar");

        dcFechaCreacion.setBackground(new java.awt.Color(0, 0, 0));
        dcFechaCreacion.setForeground(new java.awt.Color(204, 255, 255));
        dcFechaCreacion.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout pnCargaClienteLayout = new javax.swing.GroupLayout(pnCargaCliente);
        pnCargaCliente.setLayout(pnCargaClienteLayout);
        pnCargaClienteLayout.setHorizontalGroup(
            pnCargaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCargaClienteLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(pnCargaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(73, 73, 73)
                .addGroup(pnCargaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono)
                    .addComponent(txtLimite)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido)
                    .addComponent(txtLocalidad))
                .addGap(103, 103, 103)
                .addGroup(pnCargaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAceptarCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelarCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(dcFechaCreacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(281, 281, 281))
        );
        pnCargaClienteLayout.setVerticalGroup(
            pnCargaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCargaClienteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnCargaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(dcFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(pnCargaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnCargaClienteLayout.createSequentialGroup()
                        .addGroup(pnCargaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(55, 55, 55)
                        .addGroup(pnCargaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(55, 55, 55))
                    .addGroup(pnCargaClienteLayout.createSequentialGroup()
                        .addComponent(btnAceptarCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39)))
                .addGroup(pnCargaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCargaClienteLayout.createSequentialGroup()
                        .addGroup(pnCargaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(56, 56, 56)
                        .addGroup(pnCargaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCancelarCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Cliente Nuevo", pnCargaCliente);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        Contenedor.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 990, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarCliente();
    }//GEN-LAST:event_btnBuscarActionPerformed

    //<editor-fold defaultstate="collapsed" desc=" acciones del formulario ">
    private void headerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseClicked

    }//GEN-LAST:event_headerMouseClicked

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        click(evt);
    }//GEN-LAST:event_headerMousePressed

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        lblSalir.setForeground(Color.red);
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        salir();
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        lblSalir.setForeground(new Color(187, 187, 187));
    }//GEN-LAST:event_lblSalirMouseExited

    private void lblMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseEntered
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseEntered

    private void lblMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMinimizarMouseExited

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAtrasMouseEntered

    private void lblAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAtrasMouseExited

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAtrasMouseClicked

    private void btnBuscarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTelefonoActionPerformed
        BuscarTelefono();
    }//GEN-LAST:event_btnBuscarTelefonoActionPerformed
   
    private void btnAceptarCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarCrearActionPerformed
        CrearCliente();
    }//GEN-LAST:event_btnAceptarCrearActionPerformed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        mover(evt);
    }//GEN-LAST:event_headerMouseDragged

    private void btnVerEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEstadoActionPerformed
        EstadoCuenta();
    }//GEN-LAST:event_btnVerEstadoActionPerformed

    private void btnCrearFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFacturaActionPerformed
        HacerFactura();
    }//GEN-LAST:event_btnCrearFacturaActionPerformed
    //</editor-fold>

    public static void main(String args[]) {

        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuClientes().setVisible(true);
            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc="  Mover panel ">>
    protected void mover(MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }

    private void click(MouseEvent evt) {
        xMouse = evt.getX();
        yMouse = evt.getY();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Variables no tocar ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JButton btnAceptarCrear;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarTelefono;
    private javax.swing.JButton btnCancelarCrear;
    private javax.swing.JButton btnCrearFactura;
    private javax.swing.JButton btnCrearNotaCredito;
    private javax.swing.JButton btnDlgEstadoCuentaCambiarCliente;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnVerEstado;
    private com.toedter.calendar.JDateChooser dcFechaCreacion;
    private javax.swing.JDialog dlgEstadoCuenta;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCliente1;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblDlgEstadoCuentaCliente;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel pnCargaCliente;
    private javax.swing.JPanel pnListadoClientes;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTable tbDlogEstadoCuentaCuenta;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtLimite;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="  Carga y creacion de Tablas  ">
    private void cargarTablaCliente(String[] carga) {
        modeloCliente = (DefaultTableModel) tbClientes.getModel();
        for (int i = 0; i < carga.length; ++i) {
            modeloCliente.addColumn(carga[i]);
        }
    }

    private void cargarTablas() {
        this.clienteController = new ClienteController();
        cargaTablaClientes = new String[]{"ID", "Nombre", "Apellido", "Telefono", "Localidad", "Fecha Creación"};
        cargaTablaCuenta = new String[]{"ID", "Nombre", "Apellido", "Telefono", "Localidad", "Fecha Creación"};
        cargarTablaCliente(cargaTablaClientes);
        dcFechaCreacion.setCalendar(fechaActual);
    }
    
    private void limpiarTabla(DefaultTableModel modelo) {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    private void salir() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?", "Cerrar Sesión", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (respuesta == 0) {
            this.dispose();
        }
    }

    private void Mensaje(String msg, String titulo, int msgType) {
        JOptionPane.showMessageDialog(null, msg, titulo, msgType);
    }
    
    private boolean campovacio(){
        return txtNombre.getText().isBlank() || txtApellido.getText().isBlank();
    }
    private void Limpiar(String s) {
        txtNombre.setText(s);
        txtApellido.setText(s);
        txtLimite.setText(s);
        txtLocalidad.setText(s);
        txtTelefono.setText(s);
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="  ABM clientes    ">
    private void BuscarTelefono() {
        String entrada = tfTelefono.getText();
        
        if (modeloCliente != null) {
            limpiarTabla(modeloCliente);
        }
        
        var clientes = clienteController.listarPorTelefono(entrada);
        
        clientes.forEach(cliente -> modeloCliente.addRow(new Object[]{
            cliente.getId(), cliente.getNombre(), cliente.getApellido(),
            cliente.getTelefono(), cliente.getLocalidad(), cliente.getFechaCreacion().toString()}));
    }
    
    private void buscarCliente() {
        String entrada = tfNombre.getText();

        if (modeloCliente != null) {
            limpiarTabla(modeloCliente);
        }

        var clientes = clienteController.listarPorNombre(entrada);

        clientes.forEach(cliente -> modeloCliente.addRow(new Object[]{
            cliente.getId(), cliente.getNombre(), cliente.getApellido(),
            cliente.getTelefono(), cliente.getLocalidad(), cliente.getFechaCreacion().toString()}));
    }

    private void CrearCliente() {
        long respuesta = 0;
        java.sql.Date fecha = new java.sql.Date(dcFechaCreacion.getDate().getTime());
        if (campovacio()) {
            Mensaje("Por favor, ingrese datos validos", "¡ERROR EN CARGA DE DATOS!", WIDTH);
        } else {
            
            nuevoCliente = new Cliente(txtNombre.getText(), txtApellido.getText(), txtTelefono.getText(),
                    txtLocalidad.getText(), Float.valueOf(txtLimite.getText()), fecha);
            respuesta = clienteController.crearNuevo(nuevoCliente);
            Mensaje("Se creo el cliente N° "+respuesta+" ¡"+nuevoCliente.getApellido()+", "
                    +nuevoCliente.getNombre()+"!", "¡Nuevo Cliente Creado!", JOptionPane.INFORMATION_MESSAGE);
            Limpiar("");
        }
    }
//  </editor-fold>

    private void EstadoCuenta() {
        
    }

    private void HacerFactura() {
        MenuVenta venta = new MenuVenta();
        venta.setLocationRelativeTo(null);
        venta.setVisible(true);
        
        if(tbClientes.getSelectedRowCount() == 0 || tbClientes.getSelectedColumnCount() == 0){
            Mensaje("Seleccione un cliente para realizar una factura", "¡No hay datos!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            
            //cliente = new Cliente(Long.MIN_VALUE, nombre, apellido, telefono, localidad);
        }
        //venta.setearCliente(nuevoCliente);
    }
    
    
}
