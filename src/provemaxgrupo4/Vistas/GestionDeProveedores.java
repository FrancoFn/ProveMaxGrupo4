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
        jLabel3 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldCodigo = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldDomicilio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        panelAbajo = new javax.swing.JPanel();
        panelCentral = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        radioButtonCrear = new javax.swing.JRadioButton();
        radioButtonBuscar = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButtonBuscar1 = new javax.swing.JButton();
        jTextFieldCodigo1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNombre1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldDomicilio1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldTelefono1 = new javax.swing.JTextField();
        panelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JpanelAbajo = new javax.swing.JPanel();
        JpanelBotones = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButtonNuevo = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Codigo:");

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
        jLabel6.setText("Telefono:");
        jLabel6.setPreferredSize(new java.awt.Dimension(60, 30));

        jTextFieldTelefono.setEnabled(false);
        jTextFieldTelefono.setPreferredSize(new java.awt.Dimension(220, 30));
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

        jTextFieldDomicilio.setEnabled(false);
        jTextFieldDomicilio.setPreferredSize(new java.awt.Dimension(220, 30));
        jTextFieldDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDomicilioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDomicilioKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Domicilio:");
        jLabel4.setPreferredSize(new java.awt.Dimension(60, 30));

        jTextFieldNombre.setEnabled(false);
        jTextFieldNombre.setPreferredSize(new java.awt.Dimension(220, 30));
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre:");
        jLabel2.setPreferredSize(new java.awt.Dimension(60, 30));

        setBackground(new java.awt.Color(201, 242, 255));
        setClosable(true);
        setIconifiable(true);

        panelAbajo.setBackground(new java.awt.Color(201, 242, 255));
        panelAbajo.setLayout(new java.awt.BorderLayout());

        panelCentral.setBackground(new java.awt.Color(201, 242, 255));
        panelCentral.setPreferredSize(new java.awt.Dimension(634, 400));

        jPanel10.setBackground(new java.awt.Color(201, 242, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(450, 400));

        radioButtonCrear.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        radioButtonCrear.setText("CREAR");
        radioButtonCrear.setOpaque(false);
        radioButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonCrearActionPerformed(evt);
            }
        });

        radioButtonBuscar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        radioButtonBuscar.setText("BUSCAR / ELIMINAR");
        radioButtonBuscar.setOpaque(false);
        radioButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonBuscarActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setEnabled(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButtonBuscar1.setBackground(new java.awt.Color(36, 135, 246));
        jButtonBuscar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jButtonBuscar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBuscar1.setContentAreaFilled(false);
        jButtonBuscar1.setOpaque(true);
        jButtonBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscar1ActionPerformed(evt);
            }
        });

        jTextFieldCodigo1.setEnabled(false);
        jTextFieldCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigo1ActionPerformed(evt);
            }
        });
        jTextFieldCodigo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCodigo1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCodigo1KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Codigo:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nombre:");

        jTextFieldNombre1.setEnabled(false);
        jTextFieldNombre1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNombre1FocusLost(evt);
            }
        });
        jTextFieldNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNombre1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombre1KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Domicilio:");

        jTextFieldDomicilio1.setEnabled(false);
        jTextFieldDomicilio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDomicilio1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDomicilio1KeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Telefono:");

        jTextFieldTelefono1.setEnabled(false);
        jTextFieldTelefono1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldTelefono1FocusLost(evt);
            }
        });
        jTextFieldTelefono1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTelefono1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefono1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(radioButtonCrear)
                            .addGap(46, 46, 46)
                            .addComponent(radioButtonBuscar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldCodigo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)))
                    .addComponent(jTextFieldDomicilio1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonBuscar)
                    .addComponent(radioButtonCrear))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldDomicilio1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCentral.add(jPanel10);

        panelAbajo.add(panelCentral, java.awt.BorderLayout.CENTER);

        panelTitulo.setBackground(new java.awt.Color(36, 135, 246));
        panelTitulo.setPreferredSize(new java.awt.Dimension(634, 50));

        jLabel1.setBackground(new java.awt.Color(36, 135, 246));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROVEEDORES");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
            .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelTituloLayout.createSequentialGroup()
                    .addGap(0, 254, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 254, Short.MAX_VALUE)))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelTituloLayout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 11, Short.MAX_VALUE)))
        );

        panelAbajo.add(panelTitulo, java.awt.BorderLayout.PAGE_START);

        JpanelAbajo.setPreferredSize(new java.awt.Dimension(599, 70));
        JpanelAbajo.setLayout(new java.awt.BorderLayout());

        JpanelBotones.setBackground(new java.awt.Color(201, 242, 255));
        JpanelBotones.setPreferredSize(new java.awt.Dimension(599, 50));
        JpanelBotones.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        jPanel3.setBackground(new java.awt.Color(201, 242, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        JpanelBotones.add(jPanel3);

        jButtonNuevo.setBackground(new java.awt.Color(36, 135, 246));
        jButtonNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevo.setText("LIMPIAR");
        jButtonNuevo.setPreferredSize(new java.awt.Dimension(90, 23));
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });
        JpanelBotones.add(jButtonNuevo);

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
        JpanelBotones.add(jButtonGuardar);

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
        JpanelBotones.add(jButtonEliminar);

        jButtonSalir.setBackground(new java.awt.Color(36, 135, 246));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("SALIR");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        JpanelBotones.add(jButtonSalir);

        jPanel1.setBackground(new java.awt.Color(201, 242, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        JpanelBotones.add(jPanel1);

        JpanelAbajo.add(JpanelBotones, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(201, 242, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(599, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        JpanelAbajo.add(jPanel2, java.awt.BorderLayout.SOUTH);

        panelAbajo.add(JpanelAbajo, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(panelAbajo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyTyped
        char letra = evt.getKeyChar();
        if ((letra < '0' || letra > '9') || (jTextFieldCodigo.getText().length() >= 11)) {
            evt.consume();
        } else {
            jComboBox1.setSelectedIndex(0);
            jTextFieldTelefono.setText("");
            jTextFieldNombre.setText("");
            jTextFieldDomicilio.setText("");
            jButtonBuscar.setEnabled(true);
        }
        if (jTextFieldCodigo.getText().isEmpty()) {
            jButtonEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_jTextFieldCodigoKeyTyped

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        obtenerProveeder();
        jTextFieldTelefono.setEnabled(true);
        jTextFieldNombre.setEnabled(true);
        jTextFieldDomicilio.setEnabled(true);

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        char letra = evt.getKeyChar();
        if ((letra < 'a' || letra > 'z') && (letra < 'A' || letra > 'Z') && (letra < ' ' || letra > ' ') || (jTextFieldNombre.getText().length() >= 50)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyTyped
        char letra = evt.getKeyChar();

        if ((letra < '0' || letra > '9') || (jTextFieldTelefono.getText().length() >= 15)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldTelefonoKeyTyped

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        limpiar();
        cargarComboBox();
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int id = 0;
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
                || jTextFieldNombre.getText().equals("")
                || jTextFieldDomicilio.getText().equals("")
                || (jTextFieldCodigo.getText().equals("") && jComboBox1.getSelectedIndex() == 0)) {
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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedIndex() != 0) {
            //proveedor = (Proveedor) jComboBox1.getSelectedItem();
            obtenerProveeder();
            jButtonBuscar.setEnabled(true);

            jTextFieldTelefono.setEnabled(true);
            jTextFieldNombre.setEnabled(true);
            jTextFieldDomicilio.setEnabled(true);
        } else {
            jButtonBuscar.setEnabled(false);
            limpiar();
            // jTextFieldCodigo.setEditable(false);
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
        if ((letra < 'a' || letra > 'z') && (letra < 'A' || letra > 'Z') && (letra < ' ' || letra > ' ') && (letra < '\'' || letra > '9') || (jTextFieldDomicilio.getText().length() >= 50)) {
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

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if (jComboBox1.getSelectedIndex() != 0) {
            //proveedor = (Proveedor) jComboBox1.getSelectedItem();
            obtenerProveeder();
            jButtonBuscar.setEnabled(true);

            jTextFieldTelefono.setEnabled(true);
            jTextFieldNombre.setEnabled(true);
            jTextFieldDomicilio.setEnabled(true);
        } else {
            jButtonBuscar.setEnabled(false);
            limpiar();
            // jTextFieldCodigo.setEditable(false);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButtonBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscar1ActionPerformed
        obtenerProveeder();
        jTextFieldTelefono.setEnabled(true);
        jTextFieldNombre.setEnabled(true);
        jTextFieldDomicilio.setEnabled(true);
    }//GEN-LAST:event_jButtonBuscar1ActionPerformed

    private void jTextFieldCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigo1ActionPerformed

    private void jTextFieldCodigo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigo1KeyReleased
        activarBotonGuardar();
    }//GEN-LAST:event_jTextFieldCodigo1KeyReleased

    private void jTextFieldCodigo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigo1KeyTyped
        char letra = evt.getKeyChar();
        if ((letra < '0' || letra > '9') || (jTextFieldCodigo.getText().length() >= 11)) {
            evt.consume();
        } else {
            jComboBox1.setSelectedIndex(0);
            jTextFieldTelefono.setText("");
            jTextFieldNombre.setText("");
            jTextFieldDomicilio.setText("");
            jButtonBuscar.setEnabled(true);
        }
        if (jTextFieldCodigo.getText().isEmpty()) {
            jButtonEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_jTextFieldCodigo1KeyTyped

    private void jTextFieldNombre1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNombre1FocusLost
        String texto = jTextFieldNombre.getText();
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                jTextFieldNombre.setText("");
                JOptionPane.showMessageDialog(this, "Solo se permiten letras, intente nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);

                break;
            }
        }
    }//GEN-LAST:event_jTextFieldNombre1FocusLost

    private void jTextFieldNombre1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombre1KeyReleased
        activarBotonGuardar();
    }//GEN-LAST:event_jTextFieldNombre1KeyReleased

    private void jTextFieldNombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombre1KeyTyped
        char letra = evt.getKeyChar();
        if ((letra < 'a' || letra > 'z') && (letra < 'A' || letra > 'Z') && (letra < ' ' || letra > ' ') || (jTextFieldNombre.getText().length() >= 50)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNombre1KeyTyped

    private void jTextFieldDomicilio1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDomicilio1KeyReleased
        activarBotonGuardar();
    }//GEN-LAST:event_jTextFieldDomicilio1KeyReleased

    private void jTextFieldDomicilio1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDomicilio1KeyTyped
        char letra = evt.getKeyChar();
        if ((letra < 'a' || letra > 'z') && (letra < 'A' || letra > 'Z') && (letra < ' ' || letra > ' ') && (letra < '\'' || letra > '9') || (jTextFieldDomicilio.getText().length() >= 50)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldDomicilio1KeyTyped

    private void jTextFieldTelefono1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldTelefono1FocusLost
        if (!jTextFieldTelefono.getText().equals("")) {
            try {
                Long.parseLong(jTextFieldTelefono.getText());

            } catch (NumberFormatException e) {
                jTextFieldTelefono.setText("");
                JOptionPane.showMessageDialog(this, "Solo se permiten numeros, intente nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextFieldTelefono1FocusLost

    private void jTextFieldTelefono1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefono1KeyReleased
        activarBotonGuardar();
    }//GEN-LAST:event_jTextFieldTelefono1KeyReleased

    private void jTextFieldTelefono1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefono1KeyTyped
        char letra = evt.getKeyChar();

        if ((letra < '0' || letra > '9') || (jTextFieldTelefono.getText().length() >= 15)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldTelefono1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelAbajo;
    private javax.swing.JPanel JpanelBotones;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonBuscar1;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<Object> jComboBox1;
    private javax.swing.JComboBox<Object> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldCodigo1;
    private javax.swing.JTextField jTextFieldDomicilio;
    private javax.swing.JTextField jTextFieldDomicilio1;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNombre1;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField jTextFieldTelefono1;
    private javax.swing.JPanel panelAbajo;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelTitulo;
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

    private void obtenerProveeder() {
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
