
package com.facturador.LodeLidia.views;

import com.facturador.LodeLidia.controller.CategoriaController;
import com.facturador.LodeLidia.controller.ClienteController;
import com.facturador.LodeLidia.controller.ProductoController;
import com.facturador.LodeLidia.modelo.Categoria;
import com.facturador.LodeLidia.modelo.Cliente;
import com.facturador.LodeLidia.modelo.Productos;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MenuPrincipal extends javax.swing.JFrame {

    int xMouse, yMouse;
    private ClientesForm formCliente;
    private DefaultTableModel modelo;
    private DefaultTableModel modeloFactura;
    private DefaultTableModel modeloProductos;
    private ClienteController clienteController;
    private ProductoController productoController;
    private Cliente cliente;
    private Productos producto;
    private Categoria categoria;
    private CategoriaController categoriaController;
   // public static Productos p;
    
    
    public MenuPrincipal() {
        initComponents();
        this.formCliente = new ClientesForm();   
        this.productoController = new ProductoController();
        this.categoriaController = new CategoriaController();
        if (cliente !=null)
            setearCliente(cliente);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        btnAgregarProductos = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCliente = new javax.swing.JTable();
        btnAgregarCliente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbFactura = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        txtBuscarProducto = new javax.swing.JTextField();
        lblCliente1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        lblCliente2 = new javax.swing.JLabel();
        lblCliente3 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        txtLocalidad = new javax.swing.JTextField();
        btnBuscarProductos = new javax.swing.JButton();

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
                .addContainerGap(514, Short.MAX_VALUE)
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
                .addGap(0, 8, Short.MAX_VALUE))
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
            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
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
                .addContainerGap(223, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 580));

        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 390, 210));

        btnAgregarProductos.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\add_Producto.png")); // NOI18N
        btnAgregarProductos.setText("Agregar Productos");
        btnAgregarProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarProductosMouseClicked(evt);
            }
        });
        jPanel1.add(btnAgregarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, -1, -1));

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
        jPanel1.add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        tbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbCliente);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 380, 60));

        btnAgregarCliente.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\adherir_cliente.png")); // NOI18N
        btnAgregarCliente.setText("Agregar Cliente");
        jPanel1.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 150, -1));

        tbFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbFactura);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 500, 280));

        btnNuevo.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\nuevo_Producto.png")); // NOI18N
        btnNuevo.setText("Nuevo Producto");
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 150, -1));
        jPanel1.add(txtBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 150, -1));

        lblCliente1.setText("Cliente");
        jPanel1.add(lblCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, 30));

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
        txtLocalidad.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCliente2)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCliente3, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(lblCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 500, 140));

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
        jPanel1.add(btnBuscarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

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

    public void setearCliente(Cliente c){
        cliente = new Cliente(c);
        txtNombreCliente.setText(cliente.getNombre());
        txtApellido.setText(cliente.getApellido());
        txtTelefono.setText(cliente.getTelefono());
        txtLocalidad.setText(cliente.getLocalidad());
        cargarTabla();
        
        modelo.addRow(new Object[] {cliente.getId(), cliente.getNombre(),
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
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void btnBuscarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseEntered
        btnBuscarCliente.setBackground(Color.red);
    }//GEN-LAST:event_btnBuscarClienteMouseEntered

    private void btnBuscarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseExited
       btnBuscarCliente.setBackground(new Color(78,80,82));      
    }//GEN-LAST:event_btnBuscarClienteMouseExited

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        lblSalir.setForeground(Color.red);
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        lblSalir.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_lblSalirMouseExited

    private void btnBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarClienteMouseClicked

        this.dispose();
       formCliente.setVisible(true);
       if (modelo != null){
           limpiarTabla();
       }
    }//GEN-LAST:event_btnBuscarClienteMouseClicked

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseEntered
        lblMinimizar.setForeground(Color.CYAN);
    }//GEN-LAST:event_lblMinimizarMouseEntered

    private void lblMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseExited
        lblMinimizar.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_lblMinimizarMouseExited

    private void btnAgregarProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductosMouseClicked
        formCliente.setVisible(true);
    }//GEN-LAST:event_btnAgregarProductosMouseClicked

    private void btnBuscarProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarProductosMouseClicked
        if(modeloProductos != null){
            limpiarTabla();
        }
        cargarTablaProductos();
        List<Productos> productos = new ArrayList<>();
        String buscar = txtBuscarProducto.getText().toString();
        productos = productoController.listarProductos(buscar);
        //var categoria = categoriaController.listarCategoria();
        
        
        productos.forEach(producto -> modeloProductos.addRow(new Object[] {
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
       ProductosForm formProductos = new ProductosForm();
       formProductos.setVisible(true);
    }//GEN-LAST:event_btnNuevoMouseClicked
     
    private void cargarTabla() {
        modelo = (DefaultTableModel) tbCliente.getModel();
        
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
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarProductos;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProductos;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnProductos;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCliente1;
    private javax.swing.JLabel lblCliente2;
    private javax.swing.JLabel lblCliente3;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JTable tbCliente;
    private javax.swing.JTable tbFactura;
    private javax.swing.JTable tbProductos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

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
}
