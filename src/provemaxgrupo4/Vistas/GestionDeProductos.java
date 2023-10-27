package provemaxgrupo4.Vistas;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import provemaxgrupo4.AccesoADatos.Conexion;
import provemaxgrupo4.AccesoADatos.ProductoData;
import provemaxgrupo4.Entidades.Producto;
import provemaxgrupo4.Entidades.RowRenderer;

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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        panelAbajo = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        panelbotones = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelCentral = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLId = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTPrecio = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTStock = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setOpaque(false);

        jPanel2.setBackground(new java.awt.Color(201, 242, 255));

        jPanel3.setBackground(new java.awt.Color(201, 242, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(201, 242, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(257, Short.MAX_VALUE)))
        );

        setBackground(new java.awt.Color(201, 242, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        panelAbajo.setPreferredSize(new java.awt.Dimension(0, 70));
        panelAbajo.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(201, 242, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(709, 20));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelAbajo.add(jPanel5, java.awt.BorderLayout.SOUTH);

        panelbotones.setBackground(new java.awt.Color(201, 242, 255));
        panelbotones.setPreferredSize(new java.awt.Dimension(709, 200));
        panelbotones.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        jLabel7.setPreferredSize(new java.awt.Dimension(0, 100));
        panelbotones.add(jLabel7);

        jBLimpiar.setBackground(new java.awt.Color(36, 135, 246));
        jBLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jBLimpiar.setText("LIMPIAR");
        jBLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        panelbotones.add(jBLimpiar);

        jBModificar.setBackground(new java.awt.Color(36, 135, 246));
        jBModificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBModificar.setForeground(new java.awt.Color(255, 255, 255));
        jBModificar.setText("MODIFICAR");
        jBModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });
        panelbotones.add(jBModificar);

        jBGuardar.setBackground(new java.awt.Color(36, 135, 246));
        jBGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jBGuardar.setText("GUARDAR");
        jBGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBGuardar.setPreferredSize(new java.awt.Dimension(61, 30));
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        panelbotones.add(jBGuardar);

        jBEliminar.setBackground(new java.awt.Color(36, 135, 246));
        jBEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminar.setText("ELIMINAR");
        jBEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });
        panelbotones.add(jBEliminar);

        jBSalir.setBackground(new java.awt.Color(36, 135, 246));
        jBSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("SALIR");
        jBSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        panelbotones.add(jBSalir);

        jLabel1.setPreferredSize(new java.awt.Dimension(0, 100));
        panelbotones.add(jLabel1);

        panelAbajo.add(panelbotones, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelAbajo, java.awt.BorderLayout.SOUTH);

        panelTitulo.setLayout(new java.awt.GridLayout());

        labelTitulo.setBackground(new java.awt.Color(36, 135, 246));
        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("GESTION DE PRODUCTOS");
        labelTitulo.setOpaque(true);
        panelTitulo.add(labelTitulo);

        getContentPane().add(panelTitulo, java.awt.BorderLayout.PAGE_START);

        panelCentral.setPreferredSize(new java.awt.Dimension(709, 400));
        panelCentral.setLayout(new java.awt.GridLayout(2, 0));

        jPanel6.setLayout(new java.awt.GridLayout(4, 0));

        jPanel8.setBackground(new java.awt.Color(201, 242, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Id:");
        jPanel8.add(jLabel6);

        jLId.setBackground(new java.awt.Color(255, 255, 255));
        jLId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLId.setOpaque(true);
        jLId.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel8.add(jLId);

        jPanel6.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(201, 242, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Nombre:");
        jLabel2.setPreferredSize(new java.awt.Dimension(75, 30));
        jPanel9.add(jLabel2);

        jTNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTNombre.setPreferredSize(new java.awt.Dimension(210, 30));
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
        jPanel9.add(jTNombre);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Precio:");
        jLabel4.setPreferredSize(new java.awt.Dimension(60, 30));
        jPanel9.add(jLabel4);

        jTPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTPrecio.setPreferredSize(new java.awt.Dimension(210, 30));
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
        jPanel9.add(jTPrecio);

        jPanel6.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(201, 242, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Descripción:");
        jLabel3.setPreferredSize(new java.awt.Dimension(75, 30));
        jPanel10.add(jLabel3);

        jTDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTDescripcion.setPreferredSize(new java.awt.Dimension(210, 30));
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
        jPanel10.add(jTDescripcion);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Stock:");
        jLabel5.setPreferredSize(new java.awt.Dimension(60, 30));
        jPanel10.add(jLabel5);

        jTStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTStock.setPreferredSize(new java.awt.Dimension(210, 30));
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
        jPanel10.add(jTStock);

        jPanel6.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(201, 242, 255));

        jRadioButton1.setBackground(new java.awt.Color(201, 242, 255));
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setText("PRODUCTOS ACTIVOS");
        jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton1.setPreferredSize(new java.awt.Dimension(210, 30));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel11.add(jRadioButton1);

        jRadioButton2.setBackground(new java.awt.Color(201, 242, 255));
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setText("PRODUCTOS ELIMINADOS");
        jRadioButton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton2.setPreferredSize(new java.awt.Dimension(210, 30));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel11.add(jRadioButton2);

        jPanel6.add(jPanel11);

        panelCentral.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(201, 242, 255));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Descripcion", "Precio", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
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
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jScrollPane1)
                    .addGap(16, 16, 16)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addGap(26, 26, 26)))
        );

        panelCentral.add(jPanel7);

        getContentPane().add(panelCentral, java.awt.BorderLayout.CENTER);

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
       if (!jTPrecio.getText().equals("")) {
        try {
            Double.parseDouble(jTPrecio.getText());

        } catch (NumberFormatException e) {
            jTPrecio.setText("");
            JOptionPane.showMessageDialog(this, "Solo se permiten numeros, intente nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }}
    }//GEN-LAST:event_jTPrecioFocusLost

    private void jTStockFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTStockFocusLost
     if (!jTStock.getText().equals("")) {
        try {
            Integer.parseInt(jTStock.getText());

        } catch (NumberFormatException e) {
            jTStock.setText("");
           JOptionPane.showMessageDialog(this, "Solo se permiten numeros, intente nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }}
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTextField jTStock;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelAbajo;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelbotones;
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
    
    // Aplica el renderizador personalizado a toda la tabla
    jTable1.setDefaultRenderer(Object.class, new RowRenderer());
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
