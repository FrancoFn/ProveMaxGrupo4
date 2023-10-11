package provemaxgrupo4.Vistas;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import provemaxgrupo4.AccesoADatos.Conexion;
import provemaxgrupo4.AccesoADatos.ProductoData;
import provemaxgrupo4.Entidades.Producto;

public class GestionDeProductos extends javax.swing.JInternalFrame {

    private Connection con = null;
    ProductoData pData = new ProductoData();
    private DefaultTableModel modelo = new DefaultTableModel();
    List<Producto> prodList;

    public GestionDeProductos() {
        initComponents();
        con = Conexion.getConexion();
        modelo = (DefaultTableModel) this.jTable1.getModel();
        jRadioButton1.setSelected(true);
        listarProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBGuardar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jTDescripcion = new javax.swing.JTextField();
        jTPrecio = new javax.swing.JTextField();
        jTStock = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Descripcion", "Precio", "Stock", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setText("Gestion de Productos");

        jLId.setOpaque(true);

        jLabel2.setText("Nombre:");

        jLabel3.setText("Descripcion:");

        jLabel4.setText("Precio:");

        jLabel5.setText("Stock:");

        jTNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTNombreFocusLost(evt);
            }
        });
        jTNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNombreKeyTyped(evt);
            }
        });

        jTDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDescripcionFocusLost(evt);
            }
        });
        jTDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTDescripcionKeyTyped(evt);
            }
        });

        jTPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTPrecioFocusLost(evt);
            }
        });
        jTPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTPrecioKeyTyped(evt);
            }
        });

        jTStock.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTStockFocusLost(evt);
            }
        });
        jTStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTStockKeyTyped(evt);
            }
        });

        jLabel6.setText("Id:");

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Productos Activos");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Productos Eliminados");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(281, 281, 281))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jBGuardar)
                        .addGap(49, 49, 49)
                        .addComponent(jBModificar)
                        .addGap(56, 56, 56)
                        .addComponent(jBEliminar)
                        .addGap(77, 77, 77)
                        .addComponent(jBSalir)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTStock, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton1)
                        .addGap(48, 48, 48)
                        .addComponent(jRadioButton2)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLId, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBSalir)
                            .addComponent(jBEliminar)
                            .addComponent(jBModificar)
                            .addComponent(jBGuardar)
                            .addComponent(jBLimpiar))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        if (jTNombre.getText().isEmpty() || jTDescripcion.getText().isEmpty() || jTPrecio.getText().isEmpty() || jTStock.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inserte los Datos");
        } else {
            guardarProducto();
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombreKeyTyped
        char letra = evt.getKeyChar();
        if ((letra < 'a' || letra > 'z') && (letra < 'A' || letra > 'Z') && (letra < ' ' || letra > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_jTNombreKeyTyped

    private void jTPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPrecioKeyTyped
        char letra = evt.getKeyChar();

        if (letra < '0' || letra > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jTPrecioKeyTyped

    private void jTStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTStockKeyTyped
        char letra = evt.getKeyChar();

        if (letra < '0' || letra > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jTStockKeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int filaSeleccionada = jTable1.rowAtPoint(evt.getPoint());
        jLId.setText(jTable1.getValueAt(filaSeleccionada, 0).toString());
        jTNombre.setText(jTable1.getValueAt(filaSeleccionada, 1).toString());
        jTDescripcion.setText(jTable1.getValueAt(filaSeleccionada, 2).toString());
        jTPrecio.setText(jTable1.getValueAt(filaSeleccionada, 3).toString());
        jTStock.setText(jTable1.getValueAt(filaSeleccionada, 4).toString());


    }//GEN-LAST:event_jTable1MouseClicked

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        if (jTNombre.getText().isEmpty() || jTDescripcion.getText().isEmpty() || jTPrecio.getText().isEmpty() || jTStock.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inserte los Datos");
        } else {
            eliminarProducto();
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiaR();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        if (jTNombre.getText().isEmpty() || jTDescripcion.getText().isEmpty() || jTPrecio.getText().isEmpty() || jTStock.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Faltan Datos");
        } else {
            modificarProducto();
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (jRadioButton1.isSelected()) {
            jRadioButton2.setSelected(false);
            listarProductos();
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if (jRadioButton2.isSelected()) {
            jRadioButton1.setSelected(false);
            listarProductos();
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jTDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDescripcionKeyTyped
        char letra = evt.getKeyChar();
        if ((letra < 'a' || letra > 'z') && (letra < 'A' || letra > 'Z') && (letra < ' ' || letra > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_jTDescripcionKeyTyped

    private void jTPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTPrecioFocusLost
        try {
            Double.parseDouble(jTPrecio.getText());

        } catch (NumberFormatException e) {
            jTPrecio.setText("");
            JOptionPane.showMessageDialog(this, "Solo se permiten numeros, intente nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTPrecioFocusLost

    private void jTStockFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTStockFocusLost
        try {
            Integer.parseInt(jTStock.getText());

        } catch (NumberFormatException e) {
            jTStock.setText("");
            JOptionPane.showMessageDialog(this, "Solo se permiten numeros, intente nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTStockFocusLost

    private void jTNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNombreFocusLost
        String texto = jTNombre.getText();
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                jTNombre.setText("");
                JOptionPane.showMessageDialog(this, "Solo se permiten letras, intente nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);

                break;
            }
        }
    }//GEN-LAST:event_jTNombreFocusLost

    private void jTDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDescripcionFocusLost
        String texto = jTDescripcion.getText();
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                jTDescripcion.setText("");
                JOptionPane.showMessageDialog(this, "Solo se permiten letras, intente nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);

                break;
            }
        }
    }//GEN-LAST:event_jTDescripcionFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTextField jTStock;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
public void limpiaR() {
        jTNombre.setText("");
        jTDescripcion.setText("");
        jTPrecio.setText("");
        jTStock.setText("");
        jLId.setText("");
        listarProductos();
    }

    public void guardarProducto() {
        Producto producto = new Producto(jTNombre.getText(), jTDescripcion.getText(), Double.parseDouble(jTPrecio.getText()), Integer.parseInt(jTStock.getText()), true);
        pData.insertarProducto(producto);
        limpiaR();
    }

    public void listarProductos() {
        modelo.setRowCount(0);
        if (jRadioButton1.isSelected()) {
            prodList = pData.listarProductosActivos(1);
            for (Producto producto : prodList) {
                modelo.addRow(new Object[]{producto.getIdProducto(), producto.getNombreProducto(), producto.getDescripcion(),
                    producto.getPrecioActual(), producto.getStock(), producto.isEstado()});
            }
        } else if (jRadioButton2.isSelected()) {
            prodList = pData.listarProductosActivos(0);
            for (Producto producto : prodList) {
                modelo.addRow(new Object[]{producto.getIdProducto(), producto.getNombreProducto(), producto.getDescripcion(),
                    producto.getPrecioActual(), producto.getStock(), producto.isEstado()});
            }
        }
    }

    public void eliminarProducto() {
        pData.eliminarProducto(Integer.parseInt(jLId.getText()));
        limpiaR();
    }

    public void modificarProducto() {
        Producto producto = new Producto();
        producto.setNombreProducto(jTNombre.getText());
        producto.setDescripcion(jTDescripcion.getText());
        producto.setPrecioActual(Double.parseDouble(jTPrecio.getText()));
        producto.setStock(Integer.parseInt(jTStock.getText()));
        producto.setIdProducto(Integer.parseInt(jLId.getText()));
        pData.modificarProducto(producto);
        limpiaR();
    }
}
