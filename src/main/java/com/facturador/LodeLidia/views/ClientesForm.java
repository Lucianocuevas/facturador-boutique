
package com.facturador.LodeLidia.views;

import com.facturador.LodeLidia.controller.ClienteController;
import com.facturador.LodeLidia.modelo.Cliente;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ClientesForm extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public static Cliente clienteElegido;
    public static Cliente p;
    public static String nombreCompleto;
    private DefaultTableModel modelo;
    
    
    
    private ClienteController clienteController;

    public ClientesForm() {
        this.clienteController = new ClienteController();       
        initComponents();  
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtBuscarNombre = new javax.swing.JTextField();
        txtBuscarCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCliente = new javax.swing.JTable();
        lblNombre = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        btnBuscarNombre = new javax.swing.JButton();
        btnBuscarCodigo = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        lblLocalidad = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtBuscarTelefono = new javax.swing.JTextField();
        txtBuscarLocalidad = new javax.swing.JTextField();
        btnBuscarCodigo1 = new javax.swing.JButton();
        btnBuscarTelefono = new javax.swing.JButton();
        btnAgregarCliente = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(980, 580));

        jScrollPane1.setViewportView(tbCliente);

        lblNombre.setText("Nombre");

        lblCodigo.setText("Codigo");

        btnBuscarNombre.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\search.png")); // NOI18N
        btnBuscarNombre.setText("Buscar Por Nombre");
        btnBuscarNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarNombreMouseClicked(evt);
            }
        });

        btnBuscarCodigo.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\search.png")); // NOI18N
        btnBuscarCodigo.setText("Buscar Por Codigo");

        Titulo.setBackground(new java.awt.Color(73, 51, 51));
        Titulo.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Clientes");
        Titulo.setOpaque(true);

        lblLocalidad.setText("Localidad");

        lblTelefono.setText("Telefono");

        btnBuscarCodigo1.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\search.png")); // NOI18N
        btnBuscarCodigo1.setText("Buscar Por Localidad");

        btnBuscarTelefono.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\search.png")); // NOI18N
        btnBuscarTelefono.setText("Buscar Por Telefono");

        btnAgregarCliente.setIcon(new javax.swing.ImageIcon("C:\\git\\LodeLidia\\src\\main\\java\\com\\facturador\\LodeLidia\\images\\adherir_cliente.png")); // NOI18N
        btnAgregarCliente.setText("Agregar Cliente a factura");
        btnAgregarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNombre)
                                            .addComponent(lblLocalidad))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBuscarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBuscarLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblCodigo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTelefono)
                                .addGap(361, 361, 361)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnBuscarCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscarCodigo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                .addComponent(btnBuscarNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(302, 302, 302))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre)
                    .addComponent(btnBuscarNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo)
                    .addComponent(btnBuscarCodigo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono)
                    .addComponent(btnBuscarTelefono))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocalidad)
                    .addComponent(btnBuscarCodigo1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headerMouseClicked(evt);
            }
        });
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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
        header.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 20, -1));

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
        header.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 20, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        lblSalir.setForeground(Color.red);
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        lblSalir.setForeground(new Color(187, 187, 187));
    }//GEN-LAST:event_lblSalirMouseExited

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblSalirMouseClicked

    private void headerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseClicked
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMouseClicked

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void btnBuscarNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarNombreMouseClicked
        String nombre = txtBuscarNombre.getText();
        modelo = (DefaultTableModel) tbCliente.getModel();
        limpiarTabla();
        cargarTabla();
        
       var clientes = clienteController.listarPorNombre(nombre);          
               
       clientes.forEach(cliente -> modelo.addRow(new Object[] {
            cliente.getId(), cliente.getNombre(), cliente.getApellido(),
            cliente.getTelefono(), cliente.getLocalidad()}));
    }//GEN-LAST:event_btnBuscarNombreMouseClicked

    private void btnAgregarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarClienteMouseClicked
            
        clienteElegido = new Cliente(Long.valueOf(modelo.getValueAt(tbCliente.getSelectedRow(), 0).toString()),
                modelo.getValueAt(tbCliente.getSelectedRow(), 1).toString(),
                modelo.getValueAt(tbCliente.getSelectedRow(), 2).toString(),
                modelo.getValueAt(tbCliente.getSelectedRow(), 3).toString(),
                modelo.getValueAt(tbCliente.getSelectedRow(), 4).toString());
        
        
        String nombreCompleto = clienteElegido.getNombre() + " " + clienteElegido.getApellido();
        
       // menu.cliente = new Cliente(clienteElegido);
       
        MenuPrincipal menu = new MenuPrincipal();
        menu.setearCliente(clienteElegido);       
        
        JOptionPane.showMessageDialog(null, nombreCompleto);           
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgregarClienteMouseClicked

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
       //this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseEntered
        lblMinimizar.setForeground(Color.CYAN);
    }//GEN-LAST:event_lblMinimizarMouseEntered

    private void lblMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseExited
        lblMinimizar.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_lblMinimizarMouseExited



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnBuscarCodigo;
    private javax.swing.JButton btnBuscarCodigo1;
    private javax.swing.JButton btnBuscarNombre;
    private javax.swing.JButton btnBuscarTelefono;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblLocalidad;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTable tbCliente;
    private javax.swing.JTextField txtBuscarCodigo;
    private javax.swing.JTextField txtBuscarLocalidad;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextField txtBuscarTelefono;
    // End of variables declaration//GEN-END:variables

    private void limpiarTabla() {
        modelo.getDataVector().clear();
    }

   /* private void limpiarTabla() {
       modelo.getDataVector().clear();
    }*/

    private void cargarTabla() {              
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Telefono");
        modelo.addColumn("Localidad");
    }

    
}
