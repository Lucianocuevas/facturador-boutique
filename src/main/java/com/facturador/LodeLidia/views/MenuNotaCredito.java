package com.facturador.LodeLidia.views;

import com.facturador.LodeLidia.controller.ClienteController;
import com.facturador.LodeLidia.controller.ComprobantesController;
import com.facturador.LodeLidia.modelo.Cliente;
import com.facturador.LodeLidia.modelo.Comprobantes;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuNotaCredito extends javax.swing.JFrame {

    //<editor-fold defaultstate="collapsed" desc="  Variables globales  ">
    int xMouse, yMouse;
    private Cliente cliente;
    private ClienteController clienteController;
    private Comprobantes comprobante;
    private ComprobantesController comprobanteController;
    private DefaultTableModel modeloComprobante, modeloCliente;
    private String[] cargaTablaComprobantes, cargaTablaCliente, cargaFormaPago;
    private Calendar fechaActual = new GregorianCalendar();
    private MenuVenta menuCliente = new MenuVenta();
    private int total;
    //</editor-fold>
    
    public MenuNotaCredito() {
        initComponents();
        cargaTablas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgClientes = new javax.swing.JDialog();
        Fondo = new javax.swing.JPanel();
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
        dlgDescripcion = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnDlgDescripcionCancelar = new javax.swing.JButton();
        btnDlgDescripcionAceptar = new javax.swing.JButton();
        txtDlgDescripcionCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescripcion = new javax.swing.JTextArea();
        lblDlgDescripcionDescripcion = new javax.swing.JLabel();
        lblDlgDescripcion = new javax.swing.JLabel();
        cbDlgDescripcionForma = new javax.swing.JComboBox<>();
        lblDlgDescripcionImporte = new javax.swing.JLabel();
        lblDlgDescripcionForma = new javax.swing.JLabel();
        txtDlgDescripcionImporte = new javax.swing.JTextField();
        Contenedor1 = new javax.swing.JPanel();
        panelFondo1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        lblAtras = new javax.swing.JLabel();
        pnPrincipal1 = new javax.swing.JPanel();
        Encabezado1 = new javax.swing.JPanel();
        lblCliente4 = new javax.swing.JLabel();
        lblCliente5 = new javax.swing.JLabel();
        lblCliente6 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        txtLocalidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dcHora = new com.toedter.calendar.JDateChooser();
        btnBuscarCliente = new javax.swing.JButton();
        ContenedorComprobante1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbFactura = new javax.swing.JTable();
        Datos1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        lblTotal1 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnCobrar = new javax.swing.JButton();
        btnAgregarDescripcion = new javax.swing.JButton();

        dlgClientes.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dlgClientes.setTitle("Clientes");
        dlgClientes.setMaximumSize(new java.awt.Dimension(792, 521));
        dlgClientes.setMinimumSize(new java.awt.Dimension(792, 521));
        dlgClientes.setModal(true);
        dlgClientes.setUndecorated(true);
        dlgClientes.setPreferredSize(new java.awt.Dimension(855, 565));
        dlgClientes.setSize(new java.awt.Dimension(855, 565));

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

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(btnAgregarClienteDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarClienteCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FondoLayout.createSequentialGroup()
                                        .addComponent(lblNombreDialog)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBuscarCodigoDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBuscarNombreDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBuscarTelefonoDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblCodigoDialog))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                .addComponent(lblTelefonoDialog)
                                .addGap(361, 361, 361)))
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarTelefonoDialog, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(btnBuscarCodigoDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarNombreDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(117, 117, 117))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarNombreDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreDialog)
                    .addComponent(btnBuscarNombreDialog))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarCodigoDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoDialog)
                    .addComponent(btnBuscarCodigoDialog))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarTelefonoDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoDialog)
                    .addComponent(btnBuscarTelefonoDialog))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
            .addComponent(TituloDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgClientesLayout.setVerticalGroup(
            dlgClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgClientesLayout.createSequentialGroup()
                .addComponent(TituloDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dlgDescripcion.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dlgDescripcion.setTitle("Descripcion");
        dlgDescripcion.setMaximumSize(new java.awt.Dimension(792, 521));
        dlgDescripcion.setMinimumSize(new java.awt.Dimension(792, 521));
        dlgDescripcion.setModal(true);
        dlgDescripcion.setUndecorated(true);
        dlgDescripcion.setSize(new java.awt.Dimension(792, 521));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnDlgDescripcionCancelar.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        btnDlgDescripcionCancelar.setText("Cancelar");
        btnDlgDescripcionCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgDescripcionCancelarActionPerformed(evt);
            }
        });

        btnDlgDescripcionAceptar.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        btnDlgDescripcionAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnDlgDescripcionAceptar.setText("Aceptar");
        btnDlgDescripcionAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgDescripcionAceptarActionPerformed(evt);
            }
        });

        txtDlgDescripcionCliente.setEditable(false);
        txtDlgDescripcionCliente.setBackground(new java.awt.Color(0, 0, 0));
        txtDlgDescripcionCliente.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        txtDlgDescripcionCliente.setForeground(new java.awt.Color(0, 153, 0));

        txtAreaDescripcion.setBackground(new java.awt.Color(0, 0, 0));
        txtAreaDescripcion.setColumns(20);
        txtAreaDescripcion.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtAreaDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaDescripcion.setLineWrap(true);
        txtAreaDescripcion.setRows(5);
        txtAreaDescripcion.setMaximumSize(new java.awt.Dimension(232, 84));
        txtAreaDescripcion.setMinimumSize(new java.awt.Dimension(232, 84));
        txtAreaDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAreaDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtAreaDescripcion);

        lblDlgDescripcionDescripcion.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblDlgDescripcionDescripcion.setText("Descripcion");

        lblDlgDescripcion.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblDlgDescripcion.setText("Cliente");

        cbDlgDescripcionForma.setBackground(new java.awt.Color(0, 0, 0));
        cbDlgDescripcionForma.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N

        lblDlgDescripcionImporte.setBackground(new java.awt.Color(255, 0, 0));
        lblDlgDescripcionImporte.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblDlgDescripcionImporte.setForeground(new java.awt.Color(204, 204, 204));
        lblDlgDescripcionImporte.setText("Importe");
        lblDlgDescripcionImporte.setOpaque(true);

        lblDlgDescripcionForma.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblDlgDescripcionForma.setText("Forma de Pago");

        txtDlgDescripcionImporte.setBackground(new java.awt.Color(0, 153, 0));
        txtDlgDescripcionImporte.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        txtDlgDescripcionImporte.setForeground(new java.awt.Color(255, 255, 255));
        txtDlgDescripcionImporte.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDlgDescripcionImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDlgDescripcionImporteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDlgDescripcionDescripcion)
                    .addComponent(lblDlgDescripcion)
                    .addComponent(lblDlgDescripcionForma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDlgDescripcionImporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDlgDescripcionCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDlgDescripcionAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDlgDescripcionCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cbDlgDescripcionForma, javax.swing.GroupLayout.Alignment.LEADING, 0, 374, Short.MAX_VALUE)
                        .addComponent(txtDlgDescripcionImporte, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDlgDescripcion)
                    .addComponent(txtDlgDescripcionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDlgDescripcionDescripcion))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDlgDescripcionForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDlgDescripcionForma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDlgDescripcionImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDlgDescripcionImporte))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDlgDescripcionCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDlgDescripcionAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 740, 500));

        javax.swing.GroupLayout dlgDescripcionLayout = new javax.swing.GroupLayout(dlgDescripcion.getContentPane());
        dlgDescripcion.getContentPane().setLayout(dlgDescripcionLayout);
        dlgDescripcionLayout.setHorizontalGroup(
            dlgDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgDescripcionLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dlgDescripcionLayout.setVerticalGroup(
            dlgDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nota de Credito");
        setMaximumSize(new java.awt.Dimension(1030, 587));
        setMinimumSize(new java.awt.Dimension(1030, 587));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1030, 587));
        setSize(new java.awt.Dimension(1030, 587));

        Contenedor1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo1.setOpaque(false);

        header.setBackground(new java.awt.Color(73, 51, 51));
        header.setForeground(new java.awt.Color(0, 0, 0));
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

        lblSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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

        lblMinimizar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
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

        Titulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Titulo.setText("Nota Credito");

        lblAtras.setBackground(new java.awt.Color(204, 0, 0));
        lblAtras.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(412, 412, 412)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSalir)
                .addGap(14, 14, 14))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSalir)
                        .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAtras)
                        .addComponent(Titulo)))
                .addContainerGap())
        );

        pnPrincipal1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Encabezado1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Encabezado1.setMinimumSize(new java.awt.Dimension(860, 91));
        Encabezado1.setPreferredSize(new java.awt.Dimension(860, 91));

        lblCliente4.setBackground(new java.awt.Color(0, 153, 0));
        lblCliente4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblCliente4.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente4.setText("Nombre:");
        lblCliente4.setMaximumSize(new java.awt.Dimension(53, 25));
        lblCliente4.setMinimumSize(new java.awt.Dimension(53, 25));
        lblCliente4.setOpaque(true);
        lblCliente4.setPreferredSize(new java.awt.Dimension(53, 25));

        lblCliente5.setBackground(new java.awt.Color(0, 153, 0));
        lblCliente5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblCliente5.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente5.setText("Telefono");
        lblCliente5.setMaximumSize(new java.awt.Dimension(54, 25));
        lblCliente5.setMinimumSize(new java.awt.Dimension(54, 25));
        lblCliente5.setOpaque(true);

        lblCliente6.setBackground(new java.awt.Color(0, 153, 0));
        lblCliente6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblCliente6.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente6.setText("Apellido:");
        lblCliente6.setMaximumSize(new java.awt.Dimension(52, 25));
        lblCliente6.setMinimumSize(new java.awt.Dimension(52, 25));
        lblCliente6.setOpaque(true);
        lblCliente6.setPreferredSize(new java.awt.Dimension(52, 25));

        txtNombreCliente.setEditable(false);
        txtNombreCliente.setBackground(new java.awt.Color(0, 0, 0));
        txtNombreCliente.setBorder(null);
        txtNombreCliente.setEnabled(false);
        txtNombreCliente.setMinimumSize(new java.awt.Dimension(64, 19));

        txtTelefono.setEditable(false);
        txtTelefono.setBackground(new java.awt.Color(0, 0, 0));
        txtTelefono.setBorder(null);
        txtTelefono.setEnabled(false);
        txtTelefono.setMinimumSize(new java.awt.Dimension(64, 19));

        txtApellido.setBackground(new java.awt.Color(0, 0, 0));
        txtApellido.setBorder(null);
        txtApellido.setEnabled(false);
        txtApellido.setMinimumSize(new java.awt.Dimension(64, 19));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 153, 0));
        jTextField2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Localidad");
        jTextField2.setBorder(null);

        txtLocalidad.setEditable(false);
        txtLocalidad.setBackground(new java.awt.Color(0, 0, 0));
        txtLocalidad.setBorder(null);
        txtLocalidad.setEnabled(false);
        txtLocalidad.setMinimumSize(new java.awt.Dimension(64, 19));

        jLabel6.setText("Fecha");

        dcHora.setBackground(new java.awt.Color(78, 80, 82));
        dcHora.setForeground(new java.awt.Color(255, 255, 255));
        dcHora.setDateFormatString("dd/MM/yyyy");

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\buscar_cliente_grande.png")); // NOI18N
        btnBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarClienteMouseExited(evt);
            }
        });
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Encabezado1Layout = new javax.swing.GroupLayout(Encabezado1);
        Encabezado1.setLayout(Encabezado1Layout);
        Encabezado1Layout.setHorizontalGroup(
            Encabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Encabezado1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Encabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Encabezado1Layout.createSequentialGroup()
                        .addComponent(lblCliente5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Encabezado1Layout.createSequentialGroup()
                        .addComponent(lblCliente4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCliente6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(Encabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLocalidad, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Encabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Encabezado1Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(100, 100, 100))
                    .addGroup(Encabezado1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dcHora, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(3, Short.MAX_VALUE))))
        );
        Encabezado1Layout.setVerticalGroup(
            Encabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Encabezado1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(Encabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Encabezado1Layout.createSequentialGroup()
                        .addGroup(Encabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCliente6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Encabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCliente4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(Encabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCliente5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLocalidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(Encabezado1Layout.createSequentialGroup()
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(Encabezado1Layout.createSequentialGroup()
                        .addGroup(Encabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(Encabezado1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dcHora, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pnPrincipal1.add(Encabezado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 890, 100));

        ContenedorComprobante1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFacturaMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbFactura);

        Datos1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Datos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Datos1.setText("Datos del comprobante");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(0, 0, 0));
        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(51, 204, 0));
        txtTotal.setText("$ 0");

        lblTotal1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTotal1.setText("Total");

        btnLimpiar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\borrar_todo.png")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCobrar.setBackground(new java.awt.Color(204, 0, 0));
        btnCobrar.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        btnCobrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCobrar.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\shopping.png")); // NOI18N
        btnCobrar.setText("Cobrar");
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });

        btnAgregarDescripcion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnAgregarDescripcion.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\outline_edit_white_18dp.png")); // NOI18N
        btnAgregarDescripcion.setText("Agregar Descripción");
        btnAgregarDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDescripcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContenedorComprobante1Layout = new javax.swing.GroupLayout(ContenedorComprobante1);
        ContenedorComprobante1.setLayout(ContenedorComprobante1Layout);
        ContenedorComprobante1Layout.setHorizontalGroup(
            ContenedorComprobante1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorComprobante1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenedorComprobante1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Datos1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ContenedorComprobante1Layout.createSequentialGroup()
                        .addGroup(ContenedorComprobante1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                            .addGroup(ContenedorComprobante1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblTotal1)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(ContenedorComprobante1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAgregarDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCobrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        ContenedorComprobante1Layout.setVerticalGroup(
            ContenedorComprobante1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorComprobante1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Datos1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContenedorComprobante1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorComprobante1Layout.createSequentialGroup()
                        .addComponent(btnAgregarDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCobrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContenedorComprobante1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorComprobante1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblTotal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnPrincipal1.add(ContenedorComprobante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 890, 410));

        javax.swing.GroupLayout panelFondo1Layout = new javax.swing.GroupLayout(panelFondo1);
        panelFondo1.setLayout(panelFondo1Layout);
        panelFondo1Layout.setHorizontalGroup(
            panelFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondo1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(pnPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        panelFondo1Layout.setVerticalGroup(
            panelFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondo1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE))
        );

        Contenedor1.add(panelFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Contenedor1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Contenedor1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="  Acciones de botones ">
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
        lblMinimizar.setForeground(Color.CYAN);
    }//GEN-LAST:event_lblMinimizarMouseEntered

    private void lblMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseExited
        lblMinimizar.setForeground(new Color(187, 187, 187));
    }//GEN-LAST:event_lblMinimizarMouseExited

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
        Volver();
    }//GEN-LAST:event_lblAtrasMouseClicked

    private void lblAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseEntered
        lblAtras.setForeground(Color.green);
    }//GEN-LAST:event_lblAtrasMouseEntered

    private void lblAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseExited
        lblAtras.setForeground(new Color(187, 187, 187));
    }//GEN-LAST:event_lblAtrasMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        mover(evt);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        click(evt);
    }//GEN-LAST:event_headerMousePressed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void btnBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarClienteMouseClicked

    private void btnBuscarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarClienteMouseEntered

    private void btnBuscarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarClienteMouseExited

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        dlgClientes.setLocationRelativeTo(null);
        dlgClientes.setVisible(true);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void tbFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFacturaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbFacturaMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarTabla(modeloComprobante);
        clienteDefault();
        btnAgregarDescripcion.setEnabled(true);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        Cobrar();
    }//GEN-LAST:event_btnCobrarActionPerformed

    private void btnAgregarDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDescripcionActionPerformed
        ComprobarCliente();
    }//GEN-LAST:event_btnAgregarDescripcionActionPerformed

    private void btnBuscarNombreDialogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarNombreDialogMouseClicked
        BuscarClienteNombre();
    }//GEN-LAST:event_btnBuscarNombreDialogMouseClicked

    private void btnBuscarNombreDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNombreDialogActionPerformed
        BuscarClienteNombre();
    }//GEN-LAST:event_btnBuscarNombreDialogActionPerformed

    private void btnAgregarClienteDialogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarClienteDialogMouseClicked
        BuscarCliente();
    }//GEN-LAST:event_btnAgregarClienteDialogMouseClicked

    private void btnAgregarClienteDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteDialogActionPerformed
        BuscarCliente();
        CerrarDialogo(dlgClientes);
    }//GEN-LAST:event_btnAgregarClienteDialogActionPerformed

    private void btnAgregarClienteCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteCancelarActionPerformed
        CerrarDialogo(dlgClientes);
    }//GEN-LAST:event_btnAgregarClienteCancelarActionPerformed

    private void btnBuscarCodigoDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCodigoDialogActionPerformed
        BuscarClienteCodigo();
    }//GEN-LAST:event_btnBuscarCodigoDialogActionPerformed

    private void txtBuscarCodigoDialogKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodigoDialogKeyTyped
        Solonumeros(evt);
    }//GEN-LAST:event_txtBuscarCodigoDialogKeyTyped

    private void txtBuscarTelefonoDialogKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarTelefonoDialogKeyTyped
        Solonumeros(evt);
    }//GEN-LAST:event_txtBuscarTelefonoDialogKeyTyped

    private void btnBuscarTelefonoDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTelefonoDialogActionPerformed
        BuscarClienteTelefono();
    }//GEN-LAST:event_btnBuscarTelefonoDialogActionPerformed

    private void txtAreaDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaDescripcionKeyTyped

        if (txtAreaDescripcion.getText().trim().length() == 149 || evt.getKeyChar() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAreaDescripcionKeyTyped

    private void txtDlgDescripcionImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDlgDescripcionImporteKeyTyped
        Solonumeros(evt);
    }//GEN-LAST:event_txtDlgDescripcionImporteKeyTyped

    private void btnDlgDescripcionAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgDescripcionAceptarActionPerformed
        AgregarDescripcion();
    }//GEN-LAST:event_btnDlgDescripcionAceptarActionPerformed

    private void btnDlgDescripcionCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgDescripcionCancelarActionPerformed
        CerrarDialogo(dlgDescripcion);
    }//GEN-LAST:event_btnDlgDescripcionCancelarActionPerformed
    //</editor-fold>

    public static void main(String args[]) {

        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuNotaCredito().setVisible(true);
            }
        });
    }

    //<<editor-fold defaultstate="collapsed" desc="  Mover panel ">>
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
    
    //<editor-fold defaultstate="collapsed" desc="   Carga de Tablas ">
    private void cargaTablas() {
        
        this.clienteController = new ClienteController();
        this.comprobanteController = new ComprobantesController();
        this.cliente = new Cliente();
        cargaTablaComprobantes = new String[]{"FECHA", "CONCEPTO", "FORMA DE PAGO", "IMPORTE"};
        cargaTablaCliente = new String[]{"ID", "Nombre", "Apellido", "Telefono", "Localidad"};
        cargarTablaComprobante(cargaTablaComprobantes);
        cargarTablaCliente(cargaTablaCliente);
        cargaFormaPago = new String[]{"EFECTIVO", "TRANSFERENCIA", "DEBITO", "CREDITO", "BILLETERA SANTA FE", "QR MERCADOPAGO", "QR MODO"};
        dcHora.setFont(new Font("Roboto", Font.BOLD, 24));
        dcHora.setCalendar(fechaActual);
        cargaFormaPago();
    }

    private void cargaFormaPago() {
        for (String i : cargaFormaPago) {
            cbDlgDescripcionForma.addItem(i);
        }
    }

    private void cargarTablaComprobante(String[] carga) {
        modeloComprobante = (DefaultTableModel) tbFactura.getModel();
        for (int i = 0; i < carga.length; ++i) {
            modeloComprobante.addColumn(carga[i]);
        }
    }

    private void limpiarTabla(DefaultTableModel modelo) {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }
    
    private void ComprobarTabla() {
        if (modeloCliente != null) {
            limpiarTabla(modeloCliente);
        }
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="  acciones de cerrar dialog salir y demas ">
    private void Solonumeros(KeyEvent evt) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean borrar = key == 8;
        boolean supr = key == 127;
        boolean coma = key == 44 && key == 46;
        if (!(numeros || borrar || supr || coma)) {

            Mensaje("<html><b>Solo numeros</b></html>", "Error ingreso de datos", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
    }
    
    private void salir() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?", "Cerrar Sesión", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (respuesta == 0) {
            System.exit(0);
        }
    }
    
    private void limpiarCampos() {
        txtApellido.setText("");
        txtNombreCliente.setText("");
        txtLocalidad.setText("");
        txtTelefono.setText("");
        txtTotal.setText("");
    }

    private void CerrarDialogo(JDialog dlg) {
        dlg.dispose();
    }

    private void Volver() {
        dispose();
        Menu menu = new Menu();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }

    private void Mensaje(String msg, String titulo, int msgType) {
        JOptionPane.showMessageDialog(null, msg, titulo, msgType);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="  Clientes    ">
    private void AgregarCliente(Cliente cliente) {
        txtNombreCliente.setText(cliente.getNombre());
        txtApellido.setText(cliente.getApellido());
        txtLocalidad.setText(cliente.getLocalidad());
        txtTelefono.setText(cliente.getLocalidad());
    }

    private void clienteDefault() {
        cliente = clienteController.buscarCliente("Consumidor");
    }

    private void BuscarClienteCodigo() {
        long entrada = Long.parseLong(txtBuscarCodigoDialog.getText());
        ComprobarTabla();
        var clientes = clienteController.listarPorCodigo(entrada);
        clientes.forEach(cliente -> modeloCliente.addRow(new Object[]{
            cliente.getId(), cliente.getNombre(), cliente.getApellido(),
            cliente.getTelefono(), cliente.getLocalidad()}));
    }

    private void BuscarClienteNombre() {
        String nombre = txtBuscarNombreDialog.getText();

        ComprobarTabla();
        var clientes = clienteController.listarPorNombre(nombre);

        clientes.forEach(cliente -> modeloCliente.addRow(new Object[]{
            cliente.getId(), cliente.getNombre(), cliente.getApellido(),
            cliente.getTelefono(), cliente.getLocalidad()}));
    }

    private void BuscarClienteTelefono() {
        String entrada = txtBuscarTelefonoDialog.getText();
        ComprobarTabla();
        var clientes = clienteController.listarPorTelefono(entrada);

        clientes.forEach(cliente -> modeloCliente.addRow(new Object[]{
            cliente.getId(), cliente.getNombre(), cliente.getApellido(),
            cliente.getTelefono(), cliente.getLocalidad()}));
    }
    
    private void ComprobarCliente() {
        if (cliente.getNombre() == null) {
            Mensaje("No hay un Cliente seleccionado", "<html><b>¡Faltan datos!</b></html>", JOptionPane.ERROR_MESSAGE);
        } else {
            dlgDescripcion.setLocationRelativeTo(null);
            dlgDescripcion.setVisible(true);
        }
    }

    private void BuscarCliente() {
        cliente = new Cliente(Long.valueOf(modeloCliente.getValueAt(tbClienteDialog.getSelectedRow(), 0).toString()),
                modeloCliente.getValueAt(tbClienteDialog.getSelectedRow(), 1).toString(),
                modeloCliente.getValueAt(tbClienteDialog.getSelectedRow(), 2).toString(),
                modeloCliente.getValueAt(tbClienteDialog.getSelectedRow(), 3).toString(),
                modeloCliente.getValueAt(tbClienteDialog.getSelectedRow(), 4).toString());

        AgregarCliente(cliente);
        txtDlgDescripcionCliente.setText(cliente.getApellido() + ", " + cliente.getNombre());
    }

    private void cargarTablaCliente(String[] carga) {
        modeloCliente = (DefaultTableModel) tbClienteDialog.getModel();
        for (int i = 0; i < carga.length; ++i) {
            modeloCliente.addColumn(carga[i]);
        }
    }        
    //</editor-fold>    

    private void AgregarDescripcion() {

        if (txtDlgDescripcionImporte.getText().isEmpty()) {
            Mensaje("Ingrese un importe", "<html><b>¡Faltan datos!</b></html>", JOptionPane.ERROR_MESSAGE);
        } else {
            String concepto = txtAreaDescripcion.getText();
            int importe = Integer.parseInt(txtDlgDescripcionImporte.getText());
            String formaPago = cbDlgDescripcionForma.getSelectedItem().toString();
            Date fecha = new Date(dcHora.getDate().getTime());
            modeloComprobante.addRow(new Object[]{fecha, concepto, formaPago, importe});
            CerrarDialogo(dlgDescripcion);
            btnAgregarDescripcion.setEnabled(false);
            txtAreaDescripcion.setText("");
            txtDlgDescripcionCliente.setText("");
            txtDlgDescripcionImporte.setText("");
        }
    } 
    
    private void Cobrar() {
       
        Date fecha = (Date) tbFactura.getValueAt(0, 0);
        float importe =  Float.parseFloat(tbFactura.getValueAt(0, 3).toString());
        String formaPago = tbFactura.getValueAt(0, 2).toString();
        String concepto = tbFactura.getValueAt(0, 1).toString();
                
        int respuesta = JOptionPane.showConfirmDialog(null,"¿Agregar Nota de Credito a: "+cliente.getNombre()+", "+cliente.getApellido()+" por un importe de $ "+importe+"?"
        , "<html><b>¡Crear Nota de Credito!</b></html>", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE );
        
        if (respuesta == 0){
            limpiarTabla(modeloComprobante);
            limpiarCampos();
            comprobante = new Comprobantes(fecha, cliente.getId(), concepto, formaPago, importe);
            long numero = comprobanteController.CrearComprobante(comprobante);
            Mensaje("¡Nota de Credito N° "+comprobante.getnComprobante()+"creada! o "+numero,"¡Operación Exitosa!",JOptionPane.INFORMATION_MESSAGE);
            btnAgregarDescripcion.setEnabled(true);
        }        
    }
      

    //<editor-fold defaultstate="collapsed" desc="  Variables No Modificar  ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor1;
    private javax.swing.JPanel ContenedorComprobante1;
    private javax.swing.JLabel Datos1;
    private javax.swing.JPanel Encabezado1;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel TituloDialog;
    public javax.swing.JButton btnAgregarClienteCancelar;
    public javax.swing.JButton btnAgregarClienteDialog;
    private javax.swing.JButton btnAgregarDescripcion;
    private javax.swing.JButton btnBuscarCliente;
    public javax.swing.JButton btnBuscarCodigoDialog;
    public javax.swing.JButton btnBuscarNombreDialog;
    public javax.swing.JButton btnBuscarTelefonoDialog;
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnDlgDescripcionAceptar;
    private javax.swing.JButton btnDlgDescripcionCancelar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbDlgDescripcionForma;
    private com.toedter.calendar.JDateChooser dcHora;
    private javax.swing.JDialog dlgClientes;
    private javax.swing.JDialog dlgDescripcion;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblCliente4;
    private javax.swing.JLabel lblCliente5;
    private javax.swing.JLabel lblCliente6;
    private javax.swing.JLabel lblCodigoDialog;
    private javax.swing.JLabel lblDlgDescripcion;
    private javax.swing.JLabel lblDlgDescripcionDescripcion;
    private javax.swing.JLabel lblDlgDescripcionForma;
    private javax.swing.JLabel lblDlgDescripcionImporte;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNombreDialog;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblTelefonoDialog;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JPanel panelFondo1;
    private javax.swing.JPanel pnPrincipal1;
    private javax.swing.JTable tbClienteDialog;
    private javax.swing.JTable tbFactura;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextArea txtAreaDescripcion;
    private javax.swing.JTextField txtBuscarCodigoDialog;
    private javax.swing.JTextField txtBuscarNombreDialog;
    private javax.swing.JTextField txtBuscarTelefonoDialog;
    private javax.swing.JTextField txtDlgDescripcionCliente;
    private javax.swing.JTextField txtDlgDescripcionImporte;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>  

}
