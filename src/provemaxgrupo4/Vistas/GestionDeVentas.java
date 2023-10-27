package provemaxgrupo4.Vistas;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import provemaxgrupo4.AccesoADatos.ProductoData;
import provemaxgrupo4.AccesoADatos.VentasData;
import provemaxgrupo4.Entidades.Producto;
import provemaxgrupo4.Entidades.Ventas;

public class GestionDeVentas extends javax.swing.JInternalFrame {

    List<Producto> producto;
    ArrayList<Producto> produc = new ArrayList<Producto>();
    //Producto producto = new Producto();
    ProductoData pData = new ProductoData();
    DefaultComboBoxModel combo = new DefaultComboBoxModel();
    DefaultComboBoxModel combo1 = new DefaultComboBoxModel();
    DefaultComboBoxModel combo2 = new DefaultComboBoxModel();
    private DefaultTableModel modelo = new DefaultTableModel(null,
            
            new String [] {
                "ID", "Nombre", "Descripcion", "Precio"
            }
        ){
        @Override
        public boolean isCellEditable(int i, int i1) {
            return false; 
        }
        
    };
    double interes;
    VentasData vData = new VentasData();
    double total;
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;
    Ventas nF = new Ventas();

    public GestionDeVentas() {
        initComponents();
//        modelo.addColumn(null ,new String [] {
//                "ID", "Nombre", "Descripcion", "Precio"
////            });
        jTable1.setModel(modelo);
        //modelo = (DefaultTableModel) this.jTable1.getModel();
        limpiarDatos();
        limpiarTabla();
        comboProd();
        mPago();
        cuotaS();
        nFactura();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBPDF = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLNFactura = new javax.swing.JLabel();
        panelDatosComprador = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTTelefono = new javax.swing.JTextField();
        jTDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        panelCargadeproductos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCProductos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jCMedioPago = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jCCuotas = new javax.swing.JComboBox<>();
        jBAgregar = new javax.swing.JButton();

        setBackground(new java.awt.Color(201, 242, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(736, 560));

        panelTitulo.setPreferredSize(new java.awt.Dimension(720, 40));

        jLabel10.setBackground(new java.awt.Color(51, 102, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("FACTURACIÓN");
        jLabel10.setOpaque(true);

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        getContentPane().add(panelTitulo, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(201, 242, 255));

        jPanel1.setBackground(new java.awt.Color(201, 242, 255));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Precio"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        jBPDF.setBackground(new java.awt.Color(36, 135, 246));
        jBPDF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBPDF.setForeground(new java.awt.Color(255, 255, 255));
        jBPDF.setText(" GENERAR FACTURA");
        jBPDF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBPDF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPDFActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Factura N°:");

        jLNFactura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        panelDatosComprador.setBackground(new java.awt.Color(201, 242, 255));

        labelNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNombre.setText("Nombre:");

        labelApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelApellido.setText("Apellido:");

        labelTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTelefono.setText("Telefono:");

        labelDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDireccion.setText("Direccion:");

        jTNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        jTApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTApellidoFocusLost(evt);
            }
        });
        jTApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTApellidoKeyTyped(evt);
            }
        });

        jTTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTTelefonoFocusLost(evt);
            }
        });
        jTTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTTelefonoKeyTyped(evt);
            }
        });

        jTDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTDireccionKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DATOS DEL COMPRADOR");

        javax.swing.GroupLayout panelDatosCompradorLayout = new javax.swing.GroupLayout(panelDatosComprador);
        panelDatosComprador.setLayout(panelDatosCompradorLayout);
        panelDatosCompradorLayout.setHorizontalGroup(
            panelDatosCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosCompradorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelDatosCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelApellido)
                    .addComponent(labelNombre))
                .addGap(33, 33, 33)
                .addGroup(panelDatosCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(jTApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatosCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTelefono)
                    .addComponent(labelDireccion))
                .addGap(26, 26, 26)
                .addGroup(panelDatosCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTTelefono)
                    .addComponent(jTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelDatosCompradorLayout.setVerticalGroup(
            panelDatosCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosCompradorLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosCompradorLayout.createSequentialGroup()
                        .addGroup(panelDatosCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombre)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDatosCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelApellido)))
                    .addGroup(panelDatosCompradorLayout.createSequentialGroup()
                        .addGroup(panelDatosCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDatosCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDireccion)
                            .addComponent(jTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCargadeproductos.setBackground(new java.awt.Color(201, 242, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CARGA DE PRODUCTOS");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Producto:");

        jCProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Medio de pago:");

        jCMedioPago.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCMedioPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Cuotas:");

        jCCuotas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCCuotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBAgregar.setBackground(new java.awt.Color(36, 135, 246));
        jBAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jBAgregar.setText("AGREGAR PRODUCTO");
        jBAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCargadeproductosLayout = new javax.swing.GroupLayout(panelCargadeproductos);
        panelCargadeproductos.setLayout(panelCargadeproductosLayout);
        panelCargadeproductosLayout.setHorizontalGroup(
            panelCargadeproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCargadeproductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCargadeproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCargadeproductosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54)
                        .addComponent(jCProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCargadeproductosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22)
                        .addComponent(jCMedioPago, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCCuotas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jBAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCargadeproductosLayout.setVerticalGroup(
            panelCargadeproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCargadeproductosLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCargadeproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCargadeproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCCuotas)
                    .addGroup(panelCargadeproductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jCMedioPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(509, Short.MAX_VALUE)
                .addComponent(jBPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLNFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelDatosComprador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelCargadeproductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(25, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(424, Short.MAX_VALUE)
                .addComponent(jBPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLNFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panelDatosComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panelCargadeproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(128, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        if (jCProductos.getSelectedIndex() > 0 && jCCuotas.getSelectedIndex() > 0 && jCMedioPago.getSelectedIndex() > 0) {
            cargarProducto();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione las opciones correspondientes", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPDFActionPerformed
        if (jTNombre.getText().isEmpty() || jTApellido.getText().isEmpty() || jTDireccion.getText().isEmpty() || jTTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            crearPlantilla();
            JOptionPane.showMessageDialog(this, "Puede encontrar su factura en\n /OneDrive/Documentos/Factura Ventas", "DESCARGA EXITOSA", JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/img/tilde2.png")));
        }
    }//GEN-LAST:event_jBPDFActionPerformed

    private void jTNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombreKeyTyped
        char letra = evt.getKeyChar();
        if ((letra < 'a' || letra > 'z') && (letra < 'A' || letra > 'Z') && (letra < ' ' || letra > ' ') || (jTNombre.getText().length() >= 50)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTNombreKeyTyped

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

    private void jTApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTApellidoKeyTyped
       char letra = evt.getKeyChar();
        if ((letra < 'a' || letra > 'z') && (letra < 'A' || letra > 'Z') && (letra < ' ' || letra > ' ') || (jTApellido.getText().length() >= 50)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTApellidoKeyTyped

    private void jTApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTApellidoFocusLost
        String texto = jTNombre.getText();
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                jTNombre.setText("");
                JOptionPane.showMessageDialog(this, "Solo se permiten letras, intente nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);

                break;
            }
        }
    }//GEN-LAST:event_jTApellidoFocusLost

    private void jTTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTTelefonoKeyTyped
         char letra = evt.getKeyChar();

        if ((letra < '0' || letra > '9') || (jTTelefono.getText().length() >= 15)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTTelefonoKeyTyped

    private void jTTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTTelefonoFocusLost
        if (!jTTelefono.getText().equals("")) {
            try {
                Long.parseLong(jTTelefono.getText());

            } catch (NumberFormatException e) {
                jTTelefono.setText("");
                JOptionPane.showMessageDialog(this, "Solo se permiten numeros, intente nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTTelefonoFocusLost

    private void jTDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDireccionKeyTyped
        char letra = evt.getKeyChar();
        if ((letra < 'a' || letra > 'z') && (letra < 'A' || letra > 'Z') && (letra < ' ' || letra > ' ') && (letra < '\'' || letra > '9') || (jTDireccion.getText().length() >= 50)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTDireccionKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBPDF;
    private javax.swing.JComboBox<String> jCCuotas;
    private javax.swing.JComboBox<String> jCMedioPago;
    private javax.swing.JComboBox<String> jCProductos;
    private javax.swing.JLabel jLNFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTTelefono;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JPanel panelCargadeproductos;
    private javax.swing.JPanel panelDatosComprador;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables

    public void validacion2() {
        String texto = jTNombre.getText();
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                jTNombre.setText("");
                JOptionPane.showMessageDialog(this, "Solo se permiten letras, intente nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);

                break;
            }
        }
    }

    public void comboProd() {

        this.producto = pData.listarProductos();
        combo.addElement("--- Lista de Productos ---");
        for (Producto prod : producto) {
            combo.addElement(prod);
        }
        jCProductos.setModel(combo);
    }

    public void mPago() {
        combo1.addElement("--- Lista de Tarjetas ---");
        combo1.addElement("Visa");
        combo1.addElement("Mastercard");
        combo1.addElement("Naranja");
        combo1.addElement("American Express");
        jCMedioPago.setModel(combo1);
    }

    public void cuotaS() {
        combo2.addElement("--- Lista de Cuotas ---");
        combo2.addElement(1);
        combo2.addElement(3);
        combo2.addElement(6);
        combo2.addElement(12);
        combo2.addElement(24);
        jCCuotas.setModel(combo2);
    }

    private void interesX() {
        if (jCCuotas.getSelectedIndex() == 1) {
            interes = 0.8;
        } else if (jCCuotas.getSelectedIndex() == 2) {
            interes = 1.25;
        } else if (jCMedioPago.getSelectedIndex() == 1 && jCCuotas.getSelectedIndex() == 2) {
            interes = 1;
        } else if (jCCuotas.getSelectedIndex() == 3) {
            interes = 1.50;
        } else if (jCCuotas.getSelectedIndex() == 4) {
            interes = 2;
        } else if (jCCuotas.getSelectedIndex() == 5) {
            interes = 4;
        }

    }

    private void cargarProducto() {
        //FUNCIONA
        interesX();
        Producto prodT = (Producto) jCProductos.getSelectedItem();
        //producto = pData.listarProductosPorID(prodT.getIdProducto());
        double precio = prodT.getPrecioActual() * interes;
        //   prodT.setPrecioActual(precio);
        modelo.addRow(new Object[]{prodT.getIdProducto(), prodT.getNombreProducto(), prodT.getDescripcion(),
            ("$ " + precio)});
        produc.add(prodT);

        total += precio;

    }

    public void limpiarDatos() {
        jTNombre.setText("");
        jTApellido.setText("");
        jTDireccion.setText("");
        jTTelefono.setText("");
    }

    public void limpiarTabla() {
        modelo.setRowCount(0);
    }

    public void nFactura() {
        Ventas nF = vData.Nfact();
        jLNFactura.setText((nF.getNventa() + 1) + "");
        if (nF.getNventa() == 0) {
            jLNFactura.setText(1 + "");
        }
    }

    public void crearPlantilla() {
        VentasData ventas = new VentasData();
        String nombrefact = (jLNFactura.getText() + " " + jTNombre.getText());
        ventas.insertarVenta(nombrefact);
        String nombreArchivo = jLNFactura.getText() + "_" + jTNombre.getText() + ".pdf";
        try {
            String ruta = System.getProperty("user.home");
            String crear = ruta + "\\OneDrive\\Documentos\\Factura Ventas\\";
            File carpeta = new File(crear);
            if (!carpeta.exists()) {
                if (carpeta.mkdirs()) {
                    System.out.println("Directorio creado");
                } else {
                    System.out.println("Error al crear directorio");
                }
            }
            documento = new Document();
            archivo = new FileOutputStream(ruta + "/OneDrive/Documentos/Factura Ventas/" + nombreArchivo);
            vData.CrearDoc(documento, archivo, jTNombre.getText(), jTApellido.getText(), Long.parseLong(jTTelefono.getText()), jTDireccion.getText(), jLNFactura.getText());
            PdfPTable tabla = new PdfPTable(4);
            tabla.setWidthPercentage(100);
            PdfPCell id = new PdfPCell(new Phrase("ID"));
            PdfPCell nombre = new PdfPCell(new Phrase("Nombre"));
            PdfPCell descripcion = new PdfPCell(new Phrase("Descripcion"));
            PdfPCell precio = new PdfPCell(new Phrase("Precio"));
            tabla.addCell(id);
            tabla.addCell(nombre);
            tabla.addCell(descripcion);
            tabla.addCell(precio);
            try {
                modelo.setRowCount(0);
                for (Producto pr : produc) {
                    tabla.addCell(pr.getIdProducto() + "");
                    tabla.addCell(pr.getNombreProducto());
                    tabla.addCell(pr.getDescripcion());
                    tabla.addCell("$ " + pr.getPrecioActual());
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, " Error no funciona " + ex.getMessage());
            }
            tabla.addCell("Total");
            tabla.addCell("");
            tabla.addCell("");
            tabla.addCell("$ " + total);
            documento.add(tabla);
            documento.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (DocumentException e) {
            System.err.println(e.getMessage());
        }
        modelo.setRowCount(0);
        nFactura();
    }

}
