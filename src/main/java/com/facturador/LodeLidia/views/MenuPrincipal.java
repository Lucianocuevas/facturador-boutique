package com.facturador.LodeLidia.views;

import com.facturador.LodeLidia.controller.CategoriaController;
import com.facturador.LodeLidia.controller.ClienteController;
import com.facturador.LodeLidia.controller.ProductoController;
import com.facturador.LodeLidia.modelo.Categoria;
import com.facturador.LodeLidia.modelo.Cliente;
import com.facturador.LodeLidia.modelo.Productos;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MenuPrincipal extends javax.swing.JFrame {

    int xMouse, yMouse;
    private DefaultTableModel modeloCliente;
    private DefaultTableModel modeloFactura;
    private DefaultTableModel modeloProductos;
    private ClienteController clienteController;
    private ProductoController productoController;
    private Cliente cliente;
    private Productos producto;
    private Categoria categoria;
    private CategoriaController categoriaController;
    private String[] cargaTablaFactura, cargaTablaCliente, cargaTablaProductos;
    private float total;

    public MenuPrincipal() {
        initComponents();
        this.productoController = new ProductoController();
        this.categoriaController = new CategoriaController();
        this.clienteController = new ClienteController();
        cargaTablaFactura = new String[]{"CANTIDAD", "DESCRIPCION", "PRECIO UNITARIO", "PRECIO FINAL"};
        cargaTablaProductos = new String[] {"CODIGO","NOMRE","CATEGORIA","PRECIO"};
        cargaTablaCliente = new String[]{"ID","Nombre","Apellido","Telefono","Localidad"};        
        cargarTablaFactura(cargaTablaFactura); 
        cargarTablaCliente(cargaTablaCliente);
        cargarTablaProductos(cargaTablaProductos);
        var cat = categoriaController.listarCategoria();
        cat.forEach(categoria -> cbCategoriaNuevoProducto.addItem(categoria.getNombre()));       
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
        dlgListaProductos = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        txtDialogBuscarP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btndlgBuscarP = new javax.swing.JButton();
        spDlgCantidad = new javax.swing.JSpinner();
        lblCantidad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDlgListaProducto = new javax.swing.JTable();
        btnDlgAgregarP = new javax.swing.JButton();
        rbgCondiciones = new javax.swing.ButtonGroup();
        pnPrincipal = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        Side = new javax.swing.JPanel();
        btnFactura = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
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
        CondicionesVenta = new javax.swing.JPanel();
        rbContado = new javax.swing.JRadioButton();
        rbCuenta = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
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
        jButton1 = new javax.swing.JButton();

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
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
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(btnAgregarClienteDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarClienteDialog, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(12, 12, 12))
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

        btnCrearProductoNuevoProducto.setText("Crear");
        btnCrearProductoNuevoProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearProductoNuevoProductoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCategoriaNuevoProducto)
                    .addComponent(lblDescripcionNuevoProducto)
                    .addComponent(lblPrecioNuevoProducto)
                    .addComponent(lblCantidadNuevoProducto))
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(spCantidad, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbCategoriaNuevoProducto, javax.swing.GroupLayout.Alignment.LEADING, 0, 136, Short.MAX_VALUE)
                        .addComponent(txtDescripcionNuevoProducto, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPrecioNuevoProducto, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(btnCrearProductoNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcionNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripcionNuevoProducto))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecioNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPrecioNuevoProducto))
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidadNuevoProducto))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCategoriaNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoriaNuevoProducto))
                .addGap(27, 27, 27)
                .addComponent(btnCrearProductoNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
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
        dlgListaProductos.setSize(new java.awt.Dimension(581, 566));

        jLabel1.setText("Producto");

        btndlgBuscarP.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\search.png")); // NOI18N
        btndlgBuscarP.setText("Buscar Producto");
        btndlgBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndlgBuscarPActionPerformed(evt);
            }
        });

        spDlgCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spDlgCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCantidad.setText("Cantidad");

        tbDlgListaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbDlgListaProducto);

        btnDlgAgregarP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDlgAgregarP.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\add_Producto.png")); // NOI18N
        btnDlgAgregarP.setText("Agregar Artículo");
        btnDlgAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgAgregarPActionPerformed(evt);
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
                        .addGap(55, 55, 55)
                        .addComponent(txtDialogBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btndlgBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCantidad)
                        .addGap(84, 84, 84)
                        .addComponent(spDlgCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDlgAgregarP))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDialogBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btndlgBuscarP))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spDlgCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidad)
                    .addComponent(btnDlgAgregarP))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dlgListaProductosLayout = new javax.swing.GroupLayout(dlgListaProductos.getContentPane());
        dlgListaProductos.getContentPane().setLayout(dlgListaProductosLayout);
        dlgListaProductosLayout.setHorizontalGroup(
            dlgListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgListaProductosLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dlgListaProductosLayout.setVerticalGroup(
            dlgListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Titulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Titulo.setText("Facturador");

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

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(499, 499, 499)
                .addComponent(lblMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSalir)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalir)
                    .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titulo))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnPrincipal.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 40));

        Side.setBackground(new java.awt.Color(0, 153, 0));

        btnFactura.setText("Facturar");
        btnFactura.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFacturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFacturaMouseExited(evt);
            }
        });

        btnClientes.setText("Clientes");

        btnProductos.setText("Productos");

        javax.swing.GroupLayout SideLayout = new javax.swing.GroupLayout(Side);
        Side.setLayout(SideLayout);
        SideLayout.setHorizontalGroup(
            SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SideLayout.setVerticalGroup(
            SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnPrincipal.add(Side, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 580));

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
        txtNombreCliente.setText("Nombre");
        txtNombreCliente.setBorder(null);
        txtNombreCliente.setEnabled(false);

        txtTelefono.setEditable(false);
        txtTelefono.setText("Telefono");
        txtTelefono.setBorder(null);
        txtTelefono.setEnabled(false);

        txtApellido.setText("Apellido");
        txtApellido.setBorder(null);
        txtApellido.setEnabled(false);

        jTextField1.setEditable(false);
        jTextField1.setText("Localidad");
        jTextField1.setBorder(null);
        jTextField1.setEnabled(false);

        txtLocalidad.setEditable(false);
        txtLocalidad.setText("Localidad");
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

        lblCliente1.setText("Cliente");

        CondicionesVenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        rbgCondiciones.add(rbContado);
        rbContado.setText("Contado");

        rbgCondiciones.add(rbCuenta);
        rbCuenta.setText("Cuenta Corriente");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Condiciones de venta");

        javax.swing.GroupLayout CondicionesVentaLayout = new javax.swing.GroupLayout(CondicionesVenta);
        CondicionesVenta.setLayout(CondicionesVentaLayout);
        CondicionesVentaLayout.setHorizontalGroup(
            CondicionesVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CondicionesVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbContado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(rbCuenta)
                .addContainerGap())
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CondicionesVentaLayout.setVerticalGroup(
            CondicionesVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CondicionesVentaLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CondicionesVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbContado)
                    .addComponent(rbCuenta))
                .addContainerGap())
        );

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addComponent(lblCliente1)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarCliente))
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(txtTelefono))))
                .addGap(18, 18, 18)
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addComponent(lblCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(CondicionesVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EncabezadoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(CondicionesVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EncabezadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscarCliente)
                            .addComponent(lblCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
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
                            .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnPrincipal.add(Encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 880, 120));

        ContenedorComprobante.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
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

        txtTotal.setBackground(new java.awt.Color(0, 0, 0));
        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(51, 204, 0));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTotal.setText("Total");

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\borrar_todo.png")); // NOI18N
        btnLimpiar.setText("Limpiar");

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\shopping.png")); // NOI18N
        jButton1.setText("Cobrar");

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
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        ContenedorComprobanteLayout.setVerticalGroup(
            ContenedorComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorComprobanteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContenedorComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ContenedorComprobanteLayout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContenedorComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pnPrincipal.add(ContenedorComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 880, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void btnFacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturaMouseEntered
        btnFactura.setBackground(Color.red);
    }//GEN-LAST:event_btnFacturaMouseEntered

    private void btnFacturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturaMouseExited
        btnFactura.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnFacturaMouseExited

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        click(evt);
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        mover(evt);
    }//GEN-LAST:event_headerMouseDragged

    private void btnBuscarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseEntered
        btnBuscarCliente.setBackground(Color.red);
    }//GEN-LAST:event_btnBuscarClienteMouseEntered

    private void btnBuscarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseExited
        btnBuscarCliente.setBackground(new Color(78, 80, 82));
    }//GEN-LAST:event_btnBuscarClienteMouseExited

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        lblSalir.setForeground(Color.red);
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        lblSalir.setForeground(new Color(187, 187, 187));
    }//GEN-LAST:event_lblSalirMouseExited

    private void btnBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseClicked
        if (modeloCliente != null) {
            limpiarTabla(modeloCliente);
        }        
        dlgClientes.setLocationRelativeTo(null);
        dlgClientes.setVisible(true);
        //dlgClientes.setBounds(600,800,840, 564);
    }//GEN-LAST:event_btnBuscarClienteMouseClicked

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseEntered
        lblMinimizar.setForeground(Color.CYAN);
    }//GEN-LAST:event_lblMinimizarMouseEntered

    private void lblMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseExited
        lblMinimizar.setForeground(new Color(187, 187, 187));
    }//GEN-LAST:event_lblMinimizarMouseExited

    private void btnAgregarProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductosMouseClicked

    }//GEN-LAST:event_btnAgregarProductosMouseClicked

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
 
        dlgNuevoProductoRapido.setLocationRelativeTo(null);
        dlgNuevoProductoRapido.setVisible(true);
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnBuscarNombreDialogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarNombreDialogMouseClicked
        String nombre = txtBuscarNombreDialog.getText().toString();
        
        if (modeloCliente != null) {
            limpiarTabla(modeloCliente);
        }
        var clientes = clienteController.listarPorNombre(nombre);
        clientes.forEach(cliente -> modeloCliente.addRow(new Object[]{
            cliente.getId(), cliente.getNombre(), cliente.getApellido(),
            cliente.getTelefono(), cliente.getLocalidad()}));
    }//GEN-LAST:event_btnBuscarNombreDialogMouseClicked

    private void btnAgregarClienteDialogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarClienteDialogMouseClicked
        agregarCliente();
    }//GEN-LAST:event_btnAgregarClienteDialogMouseClicked

    
    private void btnCrearProductoNuevoProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearProductoNuevoProductoMouseClicked
                
        CrearProductoRapido();
    }//GEN-LAST:event_btnCrearProductoNuevoProductoMouseClicked
    private void txtPrecioNuevoProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioNuevoProductoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean borrar = key == 8;
        boolean supr = key == 127;
        boolean coma = key == 44 && key == 46;
        if (!(numeros || borrar || supr || coma)) {
            
            //Mensaje("<html><b>Solo numeros</b></html>", "Error ingreso de datos", ERROR);
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioNuevoProductoKeyTyped

    private void btnAgregarClienteDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteDialogActionPerformed
        agregarCliente();
    }//GEN-LAST:event_btnAgregarClienteDialogActionPerformed

    private void btnBuscarNombreDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNombreDialogActionPerformed
        
    }//GEN-LAST:event_btnBuscarNombreDialogActionPerformed

    private void btndlgBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndlgBuscarPActionPerformed
        buscarProducto();
    }//GEN-LAST:event_btndlgBuscarPActionPerformed

    private void btnDlgAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgAgregarPActionPerformed
        agregarProducto();
    }//GEN-LAST:event_btnDlgAgregarPActionPerformed

    private void btnAgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductosActionPerformed
       dlgListaProductos.setLocationRelativeTo(null);
       dlgListaProductos.setVisible(true);
    }//GEN-LAST:event_btnAgregarProductosActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarProducto();
    }//GEN-LAST:event_btnEliminarActionPerformed

    public static void main(String args[]) {
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);

            }
        });
    }

//<editor-fold defaultstate="collapse" desc="Variables no modificar">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CondicionesVenta;
    private javax.swing.JPanel ContenedorComprobante;
    private javax.swing.JLabel Datos;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JPanel Side;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel TituloDialog;
    private javax.swing.JButton btnAgregarClienteDialog;
    private javax.swing.JButton btnAgregarProductos;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarCodigoDialog;
    private javax.swing.JButton btnBuscarLocalidadDialog;
    private javax.swing.JButton btnBuscarNombreDialog;
    private javax.swing.JButton btnBuscarTelefonoDialog;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCrearProductoNuevoProducto;
    private javax.swing.JButton btnDlgAgregarP;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btndlgBuscarP;
    private javax.swing.JComboBox<String> cbCategoriaNuevoProducto;
    private javax.swing.JDialog dlgClientes;
    private javax.swing.JDialog dlgListaProductos;
    private javax.swing.JDialog dlgNuevoProductoRapido;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCantidadNuevoProducto;
    private javax.swing.JLabel lblCategoriaNuevoProducto;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCliente1;
    private javax.swing.JLabel lblCliente2;
    private javax.swing.JLabel lblCliente3;
    private javax.swing.JLabel lblCodigoDialog;
    private javax.swing.JLabel lblDescripcionNuevoProducto;
    private javax.swing.JLabel lblLocalidadDialog;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNombreDialog;
    private javax.swing.JLabel lblPrecioNuevoProducto;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblTelefonoDialog;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JRadioButton rbContado;
    private javax.swing.JRadioButton rbCuenta;
    private javax.swing.ButtonGroup rbgCondiciones;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JSpinner spDlgCantidad;
    private javax.swing.JTable tbClienteDialog;
    private javax.swing.JTable tbDlgListaProducto;
    private javax.swing.JTable tbFactura;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscarCodigoDialog;
    private javax.swing.JTextField txtBuscarLocalidadDialog;
    private javax.swing.JTextField txtBuscarNombreDialog;
    private javax.swing.JTextField txtBuscarTelefonoDialog;
    private javax.swing.JTextField txtDescripcionNuevoProducto;
    private javax.swing.JTextField txtDialogBuscarP;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtPrecioNuevoProducto;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
    private void limpiarTabla(DefaultTableModel modelo) {
        modelo.getDataVector().clear();
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
   
    private void Mensaje(String msg, String titulo, int msgType) {
        JOptionPane.showMessageDialog(null, msg, titulo, msgType);
    }

    private void cargarTablaFactura(String[] carga) {
        modeloFactura = (DefaultTableModel) tbFactura.getModel();
        for (int i = 0; i < carga.length; i++) {
            modeloFactura.addColumn(carga[i]);
        }
    }
    
    public void agregarCliente(){
        Cliente clienteElegido = new Cliente(Long.valueOf(modeloCliente.getValueAt(tbClienteDialog.getSelectedRow(), 0).toString()),
                modeloCliente.getValueAt(tbClienteDialog.getSelectedRow(), 1).toString(),
                modeloCliente.getValueAt(tbClienteDialog.getSelectedRow(), 2).toString(),
                modeloCliente.getValueAt(tbClienteDialog.getSelectedRow(), 3).toString(),
                modeloCliente.getValueAt(tbClienteDialog.getSelectedRow(), 4).toString());
        
        String nombreCompleto = clienteElegido.getNombre() + " " + clienteElegido.getApellido();
        
        setearCliente(clienteElegido);
        dlgClientes.dispose();
    }

    public void CrearProductoRapido(){
        Integer cantidad = (Integer) spCantidad.getValue();
        if (txtDescripcionNuevoProducto.getText().isEmpty()) {
            Mensaje("Por favor ingrese una descripción", "¡Faltan Datos!", JOptionPane.WARNING_MESSAGE);
        } else if (txtPrecioNuevoProducto.getText().isEmpty()) {
            Mensaje("Por favor ingrese un precio", "¡Faltan Datos!", JOptionPane.ERROR_MESSAGE);
        }else if(!(txtDescripcionNuevoProducto.getText().isEmpty() && txtPrecioNuevoProducto.getText().isEmpty())){
            String nombre = txtDescripcionNuevoProducto.getText();
            float precio = Float.valueOf(txtPrecioNuevoProducto.getText());
            float total = precio * (float)cantidad;
            modeloFactura.addRow(new Object[]{String.valueOf(cantidad), nombre, String.valueOf(precio),
                String.valueOf(total)});
            dlgNuevoProductoRapido.dispose();
            sumarTotal(total);
        }
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
    //</editor-fold>

    private void buscarProducto() {
        String buscar = txtDialogBuscarP.getText();
        var productos = productoController.listarProductos(buscar);
        productos.forEach(producto -> modeloProductos.addRow(new Object[]{
        producto.getCodigo(), producto.getNombre(), producto.getCategoria().getNombre(), producto.getPrecio()}));
    }

    private void agregarProducto() {
        Productos producto = new Productos(
            Long.valueOf(modeloProductos.getValueAt(tbDlgListaProducto.getSelectedRow(), 0).toString()),
                modeloProductos.getValueAt(tbDlgListaProducto.getSelectedRow(),1).toString(), 
                Float.valueOf(modeloProductos.getValueAt(tbDlgListaProducto.getSelectedRow(), 3).toString()));
        
        int cantidad = Integer.valueOf(spDlgCantidad.getValue().toString());
        float total = producto.getPrecio()*(float)cantidad;
        
        modeloFactura.addRow(new Object[]{cantidad, producto.getNombre(), producto.getPrecio(), total});
        sumarTotal(total);
        dlgListaProductos.dispose();
    }

    private void sumarTotal(float sumar) {        
        total = total + sumar;
        txtTotal.setText("$"+total);
    }

    private void eliminarProducto() {
        if (filaSeleccionada()){
            Mensaje("Elegir un producto para eliminar", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        }
        float total = -Float.valueOf(modeloFactura.getValueAt(tbFactura.getSelectedRow(), 3).toString());
        sumarTotal(total);
        modeloFactura.removeRow(tbFactura.getSelectedRow());
    }

    private boolean filaSeleccionada() {
        return tbFactura.getSelectedRowCount() == 0 || tbFactura.getSelectedColumnCount()== 0;
    }
}
