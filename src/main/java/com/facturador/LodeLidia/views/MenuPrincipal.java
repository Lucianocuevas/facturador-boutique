package com.facturador.LodeLidia.views;

    //<editor-fold defaultstate="collapsed" desc="  Importaciones   ">
import com.facturador.LodeLidia.controller.CategoriaController;
import com.facturador.LodeLidia.controller.ClienteController;
import com.facturador.LodeLidia.controller.DetalleFacturaController;
import com.facturador.LodeLidia.controller.FacturaController;
import com.facturador.LodeLidia.controller.ProductoController;
import com.facturador.LodeLidia.modelo.Categoria;
import com.facturador.LodeLidia.modelo.Cliente;
import com.facturador.LodeLidia.modelo.Factura;
import com.facturador.LodeLidia.modelo.DetalleFactura;
import com.facturador.LodeLidia.modelo.Productos;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//</editor-fold>

public class MenuPrincipal extends javax.swing.JFrame {

    //<editor-fold defaultstate="collapsed" desc="variables">
    int xMouse, yMouse;
    private DefaultTableModel modeloCliente;
    private DefaultTableModel modeloClienteCuentas;
    private DefaultTableModel modeloFactura;
    private DefaultTableModel modeloProductos;
    private ClienteController clienteController;
    private ProductoController productoController;
    private FacturaController facturaController;
    private DetalleFacturaController detalleController;
    private Factura factura;
    private DetalleFactura detalle;
    private Cliente cliente;
    private Productos producto;
    private Categoria categoria;
    private CategoriaController categoriaController;
    private String[] cargaTablaFactura, cargaTablaCliente, cargaTablaProductos, cargaTablaClienteCuentas, cargaFormaPago;
    private float total;
    private int filaModificada;
    private List<DetalleFactura> items;
    Calendar fechaActual = new GregorianCalendar();
//</editor-fold>

    public MenuPrincipal() {
        initComponents();
        cargaTablas();
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
        lblLocalidadDialog = new javax.swing.JLabel();
        lblTelefonoDialog = new javax.swing.JLabel();
        txtBuscarTelefonoDialog = new javax.swing.JTextField();
        txtBuscarLocalidadDialog = new javax.swing.JTextField();
        btnBuscarLocalidadDialog = new javax.swing.JButton();
        btnBuscarTelefonoDialog = new javax.swing.JButton();
        btnAgregarClienteDialog = new javax.swing.JButton();
        btnAgregarClienteCancelar = new javax.swing.JButton();
        TituloDialog = new javax.swing.JLabel();
        dlgNuevoProductoRapido = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        cbCategoriaNuevoProducto = new javax.swing.JComboBox<>();
        lblDescripcionNuevoProducto = new javax.swing.JLabel();
        lblPrecioNuevoProducto = new javax.swing.JLabel();
        lblCategoriaNuevoProducto = new javax.swing.JLabel();
        txtDescripcionNuevoProducto = new javax.swing.JTextField();
        txtPrecioNuevoProducto = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        lblCantidadNuevoProducto = new javax.swing.JLabel();
        spCantidad = new javax.swing.JSpinner();
        btnCrearProductoNuevoProducto = new javax.swing.JButton();
        btnCrearProductoNuevoCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        dlgListaProductos = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        txtDlgListaProductosBuscarP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btndlgListaProductosBuscarP = new javax.swing.JButton();
        spDlgListaProductosCantidad = new javax.swing.JSpinner();
        lblCantidad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDlgListaProducto = new javax.swing.JTable();
        btnDlgAgregarP = new javax.swing.JButton();
        btnDlgAgregarProductoCancelar = new javax.swing.JButton();
        dlgCobrar = new javax.swing.JDialog();
        lblDlgCobrarCambio = new javax.swing.JPanel();
        btnDlgEmitirComprobante = new javax.swing.JButton();
        btnDlgCancelarCobro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblModoPago = new javax.swing.JLabel();
        cbDlgModoPago = new javax.swing.JComboBox<>();
        lblImporte = new javax.swing.JLabel();
        txtDlgCobrarCliente = new javax.swing.JTextField();
        txtDlgCobrarImporte = new javax.swing.JTextField();
        lblDialogCobrarCliente = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbDialogCobrarContado = new javax.swing.JRadioButton();
        rbDialogCobrarCC = new javax.swing.JRadioButton();
        dlgModificarCantidad = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        dlgModificarCantidadOk = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        spdlgModificarCantidadCantidad = new javax.swing.JSpinner();
        rbgCondVenta = new javax.swing.ButtonGroup();
        Contenedor = new javax.swing.JPanel();
        panelFondo = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        lblAtras = new javax.swing.JLabel();
        pnPrincipal = new javax.swing.JPanel();
        Encabezado = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        lblCliente2 = new javax.swing.JLabel();
        lblCliente3 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        txtLocalidad = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        lblCliente1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dcHora = new com.toedter.calendar.JDateChooser();
        ContenedorComprobante = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbFactura = new javax.swing.JTable();
        btnAgregarProductos = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        Datos = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnCobrar = new javax.swing.JButton();
        btnEditarCantidad = new javax.swing.JButton();

        dlgClientes.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dlgClientes.setModal(true);
        dlgClientes.setUndecorated(true);
        dlgClientes.setResizable(false);
        dlgClientes.setSize(new java.awt.Dimension(855, 565));

        jScrollPane4.setViewportView(tbClienteDialog);

        lblNombreDialog.setText("Nombre");

        lblCodigoDialog.setText("Codigo");

        btnBuscarNombreDialog.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\search.png")); // NOI18N
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

        btnBuscarCodigoDialog.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\search.png")); // NOI18N
        btnBuscarCodigoDialog.setText("Buscar Por Codigo");

        lblLocalidadDialog.setText("Localidad");

        lblTelefonoDialog.setText("Telefono");

        btnBuscarLocalidadDialog.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\search.png")); // NOI18N
        btnBuscarLocalidadDialog.setText("Buscar Por Localidad");

        btnBuscarTelefonoDialog.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\search.png")); // NOI18N
        btnBuscarTelefonoDialog.setText("Buscar Por Telefono");

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
                .addGap(117, 117, 117)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAgregarClienteDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarClienteCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNombreDialog)
                                            .addComponent(lblLocalidadDialog))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBuscarCodigoDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBuscarNombreDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBuscarTelefonoDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBuscarLocalidadDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblCodigoDialog))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(lblTelefonoDialog)
                                .addGap(361, 361, 361)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarTelefonoDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnBuscarCodigoDialog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscarLocalidadDialog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                .addComponent(btnBuscarNombreDialog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(302, 302, 302))
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
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarLocalidadDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocalidadDialog)
                    .addComponent(btnBuscarLocalidadDialog))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarClienteDialog, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btnAgregarClienteCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
            .addComponent(TituloDialog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgClientesLayout.setVerticalGroup(
            dlgClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgClientesLayout.createSequentialGroup()
                .addComponent(TituloDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dlgClientes.getAccessibleContext().setAccessibleParent(this);

        dlgNuevoProductoRapido.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dlgNuevoProductoRapido.setTitle("Nuevo Producto Rapido");
        dlgNuevoProductoRapido.setLocation(getLocation());
        dlgNuevoProductoRapido.setModal(true);
        dlgNuevoProductoRapido.setPreferredSize(new java.awt.Dimension(423, 295));
        dlgNuevoProductoRapido.setSize(new java.awt.Dimension(423, 295));

        lblDescripcionNuevoProducto.setText("Descripcion");

        lblPrecioNuevoProducto.setText("Precio");

        lblCategoriaNuevoProducto.setText("Categoria");

        txtPrecioNuevoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioNuevoProductoKeyTyped(evt);
            }
        });

        lblCantidadNuevoProducto.setText("Cantidad");

        spCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        btnCrearProductoNuevoProducto.setBackground(new java.awt.Color(0, 153, 0));
        btnCrearProductoNuevoProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCrearProductoNuevoProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearProductoNuevoProducto.setText("Crear Producto");
        btnCrearProductoNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProductoNuevoProductoActionPerformed(evt);
            }
        });

        btnCrearProductoNuevoCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btnCrearProductoNuevoCancelar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCrearProductoNuevoCancelar.setText("Cancelar");
        btnCrearProductoNuevoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProductoNuevoCancelarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nuevo Producto Rápido");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnCrearProductoNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearProductoNuevoCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategoriaNuevoProducto)
                            .addComponent(lblDescripcionNuevoProducto)
                            .addComponent(lblPrecioNuevoProducto)
                            .addComponent(lblCantidadNuevoProducto))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCategoriaNuevoProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spCantidad)
                            .addComponent(txtPrecioNuevoProducto)
                            .addComponent(txtDescripcionNuevoProducto))))
                .addGap(45, 45, 45)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescripcionNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescripcionNuevoProducto))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecioNuevoProducto))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCantidadNuevoProducto))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCategoriaNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoriaNuevoProducto))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCrearProductoNuevoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(btnCrearProductoNuevoCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28))))
        );

        javax.swing.GroupLayout dlgNuevoProductoRapidoLayout = new javax.swing.GroupLayout(dlgNuevoProductoRapido.getContentPane());
        dlgNuevoProductoRapido.getContentPane().setLayout(dlgNuevoProductoRapidoLayout);
        dlgNuevoProductoRapidoLayout.setHorizontalGroup(
            dlgNuevoProductoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dlgNuevoProductoRapidoLayout.setVerticalGroup(
            dlgNuevoProductoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dlgNuevoProductoRapido.getAccessibleContext().setAccessibleParent(this);

        dlgListaProductos.setModal(true);
        dlgListaProductos.setUndecorated(true);
        dlgListaProductos.setSize(new java.awt.Dimension(660, 568));

        jPanel1.setMaximumSize(new java.awt.Dimension(660, 568));
        jPanel1.setMinimumSize(new java.awt.Dimension(660, 568));

        jLabel1.setText("Producto");

        btndlgListaProductosBuscarP.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\search.png")); // NOI18N
        btndlgListaProductosBuscarP.setText("Buscar Producto");
        btndlgListaProductosBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndlgListaProductosBuscarPActionPerformed(evt);
            }
        });

        spDlgListaProductosCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spDlgListaProductosCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCantidad.setText("Cantidad");

        tbDlgListaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbDlgListaProducto);

        btnDlgAgregarP.setBackground(new java.awt.Color(0, 153, 0));
        btnDlgAgregarP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDlgAgregarP.setForeground(new java.awt.Color(255, 255, 255));
        btnDlgAgregarP.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\add_Producto.png")); // NOI18N
        btnDlgAgregarP.setText("Agregar Artículo");
        btnDlgAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgAgregarPActionPerformed(evt);
            }
        });

        btnDlgAgregarProductoCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btnDlgAgregarProductoCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDlgAgregarProductoCancelar.setText("Cancelar");
        btnDlgAgregarProductoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgAgregarProductoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtDlgListaProductosBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btndlgListaProductosBuscarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCantidad)
                        .addGap(18, 18, 18)
                        .addComponent(spDlgListaProductosCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDlgAgregarP)
                        .addGap(18, 18, 18)
                        .addComponent(btnDlgAgregarProductoCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDlgListaProductosBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btndlgListaProductosBuscarP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spDlgListaProductosCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidad)
                    .addComponent(btnDlgAgregarP)
                    .addComponent(btnDlgAgregarProductoCancelar))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dlgListaProductosLayout = new javax.swing.GroupLayout(dlgListaProductos.getContentPane());
        dlgListaProductos.getContentPane().setLayout(dlgListaProductosLayout);
        dlgListaProductosLayout.setHorizontalGroup(
            dlgListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dlgListaProductosLayout.setVerticalGroup(
            dlgListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        dlgCobrar.setMaximumSize(new java.awt.Dimension(521, 352));
        dlgCobrar.setMinimumSize(new java.awt.Dimension(521, 352));
        dlgCobrar.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        dlgCobrar.setUndecorated(true);
        dlgCobrar.setSize(new java.awt.Dimension(602, 338));

        lblDlgCobrarCambio.setMaximumSize(new java.awt.Dimension(521, 372));
        lblDlgCobrarCambio.setMinimumSize(new java.awt.Dimension(521, 372));

        btnDlgEmitirComprobante.setBackground(new java.awt.Color(0, 153, 0));
        btnDlgEmitirComprobante.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnDlgEmitirComprobante.setForeground(new java.awt.Color(255, 255, 255));
        btnDlgEmitirComprobante.setText("Emitir Comprobante");
        btnDlgEmitirComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgEmitirComprobanteActionPerformed(evt);
            }
        });

        btnDlgCancelarCobro.setBackground(new java.awt.Color(204, 0, 0));
        btnDlgCancelarCobro.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnDlgCancelarCobro.setText("Cancelar");
        btnDlgCancelarCobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgCancelarCobroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Condición de Venta");

        lblModoPago.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblModoPago.setText("Modo de Pago");

        lblImporte.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblImporte.setText("Importe");

        txtDlgCobrarCliente.setEditable(false);
        txtDlgCobrarCliente.setBackground(new java.awt.Color(0, 0, 0));
        txtDlgCobrarCliente.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        txtDlgCobrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtDlgCobrarCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtDlgCobrarImporte.setEditable(false);
        txtDlgCobrarImporte.setBackground(new java.awt.Color(0, 0, 0));
        txtDlgCobrarImporte.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        txtDlgCobrarImporte.setForeground(new java.awt.Color(0, 217, 0));
        txtDlgCobrarImporte.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblDialogCobrarCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblDialogCobrarCliente.setText("Cliente");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rbgCondVenta.add(rbDialogCobrarContado);
        rbDialogCobrarContado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        rbDialogCobrarContado.setText("Contado");
        rbDialogCobrarContado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDialogCobrarContadoActionPerformed(evt);
            }
        });

        rbgCondVenta.add(rbDialogCobrarCC);
        rbDialogCobrarCC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        rbDialogCobrarCC.setText("Cuenta Corriente");
        rbDialogCobrarCC.setEnabled(false);
        rbDialogCobrarCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDialogCobrarCCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbDialogCobrarContado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(rbDialogCobrarCC)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDialogCobrarContado)
                    .addComponent(rbDialogCobrarCC))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout lblDlgCobrarCambioLayout = new javax.swing.GroupLayout(lblDlgCobrarCambio);
        lblDlgCobrarCambio.setLayout(lblDlgCobrarCambioLayout);
        lblDlgCobrarCambioLayout.setHorizontalGroup(
            lblDlgCobrarCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblDlgCobrarCambioLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(lblDlgCobrarCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblDlgCobrarCambioLayout.createSequentialGroup()
                        .addGroup(lblDlgCobrarCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblModoPago)
                            .addGroup(lblDlgCobrarCambioLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(lblDlgCobrarCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblImporte)
                                    .addComponent(lblDialogCobrarCliente))))
                        .addGap(12, 12, 12)
                        .addGroup(lblDlgCobrarCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lblDlgCobrarCambioLayout.createSequentialGroup()
                                .addGroup(lblDlgCobrarCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(lblDlgCobrarCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cbDlgModoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDlgCobrarImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 68, Short.MAX_VALUE))
                            .addComponent(txtDlgCobrarCliente)))
                    .addGroup(lblDlgCobrarCambioLayout.createSequentialGroup()
                        .addComponent(btnDlgEmitirComprobante)
                        .addGap(42, 42, 42)
                        .addComponent(btnDlgCancelarCobro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        lblDlgCobrarCambioLayout.setVerticalGroup(
            lblDlgCobrarCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblDlgCobrarCambioLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(lblDlgCobrarCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDialogCobrarCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDlgCobrarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblDlgCobrarCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDlgCobrarImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(lblDlgCobrarCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblDlgCobrarCambioLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2))
                    .addGroup(lblDlgCobrarCambioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(lblDlgCobrarCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDlgModoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModoPago))
                .addGap(18, 18, 18)
                .addGroup(lblDlgCobrarCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDlgCancelarCobro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDlgEmitirComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout dlgCobrarLayout = new javax.swing.GroupLayout(dlgCobrar.getContentPane());
        dlgCobrar.getContentPane().setLayout(dlgCobrarLayout);
        dlgCobrarLayout.setHorizontalGroup(
            dlgCobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDlgCobrarCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dlgCobrarLayout.setVerticalGroup(
            dlgCobrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDlgCobrarCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        dlgModificarCantidad.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        dlgModificarCantidad.setUndecorated(true);
        dlgModificarCantidad.setSize(new java.awt.Dimension(239, 161));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Editar Cantidad");

        dlgModificarCantidadOk.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        dlgModificarCantidadOk.setText("Aceptar");
        dlgModificarCantidadOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlgModificarCantidadOkActionPerformed(evt);
            }
        });

        Cancelar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        spdlgModificarCantidadCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout dlgModificarCantidadLayout = new javax.swing.GroupLayout(dlgModificarCantidad.getContentPane());
        dlgModificarCantidad.getContentPane().setLayout(dlgModificarCantidadLayout);
        dlgModificarCantidadLayout.setHorizontalGroup(
            dlgModificarCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgModificarCantidadLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(dlgModificarCantidadOk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(Cancelar)
                .addGap(31, 31, 31))
            .addGroup(dlgModificarCantidadLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(spdlgModificarCantidadCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dlgModificarCantidadLayout.setVerticalGroup(
            dlgModificarCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgModificarCantidadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(spdlgModificarCantidadCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(dlgModificarCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(dlgModificarCantidadOk))
                .addGap(50, 50, 50))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setOpaque(false);

        header.setBackground(new java.awt.Color(204, 255, 255));
        header.setForeground(new java.awt.Color(0, 0, 0));
        header.setOpaque(false);
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
        Titulo.setText("Facturador");

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
                .addGap(18, 18, 18))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSalir)
                        .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAtras)
                        .addComponent(Titulo)))
                .addContainerGap())
        );

        pnPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Encabezado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCliente.setBackground(new java.awt.Color(153, 153, 0));
        lblCliente.setForeground(new java.awt.Color(60, 63, 65));
        lblCliente.setText("Nombre:");
        lblCliente.setOpaque(true);

        lblCliente2.setText("Telefono");

        lblCliente3.setBackground(new java.awt.Color(153, 153, 0));
        lblCliente3.setForeground(new java.awt.Color(60, 63, 65));
        lblCliente3.setText("Apellido:");
        lblCliente3.setOpaque(true);

        txtNombreCliente.setEditable(false);
        txtNombreCliente.setBorder(null);
        txtNombreCliente.setEnabled(false);

        txtTelefono.setEditable(false);
        txtTelefono.setBorder(null);
        txtTelefono.setEnabled(false);

        txtApellido.setBorder(null);
        txtApellido.setEnabled(false);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setText("Localidad");
        jTextField1.setBorder(null);
        jTextField1.setEnabled(false);

        txtLocalidad.setEditable(false);
        txtLocalidad.setBorder(null);
        txtLocalidad.setEnabled(false);

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\search.png")); // NOI18N
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

        lblCliente1.setText("Cambiar Cliente");

        jLabel4.setText("Fecha");

        dcHora.setBackground(new java.awt.Color(0, 255, 255));
        dcHora.setForeground(new java.awt.Color(51, 51, 51));
        dcHora.setDateFormatString("dd/MM/yyyy");
        dcHora.setEnabled(false);

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreCliente)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addComponent(lblCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                        .addComponent(lblCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnBuscarCliente))
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel4)
                        .addGap(77, 77, 77)
                        .addComponent(dcHora, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dcHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnPrincipal.add(Encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 890, 80));

        ContenedorComprobante.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
        jScrollPane3.setViewportView(tbFactura);

        btnAgregarProductos.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\add_Producto.png")); // NOI18N
        btnAgregarProductos.setText("Agregar Productos");
        btnAgregarProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarProductosMouseClicked(evt);
            }
        });
        btnAgregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductosActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\nuevo_Producto.png")); // NOI18N
        btnNuevo.setText("Nuevo Producto");
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\round_remove_white_18dp.png")); // NOI18N
        btnEliminar.setText("Eliminar Producto");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        Datos.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Datos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Datos.setText("Datos del comprobante");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(0, 0, 0));
        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(51, 204, 0));
        txtTotal.setText("$ 0");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTotal.setText("Total");

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\borrar_todo.png")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCobrar.setBackground(new java.awt.Color(204, 0, 0));
        btnCobrar.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        btnCobrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCobrar.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\shopping.png")); // NOI18N
        btnCobrar.setText("Cobrar");
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });

        btnEditarCantidad.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\outline_edit_white_18dp.png")); // NOI18N
        btnEditarCantidad.setText("Editar Cantidad");
        btnEditarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContenedorComprobanteLayout = new javax.swing.GroupLayout(ContenedorComprobante);
        ContenedorComprobante.setLayout(ContenedorComprobanteLayout);
        ContenedorComprobanteLayout.setHorizontalGroup(
            ContenedorComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorComprobanteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenedorComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Datos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContenedorComprobanteLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ContenedorComprobanteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTotal)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ContenedorComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCobrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        ContenedorComprobanteLayout.setVerticalGroup(
            ContenedorComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorComprobanteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContenedorComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContenedorComprobanteLayout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarCantidad)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCobrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ContenedorComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnPrincipal.add(ContenedorComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 890, 410));

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Contenedor.add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Contenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="  Acciones de Botones ">
    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        salir();
    }//GEN-LAST:event_lblSalirMouseClicked

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        click(evt);
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        mover(evt);
    }//GEN-LAST:event_headerMouseDragged

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

    private void btnBuscarNombreDialogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarNombreDialogMouseClicked
        BuscarClienteNombre();
    }//GEN-LAST:event_btnBuscarNombreDialogMouseClicked
    private void btnAgregarClienteDialogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarClienteDialogMouseClicked
        agregarCliente();
    }//GEN-LAST:event_btnAgregarClienteDialogMouseClicked
    private void txtPrecioNuevoProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioNuevoProductoKeyTyped
        Solonumeros(evt);
    }//GEN-LAST:event_txtPrecioNuevoProductoKeyTyped
    
    private void btnAgregarClienteDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteDialogActionPerformed
        agregarCliente();
    }//GEN-LAST:event_btnAgregarClienteDialogActionPerformed

    private void btnBuscarNombreDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNombreDialogActionPerformed

    }//GEN-LAST:event_btnBuscarNombreDialogActionPerformed

    private void btndlgListaProductosBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndlgListaProductosBuscarPActionPerformed
        buscarProducto();
    }//GEN-LAST:event_btndlgListaProductosBuscarPActionPerformed

    private void btnDlgAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgAgregarPActionPerformed
        agregarProducto();
    }//GEN-LAST:event_btnDlgAgregarPActionPerformed

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        emitirComprobante(total, cliente); 
    }//GEN-LAST:event_btnCobrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarTabla(modeloFactura);
        clienteDefault();
        total = 0;
        txtTotal.setText("$ 0");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarProducto();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        dlgNuevoProductoRapido.setLocationRelativeTo(null);
        dlgNuevoProductoRapido.setVisible(true);
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnAgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductosActionPerformed
        dlgListaProductos.setLocationRelativeTo(null);
        dlgListaProductos.setVisible(true);
    }//GEN-LAST:event_btnAgregarProductosActionPerformed

    private void btnAgregarProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductosMouseClicked

    }//GEN-LAST:event_btnAgregarProductosMouseClicked

    private void tbFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFacturaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbFacturaMouseClicked

    private void btnBuscarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseExited
        btnBuscarCliente.setBackground(new Color(78, 80, 82));
    }//GEN-LAST:event_btnBuscarClienteMouseExited

    private void btnBuscarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseEntered
        btnBuscarCliente.setBackground(Color.red);
    }//GEN-LAST:event_btnBuscarClienteMouseEntered

    private void btnBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseClicked
        ModificarCliente();
    }//GEN-LAST:event_btnBuscarClienteMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        dlgNuevoProductoRapido.setLocationRelativeTo(null);
        dlgNuevoProductoRapido.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        ModificarCliente();
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnCrearProductoNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProductoNuevoProductoActionPerformed
        CrearProductoRapido();
    }//GEN-LAST:event_btnCrearProductoNuevoProductoActionPerformed

    private void btnEditarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCantidadActionPerformed
        EditarCantidad();
    }//GEN-LAST:event_btnEditarCantidadActionPerformed

    private void btnDlgCancelarCobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgCancelarCobroActionPerformed
        CerrarDialogo(dlgCobrar);
    }//GEN-LAST:event_btnDlgCancelarCobroActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        CancelarModificarCantidad();
    }//GEN-LAST:event_CancelarActionPerformed

    private void dlgModificarCantidadOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlgModificarCantidadOkActionPerformed
        ModificarCantidad();
    }//GEN-LAST:event_dlgModificarCantidadOkActionPerformed

    private void btnDlgEmitirComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgEmitirComprobanteActionPerformed
        Cobrar();
        limpiarTabla(modeloFactura);
        clienteDefault();
        total = 0;
        txtTotal.setText("$ 0");
        CerrarDialogo(dlgCobrar);
    }//GEN-LAST:event_btnDlgEmitirComprobanteActionPerformed

    private void rbDialogCobrarContadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDialogCobrarContadoActionPerformed
        HabilitarModoPago(true);
    }//GEN-LAST:event_rbDialogCobrarContadoActionPerformed

    private void rbDialogCobrarCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDialogCobrarCCActionPerformed
        HabilitarModoPago(false);
    }//GEN-LAST:event_rbDialogCobrarCCActionPerformed

    private void btnCrearProductoNuevoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProductoNuevoCancelarActionPerformed
        CerrarDialogo(dlgNuevoProductoRapido);
    }//GEN-LAST:event_btnCrearProductoNuevoCancelarActionPerformed

    private void btnAgregarClienteCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteCancelarActionPerformed
        CerrarDialogo(dlgClientes);
    }//GEN-LAST:event_btnAgregarClienteCancelarActionPerformed

    private void btnDlgAgregarProductoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgAgregarProductoCancelarActionPerformed
        CerrarDialogo(dlgListaProductos);
    }//GEN-LAST:event_btnDlgAgregarProductoCancelarActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void lblAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseEntered
        lblAtras.setForeground(Color.green);
    }//GEN-LAST:event_lblAtrasMouseEntered

    private void lblAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseExited
        lblAtras.setForeground(new Color(187, 187, 187));
    }//GEN-LAST:event_lblAtrasMouseExited

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
        Volver();
    }//GEN-LAST:event_lblAtrasMouseClicked
    //</editor-fold>
            
    public static void main(String args[]) {
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);

            }
        });
    }
    
    //<editor-fold defaultstate="collapsed" desc="Mover panel">>
    protected void mover(MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }

    private void click(MouseEvent evt) {
        xMouse = evt.getX();
        yMouse = evt.getY();
    }
    
    private void salir() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?", "Cerrar Sesión", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (respuesta == 0) {
            System.exit(0);
        }
    } 
    //</editor-fold>

    //<editor-fold defaultstate="collapse" desc="   Variables no modificar  ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JPanel ContenedorComprobante;
    private javax.swing.JLabel Datos;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel TituloDialog;
    private javax.swing.JButton btnAgregarClienteCancelar;
    private javax.swing.JButton btnAgregarClienteDialog;
    private javax.swing.JButton btnAgregarProductos;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarCodigoDialog;
    private javax.swing.JButton btnBuscarLocalidadDialog;
    private javax.swing.JButton btnBuscarNombreDialog;
    private javax.swing.JButton btnBuscarTelefonoDialog;
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnCrearProductoNuevoCancelar;
    private javax.swing.JButton btnCrearProductoNuevoProducto;
    private javax.swing.JButton btnDlgAgregarP;
    private javax.swing.JButton btnDlgAgregarProductoCancelar;
    private javax.swing.JButton btnDlgCancelarCobro;
    private javax.swing.JButton btnDlgEmitirComprobante;
    private javax.swing.JButton btnEditarCantidad;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btndlgListaProductosBuscarP;
    private javax.swing.JComboBox<String> cbCategoriaNuevoProducto;
    private javax.swing.JComboBox<String> cbDlgModoPago;
    private com.toedter.calendar.JDateChooser dcHora;
    private javax.swing.JDialog dlgClientes;
    private javax.swing.JDialog dlgCobrar;
    private javax.swing.JDialog dlgListaProductos;
    private javax.swing.JDialog dlgModificarCantidad;
    private javax.swing.JButton dlgModificarCantidadOk;
    private javax.swing.JDialog dlgNuevoProductoRapido;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCantidadNuevoProducto;
    private javax.swing.JLabel lblCategoriaNuevoProducto;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCliente1;
    private javax.swing.JLabel lblCliente2;
    private javax.swing.JLabel lblCliente3;
    private javax.swing.JLabel lblCodigoDialog;
    private javax.swing.JLabel lblDescripcionNuevoProducto;
    private javax.swing.JLabel lblDialogCobrarCliente;
    private javax.swing.JPanel lblDlgCobrarCambio;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblLocalidadDialog;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblModoPago;
    private javax.swing.JLabel lblNombreDialog;
    private javax.swing.JLabel lblPrecioNuevoProducto;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblTelefonoDialog;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JRadioButton rbDialogCobrarCC;
    private javax.swing.JRadioButton rbDialogCobrarContado;
    private javax.swing.ButtonGroup rbgCondVenta;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JSpinner spDlgListaProductosCantidad;
    private javax.swing.JSpinner spdlgModificarCantidadCantidad;
    private javax.swing.JTable tbClienteDialog;
    private javax.swing.JTable tbDlgListaProducto;
    private javax.swing.JTable tbFactura;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscarCodigoDialog;
    private javax.swing.JTextField txtBuscarLocalidadDialog;
    private javax.swing.JTextField txtBuscarNombreDialog;
    private javax.swing.JTextField txtBuscarTelefonoDialog;
    private javax.swing.JTextField txtDescripcionNuevoProducto;
    private javax.swing.JTextField txtDlgCobrarCliente;
    private javax.swing.JTextField txtDlgCobrarImporte;
    private javax.swing.JTextField txtDlgListaProductosBuscarP;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtPrecioNuevoProducto;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
    
    //<editor-fold defaultstate="collapse" desc="   Creacion de Tablas  ">
    
    private void CerrarDialogo(JDialog dlg) {
        dlg.dispose();
    }
    
    private void Solonumeros(KeyEvent evt) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean borrar = key == 8;
        boolean supr = key == 127;
        boolean coma = key == 44 && key == 46;
        if (!(numeros || borrar || supr || coma)) {
            
            //Mensaje("<html><b>Solo numeros</b></html>", "Error ingreso de datos", ERROR);
            evt.consume();
        }
    }
    
    public void cargaTablas() {
        this.productoController = new ProductoController();
        this.categoriaController = new CategoriaController();
        this.clienteController = new ClienteController();    
        this.facturaController = new FacturaController();
        this.detalleController = new DetalleFacturaController();
        cargaTablaFactura = new String[]{"CODIGO", "CANTIDAD", "DESCRIPCION", "PRECIO UNITARIO", "PRECIO FINAL"};
        cargaTablaProductos = new String[]{"CODIGO", "NOMRE", "CATEGORIA", "PRECIO"};
        cargaTablaCliente = new String[]{"ID", "Nombre", "Apellido", "Telefono", "Localidad"};
        cargaTablaClienteCuentas = new String[]{"ID", "Nombre", "Apellido", "Facturas", "Pagos/Devoluciones", "Saldo"};  
        cargaFormaPago = new String[]{"EFECTIVO","TRANSFERENCIA","DEBITO","CREDITO","BILLETERA SANTA FE","QR MERCADOPAGO","QR MODO"};                       
        cargarTablaFactura(cargaTablaFactura);
        cargarTablaCliente(cargaTablaCliente);
        cargarTablaProductos(cargaTablaProductos);
        var cat = categoriaController.listarCategoria();
        cat.forEach(categoria -> cbCategoriaNuevoProducto.addItem(categoria.getNombre()));   
        clienteDefault();
        setearCliente(clienteController.buscarCliente("Consumidor"));
        dcHora.setCalendar(fechaActual);
        for (String i : cargaFormaPago){
                cbDlgModoPago.addItem(i);
            }
        
    }
    
    private void limpiarTabla(DefaultTableModel modelo) {
        while(modelo.getRowCount() > 0){
            modelo.removeRow(0);
        }
    }

    private void cargarTablaProductos(String[] carga) {
        modeloProductos = (DefaultTableModel) tbDlgListaProducto.getModel();
        for (int i = 0; i < carga.length; ++i) {
            modeloProductos.addColumn(carga[i]);
        }
    }

    private void cargarTablaCliente(String[] carga) {
        modeloCliente = (DefaultTableModel) tbClienteDialog.getModel();
        for (int i = 0; i < carga.length; ++i) {
            modeloCliente.addColumn(carga[i]);
        }
    }
    
    private void cargarTablaFactura(String[] carga) {
        modeloFactura = (DefaultTableModel) tbFactura.getModel();
        for (int i = 0; i < carga.length; i++) {
            modeloFactura.addColumn(carga[i]);
        }
    }

    private void Mensaje(String msg, String titulo, int msgType) {
        JOptionPane.showMessageDialog(null, msg, titulo, msgType);
    }
    
    private boolean filaSeleccionada() {
        return tbFactura.getSelectedRowCount() == 0 || tbFactura.getSelectedColumnCount() == 0;
    }
    
    //</editor-fold>

    //<editor-fold defaultstate="collapse" desc="  ABM Clientes  ">
    public void agregarCliente() {
        Cliente clienteElegido = new Cliente(Long.valueOf(modeloCliente.getValueAt(tbClienteDialog.getSelectedRow(), 0).toString()),
                modeloCliente.getValueAt(tbClienteDialog.getSelectedRow(), 1).toString(),
                modeloCliente.getValueAt(tbClienteDialog.getSelectedRow(), 2).toString(),
                modeloCliente.getValueAt(tbClienteDialog.getSelectedRow(), 3).toString(),
                modeloCliente.getValueAt(tbClienteDialog.getSelectedRow(), 4).toString());

        String nombreCompleto = clienteElegido.getNombre() + " " + clienteElegido.getApellido();

        setearCliente(clienteElegido);
        dlgClientes.dispose();
    }

    public void setearCliente(Cliente c) {
        cliente = new Cliente(c);
        txtNombreCliente.setText(cliente.getNombre());
        txtApellido.setText(cliente.getApellido());
        txtTelefono.setText(cliente.getTelefono());
        txtLocalidad.setText(cliente.getLocalidad());

        modeloCliente.addRow(new Object[]{cliente.getId(), cliente.getNombre(),
            cliente.getApellido(), cliente.getTelefono(), cliente.getLocalidad()});
    }
    
    private void clienteDefault() {
        cliente = clienteController.buscarCliente("Consumidor");
    }
    
    private void ModificarCliente() {
        if (modeloCliente != null) {
            limpiarTabla(modeloCliente);
        }
        dlgClientes.setLocationRelativeTo(null);
        dlgClientes.setVisible(true);
    }
        
    private void BuscarClienteNombre() {
        String nombre = txtBuscarNombreDialog.getText().toString();
        
        if (modeloCliente != null) {
            limpiarTabla(modeloCliente);
        }
        var clientes = clienteController.listarPorNombre(nombre);
        
        clientes.forEach(cliente -> modeloCliente.addRow(new Object[]{
            cliente.getId(), cliente.getNombre(), cliente.getApellido(),
            cliente.getTelefono(), cliente.getLocalidad()}));
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="  ABM Productos   ">
    public void CrearProductoRapido() {  
        Integer cantidad = (Integer) spCantidad.getValue();
        if (txtDescripcionNuevoProducto.getText().isEmpty()) {
            Mensaje("Por favor ingrese una descripción", "¡Faltan Datos!", JOptionPane.ERROR_MESSAGE);
        } else if (txtPrecioNuevoProducto.getText().isEmpty()) {
            Mensaje("Por favor ingrese un precio", "¡Faltan Datos!", JOptionPane.ERROR_MESSAGE);
        } else if (!(txtDescripcionNuevoProducto.getText().isEmpty() && txtPrecioNuevoProducto.getText().isEmpty())) {
            String nombre = txtDescripcionNuevoProducto.getText();
            float precio = Float.valueOf(txtPrecioNuevoProducto.getText());
            float total = precio * (float) cantidad;
            categoria = categoriaController.buscarCategoria(cbCategoriaNuevoProducto.getSelectedItem().toString());
            producto = new Productos(nombre, precio, categoria);
            Long codigo = productoController.registrarProducto(producto);
            modeloFactura.addRow(new Object[]{String.valueOf(codigo),String.valueOf(cantidad), nombre, String.valueOf(precio),
                String.valueOf(total)});
            dlgNuevoProductoRapido.dispose();
            sumarTotal(total);
        }
    }

    private void buscarProducto() {
        String buscar = txtDlgListaProductosBuscarP.getText();
        var productos = productoController.listarProductos(buscar);
        productos.forEach(producto -> modeloProductos.addRow(new Object[]{
            producto.getCodigo(), producto.getNombre(), producto.getCategoria().getNombre(), producto.getPrecio()}));
    }

    private void agregarProducto() {
        Productos producto = new Productos(
                Long.valueOf(modeloProductos.getValueAt(tbDlgListaProducto.getSelectedRow(), 0).toString()),
                modeloProductos.getValueAt(tbDlgListaProducto.getSelectedRow(), 1).toString(),
                Float.valueOf(modeloProductos.getValueAt(tbDlgListaProducto.getSelectedRow(), 3).toString()));

        int cantidad = Integer.valueOf(spDlgListaProductosCantidad.getValue().toString());
        float total = producto.getPrecio() * (float) cantidad;

        modeloFactura.addRow(new Object[]{producto.getCodigo(), cantidad, producto.getNombre(), producto.getPrecio(), total});
        //productosElegidos = new List<Productos>();
        sumarTotal(total);
        dlgListaProductos.dispose();
        limpiarTabla(modeloProductos);
        spDlgListaProductosCantidad.setValue(1);
    }

    private void sumarTotal(float sumar) {
        total = total + sumar;
        txtTotal.setText("$" + total);
    }

    private void eliminarProducto() {
        if (filaSeleccionada()) {
            Mensaje("Elegir un producto para eliminar", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            float total = -Float.valueOf(modeloFactura.getValueAt(tbFactura.getSelectedRow(), 4).toString());
            sumarTotal(total);
            modeloFactura.removeRow(tbFactura.getSelectedRow());
        }
    }
    //</editor-fold>     
    
    

    private void EditarCantidad() {
        if (filaSeleccionada()) {
            Mensaje("Elegir un producto para modificar", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        }
        filaModificada = tbFactura.getSelectedRowCount();
        dlgModificarCantidad.setLocationRelativeTo(null);
        dlgModificarCantidad.setVisible(true);
    }

    private void CancelarModificarCantidad() {
        dlgModificarCantidad.dispose();
    }

    private void ModificarCantidad() {
        int Cantidad = Integer.valueOf(spdlgModificarCantidadCantidad.getValue().toString());
        modeloFactura.setValueAt(Cantidad, filaModificada, 1);
    }
    
    private void emitirComprobante(float total, Cliente clienteElegido) {
        if (total == 0) {
            Mensaje("No hay nada para facturar", "¡Faltan datos!", JOptionPane.INFORMATION_MESSAGE);
        } else {   
                       
            txtDlgCobrarCliente.setText(clienteElegido.getApellido() + ", " + clienteElegido.getNombre());
            if(clienteElegido.getId() == 831){                
                rbDialogCobrarContado.setSelected(true);
                rbDialogCobrarCC.setEnabled(false);     
                                
            }
            else  {
                rbDialogCobrarCC.setEnabled(true);
                rbDialogCobrarCC.setSelected(true);  
                HabilitarModoPago(false);
            }   
            
            txtDlgCobrarImporte.setText("$ " + total);
            dlgCobrar.setLocationRelativeTo(null);
            dlgCobrar.setVisible(true);           
        }
    }

    private void Cobrar() {
        items = new ArrayList<>();
        String condicionVenta;
        
        if(rbDialogCobrarCC.isSelected()){
            condicionVenta = "CUENTA CORRIENTE";
            Mensaje(condicionVenta, condicionVenta, WIDTH);
        }else{
            condicionVenta = "CONTADO";
            Mensaje(condicionVenta, condicionVenta, WIDTH);
        }
        Date fechaFactura = new Date(dcHora.getDate().getTime());
        factura = new Factura(fechaFactura, cliente, condicionVenta, cbDlgModoPago.getSelectedItem().toString(), total);
        long idFactura =  facturaController.crearFactura(factura);
        for (int i = 0; i < tbFactura.getRowCount(); i++) {
            items.add(new DetalleFactura(idFactura, Long.parseLong(tbFactura.getValueAt(i, 0).toString()), 
                    Integer.parseInt(tbFactura.getValueAt(i, 1).toString()),
                Float.parseFloat(tbFactura.getValueAt(i, 3).toString())));
        }      
        items.forEach(items -> System.out.println(items.getCodigoProducto()+" "+items.getCantidad()+" "+ items.getPrecio()));
        detalleController.CrearDetalle(items);
        CerrarDialogo(dlgCobrar);
        clienteDefault();
    }

    private void HabilitarModoPago(boolean b) {
        cbDlgModoPago.setEnabled(b);     
    }

    private void Volver() {
        dispose();
        Menu menu = new Menu();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }  
    
}
