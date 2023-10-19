package provemaxgrupo4.Vistas;

import javax.swing.JOptionPane;
import provemaxgrupo4.AccesoADatos.ProveedorData;
import provemaxgrupo4.Entidades.Proveedor;

/**
 *
 * @author Sofia
 */
public class GestionDeProveedores extends javax.swing.JInternalFrame {

    private ProveedorData proveedorData;
    private Proveedor proveedor;

    /**
     * Creates new form NewJInternalFrame
     */
    public GestionDeProveedores() {
        initComponents();
        proveedorData = new ProveedorData();
        cargarComboBox();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButtonSalir = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        radioButtonCrear = new javax.swing.JRadioButton();
        radioButtonBuscar = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldDomicilio = new javax.swing.JTextField();

        setBackground(new java.awt.Color(201, 242, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jButtonSalir.setBackground(new java.awt.Color(36, 135, 246));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("SALIR");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonGuardar.setBackground(new java.awt.Color(36, 135, 246));
        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.setEnabled(false);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(36, 135, 246));
        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminar.setText("ELIMINAR");
        jButtonEliminar.setEnabled(false);
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonNuevo.setBackground(new java.awt.Color(36, 135, 246));
        jButtonNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevo.setText("LIMPIAR");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Domicilio");

        jTextFieldTelefono.setEnabled(false);
        jTextFieldTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldTelefonoFocusLost(evt);
            }
        });
        jTextFieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyTyped(evt);
            }
        });

        jTextFieldNombre.setEnabled(false);
        jTextFieldNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNombreFocusLost(evt);
            }
        });
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Codigo");

        jButtonBuscar.setBackground(new java.awt.Color(36, 135, 246));
        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jButtonBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBuscar.setContentAreaFilled(false);
        jButtonBuscar.setOpaque(true);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTextFieldCodigo.setEnabled(false);
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });
        jTextFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROVEEDORES");

        buttonGroup1.add(radioButtonCrear);
        radioButtonCrear.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        radioButtonCrear.setText("CREAR");
        radioButtonCrear.setOpaque(false);
        radioButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonCrearActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButtonBuscar);
        radioButtonBuscar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        radioButtonBuscar.setText("BUSCAR / ELIMINAR");
        radioButtonBuscar.setOpaque(false);
        radioButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonBuscarActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setEnabled(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Telefono");

        jTextFieldDomicilio.setEnabled(false);
        jTextFieldDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDomicilioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDomicilioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(radioButtonCrear)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(radioButtonBuscar))
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextFieldDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonBuscar)
                    .addComponent(radioButtonCrear))
                .addGap(29, 29, 29)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyTyped
        char letra = evt.getKeyChar();
        if ((letra < '0' || letra > '9')|| (jTextFieldCodigo.getText().length()>=11)) {
            evt.consume();
        } else {
            jComboBox1.setSelectedIndex(0);
            jTextFieldTelefono.setText("");
            jTextFieldNombre.setText("");
            jTextFieldDomicilio.setText("");
            jButtonBuscar.setEnabled(true);
        }
        if (!jTextFieldCodigo.getText().isEmpty()) {

        } else {
            jButtonEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_jTextFieldCodigoKeyTyped

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        obtenerMateria();
        jTextFieldTelefono.setEnabled(true);
        jTextFieldNombre.setEnabled(true);
        jTextFieldDomicilio.setEnabled(true);

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        char letra = evt.getKeyChar();
        if ((letra < 'a' || letra > 'z') && (letra < 'A' || letra > 'Z') && (letra < ' ' || letra > ' ')|| (jTextFieldNombre.getText().length()>=50)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyTyped
        char letra = evt.getKeyChar();

        if ((letra < '0' || letra > '9') || (jTextFieldTelefono.getText().length()>=15)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldTelefonoKeyTyped

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        limpiar();
        cargarComboBox();
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
      int id =0;
        try {
                  id = Integer.parseInt(jTextFieldCodigo.getText());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Error en parseo - jButtonEliminarActionPerformed");
                }
        
        proveedorData.eliminarProveedor(id);
        limpiar();
        cargarComboBox();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (jTextFieldTelefono.getText().equals("")
                || jTextFieldNombre.getText().equals("")) {
            JOptionPane.showInternalMessageDialog(this, "Complete los campos vacíos", "Error", 0);
        } else {
            proveedor = new Proveedor();
            proveedor.setRazonSocial(jTextFieldNombre.getText());
            if (!jTextFieldCodigo.getText().equals("")) {
                try {
                   proveedor.setIdProveedor(Integer.parseInt(jTextFieldCodigo.getText())); 
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Error en parseo - metodo jButtonGuardarActionPerformed");
                }
                
            }
            proveedor.setDomicilio(jTextFieldDomicilio.getText());
            proveedor.setTelefono(jTextFieldTelefono.getText());
            proveedor.setActivo(true);
            proveedorData.guardarProveedor(proveedor);
            limpiar();
            cargarComboBox();
    }//GEN-LAST:event_jButtonGuardarActionPerformed
    }
    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void radioButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonCrearActionPerformed
        limpiar();
        jComboBox1.setEnabled(false);
        jTextFieldCodigo.setEnabled(false);
        jTextFieldCodigo.setEditable(false);
        jTextFieldNombre.setEnabled(true);
        jTextFieldNombre.setEditable(true);
        jTextFieldTelefono.setEnabled(true);
        jTextFieldTelefono.setEditable(true);
        jTextFieldDomicilio.setEnabled(true);
        jTextFieldDomicilio.setEditable(true);
        jButtonBuscar.setEnabled(false);

    }//GEN-LAST:event_radioButtonCrearActionPerformed

    private void radioButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonBuscarActionPerformed
        limpiar();
        jComboBox1.setEnabled(true);
        jTextFieldCodigo.setEnabled(true);
        jTextFieldCodigo.setEditable(true);
        jTextFieldNombre.setEnabled(false);
        jTextFieldNombre.setEditable(false);
        jTextFieldTelefono.setEnabled(false);
        jTextFieldTelefono.setEditable(false);
        jTextFieldDomicilio.setEnabled(false);
        jTextFieldDomicilio.setEditable(false);
        jButtonBuscar.setEnabled(true);


    }//GEN-LAST:event_radioButtonBuscarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedIndex() != 0) {
            proveedor = (Proveedor) jComboBox1.getSelectedItem();
            jButtonBuscar.setEnabled(true);
            jTextFieldCodigo.setText("");
        } else {
            jButtonBuscar.setEnabled(false);
            jTextFieldCodigo.setEditable(false);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextFieldCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyReleased
        activarBotonGuardar();
    }//GEN-LAST:event_jTextFieldCodigoKeyReleased

    private void jTextFieldNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyReleased
        activarBotonGuardar();
    }//GEN-LAST:event_jTextFieldNombreKeyReleased

    private void jTextFieldTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyReleased
        activarBotonGuardar();
    }//GEN-LAST:event_jTextFieldTelefonoKeyReleased

    private void jTextFieldDomicilioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDomicilioKeyReleased
        activarBotonGuardar();
    }//GEN-LAST:event_jTextFieldDomicilioKeyReleased

    private void jTextFieldDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDomicilioKeyTyped
        char letra = evt.getKeyChar();
        if ((letra < 'a' || letra > 'z') && (letra < 'A' || letra > 'Z') && (letra < ' ' || letra > ' ') && (letra < '\'' || letra > '9')|| (jTextFieldDomicilio.getText().length()>=50)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldDomicilioKeyTyped

    private void jTextFieldTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoFocusLost
        if (!jTextFieldTelefono.getText().equals("")) {
            try {
                Long.parseLong(jTextFieldTelefono.getText());

            } catch (NumberFormatException e) {
                jTextFieldTelefono.setText("");
                JOptionPane.showMessageDialog(this, "Solo se permiten numeros, intente nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextFieldTelefonoFocusLost

    private void jTextFieldNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNombreFocusLost
        String texto = jTextFieldNombre.getText();
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                jTextFieldNombre.setText("");
                JOptionPane.showMessageDialog(this, "Solo se permiten letras, intente nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);

                break;
            }
        }
    }//GEN-LAST:event_jTextFieldNombreFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<Object> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDomicilio;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JRadioButton radioButtonBuscar;
    private javax.swing.JRadioButton radioButtonCrear;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        jTextFieldNombre.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldDomicilio.setText("");
        jTextFieldCodigo.setText("");

        jComboBox1.setSelectedIndex(0);
        radioButtonBuscar.setSelected(false);
        radioButtonCrear.setSelected(false);
        jButtonEliminar.setEnabled(false);
        jButtonGuardar.setEnabled(false);
    }

    private void cargarComboBox() {

        jComboBox1.removeAllItems();
        jComboBox1.addItem("--Seleccione un Proveedor--");
        for (Object prove : proveedorData.listarProveedores()) {
            jComboBox1.addItem(prove);

        }
    }

    private void obtenerMateria() {
        if (jComboBox1.getSelectedIndex() != 0) {
            proveedor = (Proveedor) jComboBox1.getSelectedItem();
        } else {
            try {
                   proveedor = proveedorData.buscarProveedor(Integer.parseInt(jTextFieldCodigo.getText()));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Error en parseo - metodo obtenerMateria");
                }
            
        }
        if (proveedor != null) {
            jTextFieldTelefono.setText(proveedor.getTelefono() + "");
            jTextFieldNombre.setText(proveedor.getRazonSocial());
            jTextFieldCodigo.setText(proveedor.getIdProveedor() + "");
            jTextFieldDomicilio.setText(proveedor.getDomicilio() + "");

            jButtonEliminar.setEnabled(true);
        }
    }

    private void activarBotonGuardar() {
        if (radioButtonCrear.isSelected()) {
            if (!jTextFieldNombre.getText().isEmpty()
                    && !jTextFieldTelefono.getText().isEmpty()
                    && !jTextFieldDomicilio.getText().isEmpty()) {
                jButtonGuardar.setEnabled(true);

            } else {
                jButtonGuardar.setEnabled(false);
            }

        }
    }

}
