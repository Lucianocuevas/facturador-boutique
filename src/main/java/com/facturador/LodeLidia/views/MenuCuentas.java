package com.facturador.LodeLidia.views;

import com.facturador.LodeLidia.controller.ClienteController;
import com.facturador.LodeLidia.controller.ComprobantesController;
import com.facturador.LodeLidia.controller.DetalleFacturaController;
import com.facturador.LodeLidia.controller.FacturaController;
import com.facturador.LodeLidia.modelo.Cliente;
import com.facturador.LodeLidia.modelo.Comprobantes;
import com.facturador.LodeLidia.modelo.DetalleFactura;
import com.facturador.LodeLidia.modelo.Factura;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class MenuCuentas extends javax.swing.JFrame {

    private String[] cargaTablaCuentas;
    private DefaultTableModel modeloCuentas;
    private ClienteController clienteController;
    private FacturaController facturaController;
    private ComprobantesController comprobantesController;
    private DetalleFacturaController itemsController;
    private Comprobantes comprobantes;
    private Cliente cliente;
    private Factura facturas;
    private DetalleFactura items;
    private Calendar fechaActual = new GregorianCalendar();
    private List<Comprobantes> creditos;
    private List<Factura> debitos;
    int xMouse, yMouse;

    public MenuCuentas() {
        initComponents();
        cargarTablas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgClientes = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        txtBuscarNombreDialog = new javax.swing.JTextField();
        txtBuscarCodigoDialog = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbClienteDialog = new javax.swing.JTable();
        lblNombreDialog = new javax.swing.JLabel();
        lblCodigoDialog = new javax.swing.JLabel();
        btnBuscarNombreDialog = new javax.swing.JButton();
        btnBuscarCodigoDialog = new javax.swing.JButton();
        lblTelefonoDialog = new javax.swing.JLabel();
        txtBuscarTelefonoDialog = new javax.swing.JTextField();
        btnBuscarTelefonoDialog = new javax.swing.JButton();
        btnAgregarClienteDialog = new javax.swing.JButton();
        btnAgregarClienteCancelar = new javax.swing.JButton();
        TituloDialog = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblAtras = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCuenta = new javax.swing.JTable();
        btnSoloFacturas = new javax.swing.JButton();
        btnSoloCreditos = new javax.swing.JButton();
        btnVerFactura = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        dcFecha = new com.toedter.calendar.JDateChooser();
        btnCambiarCliente = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        dlgClientes.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dlgClientes.setModal(true);
        dlgClientes.setUndecorated(true);
        dlgClientes.setResizable(false);
        dlgClientes.setSize(new java.awt.Dimension(855, 565));

        txtBuscarNombreDialog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarNombreDialogKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarNombreDialogKeyTyped(evt);
            }
        });

        txtBuscarCodigoDialog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarCodigoDialogKeyTyped(evt);
            }
        });

        jScrollPane4.setViewportView(tbClienteDialog);

        lblNombreDialog.setText("Nombre");

        lblCodigoDialog.setText("Codigo");

        btnBuscarNombreDialog.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\buscar_cliente.png")); // NOI18N
        btnBuscarNombreDialog.setText("Buscar Por Nombre");
        btnBuscarNombreDialog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarNombreDialogMouseClicked(evt);
            }
        });
        btnBuscarNombreDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNombreDialogActionPerformed(evt);
            }
        });

        btnBuscarCodigoDialog.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\buscar_cliente.png")); // NOI18N
        btnBuscarCodigoDialog.setText("Buscar Por Codigo");
        btnBuscarCodigoDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCodigoDialogActionPerformed(evt);
            }
        });

        lblTelefonoDialog.setText("Telefono");

        txtBuscarTelefonoDialog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarTelefonoDialogKeyTyped(evt);
            }
        });

        btnBuscarTelefonoDialog.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\buscar_cliente.png")); // NOI18N
        btnBuscarTelefonoDialog.setText("Buscar Por Telefono");
        btnBuscarTelefonoDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTelefonoDialogActionPerformed(evt);
            }
        });

        btnAgregarClienteDialog.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\adherir_cliente.png")); // NOI18N
        btnAgregarClienteDialog.setText("Agregar Cliente a factura");
        btnAgregarClienteDialog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarClienteDialogMouseClicked(evt);
            }
        });
        btnAgregarClienteDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteDialogActionPerformed(evt);
            }
        });

        btnAgregarClienteCancelar.setText("Cancelar");
        btnAgregarClienteCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAgregarClienteDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarClienteCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombreDialog)
                                    .addComponent(lblTelefonoDialog))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBuscarCodigoDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBuscarNombreDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBuscarTelefonoDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblCodigoDialog))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarTelefonoDialog, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(btnBuscarCodigoDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarNombreDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(117, 117, 117))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarNombreDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreDialog)
                    .addComponent(btnBuscarNombreDialog))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarCodigoDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoDialog)
                    .addComponent(btnBuscarCodigoDialog))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarTelefonoDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoDialog)
                    .addComponent(btnBuscarTelefonoDialog))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarClienteDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarClienteCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        TituloDialog.setBackground(new java.awt.Color(73, 51, 51));
        TituloDialog.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        TituloDialog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloDialog.setText("Clientes");
        TituloDialog.setOpaque(true);

        javax.swing.GroupLayout dlgClientesLayout = new javax.swing.GroupLayout(dlgClientes.getContentPane());
        dlgClientes.getContentPane().setLayout(dlgClientesLayout);
        dlgClientesLayout.setHorizontalGroup(
            dlgClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TituloDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgClientesLayout.setVerticalGroup(
            dlgClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgClientesLayout.createSequentialGroup()
                .addComponent(TituloDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estado de Cuentas");
        setMaximumSize(new java.awt.Dimension(1042, 585));
        setMinimumSize(new java.awt.Dimension(1042, 585));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("Estado de cuenta");

        lblSalir.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
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

        lblMinimizar.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
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

        lblAtras.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
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
                .addGap(418, 418, 418)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 364, Short.MAX_VALUE)
                .addComponent(lblMinimizar)
                .addGap(18, 18, 18)
                .addComponent(lblSalir)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSalir)
                        .addComponent(lblMinimizar)
                        .addComponent(lblAtras))
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbCuenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbCuenta);

        btnSoloFacturas.setText("Mostrar todas las Facturas");

        btnSoloCreditos.setText("Mostrar todas las notas de credito");

        btnVerFactura.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\search.png")); // NOI18N
        btnVerFactura.setText("Ver factura");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSoloFacturas)
                        .addGap(18, 18, 18)
                        .addComponent(btnSoloCreditos)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerFactura)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSoloFacturas)
                    .addComponent(btnSoloCreditos)
                    .addComponent(btnVerFactura))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 940, 380));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCliente.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblCliente.setText("Cliente");

        txtCliente.setBackground(new java.awt.Color(0, 153, 0));
        txtCliente.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtCliente.setForeground(new java.awt.Color(0, 0, 0));

        dcFecha.setDateFormatString("dd/MM/yyyy");

        btnCambiarCliente.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\buscar_cliente_grande.png")); // NOI18N
        btnCambiarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarClienteActionPerformed(evt);
            }
        });

        btnAceptar.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\round_done_white_24dp.png")); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCliente)
                .addGap(18, 18, 18)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCambiarCliente)
                .addGap(18, 18, 18)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCambiarCliente)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCliente))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(dcFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 940, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collpased" desc="  Botones ">
    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        click(evt);
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        mover(evt);
    }//GEN-LAST:event_headerMouseDragged

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        salir();
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        lblSalir.setForeground(Color.red);
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        lblSalir.setForeground(new Color(187, 187, 187));
    }//GEN-LAST:event_lblSalirMouseExited

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseEntered
        lblMinimizar.setForeground(Color.green);
    }//GEN-LAST:event_lblMinimizarMouseEntered

    private void lblMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseExited
        lblMinimizar.setForeground(new Color(187, 187, 187));
    }//GEN-LAST:event_lblMinimizarMouseExited

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
//        Menu menu = new Menu();
//        menu.setLocationRelativeTo(null);
//        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAtrasMouseClicked

    private void lblAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseEntered
        lblAtras.setForeground(Color.cyan);
    }//GEN-LAST:event_lblAtrasMouseEntered

    private void lblAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseExited
        lblAtras.setForeground(new Color(187, 187, 187));;
    }//GEN-LAST:event_lblAtrasMouseExited

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        MostrarEstadoCuenta();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCambiarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarClienteActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCambiarClienteActionPerformed

    private void txtBuscarNombreDialogKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNombreDialogKeyTyped
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            BuscarClienteNombre();
        }
    }//GEN-LAST:event_txtBuscarNombreDialogKeyTyped

    private void txtBuscarCodigoDialogKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodigoDialogKeyTyped
        Solonumeros(evt);
        
    }//GEN-LAST:event_txtBuscarCodigoDialogKeyTyped

    private void btnBuscarNombreDialogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarNombreDialogMouseClicked
        BuscarClienteNombre();
    }//GEN-LAST:event_btnBuscarNombreDialogMouseClicked

    private void btnBuscarNombreDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNombreDialogActionPerformed
        BuscarClienteNombre();
    }//GEN-LAST:event_btnBuscarNombreDialogActionPerformed

    private void btnBuscarCodigoDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCodigoDialogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarCodigoDialogActionPerformed

    private void txtBuscarTelefonoDialogKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarTelefonoDialogKeyTyped
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            
        }
    }//GEN-LAST:event_txtBuscarTelefonoDialogKeyTyped

    private void btnBuscarTelefonoDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTelefonoDialogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarTelefonoDialogActionPerformed

    private void btnAgregarClienteDialogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarClienteDialogMouseClicked
        
    }//GEN-LAST:event_btnAgregarClienteDialogMouseClicked

    private void btnAgregarClienteDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteDialogActionPerformed
        agregarCliente();
    }//GEN-LAST:event_btnAgregarClienteDialogActionPerformed

    private void btnAgregarClienteCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteCancelarActionPerformed
        CerrarDialogo(dlgClientes);
    }//GEN-LAST:event_btnAgregarClienteCancelarActionPerformed

    private void txtBuscarNombreDialogKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNombreDialogKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarNombreDialogKeyPressed
    //</editor-fold>

    public static void main(String args[]) {

        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCuentas().setVisible(true);
            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc="  Variable no modificables    ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloDialog;
    private javax.swing.JButton btnAceptar;
    public javax.swing.JButton btnAgregarClienteCancelar;
    public javax.swing.JButton btnAgregarClienteDialog;
    public javax.swing.JButton btnBuscarCodigoDialog;
    public javax.swing.JButton btnBuscarNombreDialog;
    public javax.swing.JButton btnBuscarTelefonoDialog;
    private javax.swing.JButton btnCambiarCliente;
    private javax.swing.JButton btnSoloCreditos;
    private javax.swing.JButton btnSoloFacturas;
    private javax.swing.JButton btnVerFactura;
    private com.toedter.calendar.JDateChooser dcFecha;
    public javax.swing.JDialog dlgClientes;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCodigoDialog;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNombreDialog;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblTelefonoDialog;
    private javax.swing.JTable tbClienteDialog;
    private javax.swing.JTable tbCuenta;
    private javax.swing.JTextField txtBuscarCodigoDialog;
    private javax.swing.JTextField txtBuscarNombreDialog;
    private javax.swing.JTextField txtBuscarTelefonoDialog;
    private javax.swing.JTextField txtCliente;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>

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

    private void cargarTablas() {
        this.comprobantesController = new ComprobantesController();
        this.clienteController = new ClienteController();
        this.facturaController = new FacturaController();
        this.itemsController = new DetalleFacturaController();
        cargaTablaCuentas = new String[]{"Fecha", "N° Comprobante", "Descripción", "Debitos", "Creditos", "Total"};
        cargarTablaCuentas(cargaTablaCuentas);
        dcFecha.setCalendar(fechaActual);
        dcFecha.setFont(new Font("Roboto", Font.BOLD, 24));
    }

    private void cargarTablaCuentas(String[] carga) {
        
        modeloCuentas = (DefaultTableModel) tbCuenta.getModel();
        this.tbCuenta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        for (int i = 0; i < carga.length; i++) {
            modeloCuentas.addColumn(carga[i]);
        }

    }

    private void salir() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?", "Cerrar Sesión", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (respuesta == 0) {
            this.dispose();
        }
    }

    private void MostrarEstadoCuenta() {
        if (cliente != null) {

            creditos = new ArrayList<>();
            debitos = new ArrayList<>();
            debitos = facturaController.verFacturas(cliente);
            creditos = comprobantesController.verComprobantes(cliente);
            Listar(debitos, creditos);

        }
    }

    protected void SetearCliente(Cliente c) {
        cliente = new Cliente(c.getId(), c.getNombre(), c.getApellido(), c.getTelefono(), c.getLocalidad());
        txtCliente.setText(cliente.getApellido() + ", " + cliente.getNombre());

    }

    private void Listar(List<Factura> debitos, List<Comprobantes> creditos) {
        long inicio = 0;
        Limpiar(modeloCuentas);
        float total = 0;
        tbCuenta.setFont(new Font("Roboto", Font.LAYOUT_LEFT_TO_RIGHT,15));
        for (int i = 0; i < debitos.size() || i < creditos.size(); i++) {
            if (i < debitos.size()){
                tbCuenta.setSelectionBackground(Color.red);
                
                total += debitos.get(i).getTotal();
                modeloCuentas.addRow(new Object[]{debitos.get(i).getFechaCliente(), debitos.get(i).getnFactura(),
                "Factura", debitos.get(i).getTotal(), "", total});                
            }
            if (i < creditos.size()) {
                
                total -= creditos.get(i).getImporte();
                modeloCuentas.addRow(new Object[]{creditos.get(i).getFecha(), creditos.get(i).getnComprobante(),
                    creditos.get(i).getDescripcion(), "", creditos.get(i).getImporte(), total});
            }
            
            
            
        }
    }

    private void Limpiar(DefaultTableModel modelo) {
        while(modelo.getRowCount() > 0){
            modelo.removeRow(0);
        }
    }

    private void CerrarDialogo(JDialog dlgClientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void agregarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void BuscarClienteNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void Solonumeros(KeyEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
