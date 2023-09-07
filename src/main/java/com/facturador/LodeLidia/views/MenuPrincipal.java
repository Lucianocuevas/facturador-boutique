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
    private DefaultTableModel modelo;
    private DefaultTableModel modeloFactura;
    private DefaultTableModel modeloProductos;
    private ClienteController clienteController;
    private ProductoController productoController;
    private Cliente cliente;
    private Productos producto;
    private Categoria categoria;
    private CategoriaController categoriaController;
    private String[] cargaTabla;

    // public static Productos p;
    public MenuPrincipal() {
        initComponents();
        this.productoController = new ProductoController();
        this.categoriaController = new CategoriaController();
        this.clienteController = new ClienteController();
        cargaTabla = new String[]{"CANTIDAD", "DESCRIPCION", "PRECIO UNITARIO", "PRECIO FINAL"};
        cargarTablaFactura(cargaTabla);
        if (cliente != null) {
            setearCliente(cliente);
        }
        var cat = categoriaController.listarCategoria();
        cat.forEach(categoria -> cbCategoriaNuevoProducto.addItem(categoria.getNombre()));
        spCantidad.setValue(1);
        
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
        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnFactura = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();
        txtBuscarProducto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
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
        btnBuscarProductos = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbFactura = new javax.swing.JTable();
        btnAgregarProductos = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        dlgClientes.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dlgClientes.setModal(true);
        dlgClientes.setResizable(false);
        dlgClientes.setSize(new java.awt.Dimension(840, 564));

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
            .addGroup(dlgNuevoProductoRapidoLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        dlgNuevoProductoRapidoLayout.setVerticalGroup(
            dlgNuevoProductoRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dlgNuevoProductoRapido.getAccessibleContext().setAccessibleParent(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Facturador");

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
                .addComponent(jLabel1)
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
                    .addComponent(jLabel1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 40));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 580));

        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 260, 70));
        jPanel1.add(txtBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 150, -1));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCliente1)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarCliente))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(txtTelefono))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCliente3, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarCliente)
                    .addComponent(lblCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 570, 120));

        btnBuscarProductos.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\search.png")); // NOI18N
        btnBuscarProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarProductosMouseExited(evt);
            }
        });
        jPanel1.add(btnBuscarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 100, -1, -1));

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

        btnNuevo.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\nuevo_Producto.png")); // NOI18N
        btnNuevo.setText("Nuevo Producto");
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\round_remove_white_18dp.png")); // NOI18N
        btnEliminar.setText("Eliminar Producto");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarProductos)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarProductos))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 830, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setearCliente(Cliente c) {
        cliente = new Cliente(c);
        txtNombreCliente.setText(cliente.getNombre());
        txtApellido.setText(cliente.getApellido());
        txtTelefono.setText(cliente.getTelefono());
        txtLocalidad.setText(cliente.getLocalidad());

        modelo.addRow(new Object[]{cliente.getId(), cliente.getNombre(),
            cliente.getApellido(), cliente.getTelefono(), cliente.getLocalidad()});

    }

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
        xMouse = evt.getX();
        yMouse = evt.getY();
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
        if (modelo != null) {
            limpiarTabla();
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

    private void btnBuscarProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarProductosMouseClicked
        if (modeloProductos != null) {
            limpiarTabla();
        }
        cargarTablaProductos();
        List<Productos> productos = new ArrayList<>();
        String buscar = txtBuscarProducto.getText().toString();
        productos = productoController.listarProductos(buscar);
        var categoria = categoriaController.listarCategoria();

        productos.forEach(producto -> modeloProductos.addRow(new Object[]{
            producto.getCodigo(), producto.getNombre(), producto.getCategoria().getNombre(),
            producto.getPrecio()})
        );

    }//GEN-LAST:event_btnBuscarProductosMouseClicked

    private void btnBuscarProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarProductosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarProductosMouseEntered

    private void btnBuscarProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarProductosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarProductosMouseExited

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked

        
        //dlgNuevoProductoRapido.setBounds(850, 950, 423, 285);   
        dlgNuevoProductoRapido.setLocationRelativeTo(null);
        dlgNuevoProductoRapido.setVisible(true);
        spCantidad.setValue(1);
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnBuscarNombreDialogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarNombreDialogMouseClicked
        String nombre = txtBuscarNombreDialog.getText().toString();
        if (modelo != null) {
            limpiarTabla();
        }
        cargarTabla();

        var clientes = clienteController.listarPorNombre(nombre);

        clientes.forEach(cliente -> modelo.addRow(new Object[]{
            cliente.getId(), cliente.getNombre(), cliente.getApellido(),
            cliente.getTelefono(), cliente.getLocalidad()}));
    }//GEN-LAST:event_btnBuscarNombreDialogMouseClicked

    private void btnAgregarClienteDialogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarClienteDialogMouseClicked

        Cliente clienteElegido = new Cliente(Long.valueOf(modelo.getValueAt(tbClienteDialog.getSelectedRow(), 0).toString()),
                modelo.getValueAt(tbClienteDialog.getSelectedRow(), 1).toString(),
                modelo.getValueAt(tbClienteDialog.getSelectedRow(), 2).toString(),
                modelo.getValueAt(tbClienteDialog.getSelectedRow(), 3).toString(),
                modelo.getValueAt(tbClienteDialog.getSelectedRow(), 4).toString());

        String nombreCompleto = clienteElegido.getNombre() + " " + clienteElegido.getApellido();

        setearCliente(clienteElegido);
        dlgClientes.dispose();
    }//GEN-LAST:event_btnAgregarClienteDialogMouseClicked

    private void btnCrearProductoNuevoProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearProductoNuevoProductoMouseClicked
                
        Integer cantidad = (Integer) spCantidad.getValue();
        if (txtDescripcionNuevoProducto.getText().isEmpty()) {
            Mensaje("Por favor ingrese una descripción", "¡Faltan Datos!", JOptionPane.WARNING_MESSAGE);
        } else if (txtPrecioNuevoProducto.getText().isEmpty()) {
            Mensaje("Por favor ingrese un precio", "¡Faltan Datos!", JOptionPane.ERROR_MESSAGE);
        }else if(cantidad >= 1 && !(txtDescripcionNuevoProducto.getText().isEmpty() && txtPrecioNuevoProducto.getText().isEmpty())){
            String nombre = txtDescripcionNuevoProducto.getText();
            float precio = Float.valueOf(txtPrecioNuevoProducto.getText());
            float total = precio * (float)cantidad;
            modeloFactura.addRow(new Object[]{String.valueOf(cantidad), nombre, String.valueOf(precio), 
                    String.valueOf(total)});  
            dlgNuevoProductoRapido.dispose();
        }
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

    private void cargarTabla() {
        modelo = (DefaultTableModel) tbClienteDialog.getModel();

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Telefono");
        modelo.addColumn("Localidad");
    }

    public static void main(String args[]) {
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloDialog;
    private javax.swing.JButton btnAgregarClienteDialog;
    private javax.swing.JButton btnAgregarProductos;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarCodigoDialog;
    private javax.swing.JButton btnBuscarLocalidadDialog;
    private javax.swing.JButton btnBuscarNombreDialog;
    private javax.swing.JButton btnBuscarProductos;
    private javax.swing.JButton btnBuscarTelefonoDialog;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCrearProductoNuevoProducto;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnProductos;
    private javax.swing.JComboBox<String> cbCategoriaNuevoProducto;
    private javax.swing.JDialog dlgClientes;
    private javax.swing.JDialog dlgNuevoProductoRapido;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
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
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JTable tbClienteDialog;
    private javax.swing.JTable tbFactura;
    private javax.swing.JTable tbProductos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscarCodigoDialog;
    private javax.swing.JTextField txtBuscarLocalidadDialog;
    private javax.swing.JTextField txtBuscarNombreDialog;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextField txtBuscarTelefonoDialog;
    private javax.swing.JTextField txtDescripcionNuevoProducto;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtPrecioNuevoProducto;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    protected void mover(MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }

    private void limpiarTabla() {
        modelo.getDataVector().clear();
    }

    private void cargarTablaProductos() {
        modeloProductos = (DefaultTableModel) tbProductos.getModel();

        modeloProductos.addColumn("Codigo");
        modeloProductos.addColumn("Nombre");
        modeloProductos.addColumn("Categoria");
        modeloProductos.addColumn("Precio");
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

    private void click(MouseEvent evt) {
        xMouse = evt.getX();
        yMouse = evt.getY();
    }
}
