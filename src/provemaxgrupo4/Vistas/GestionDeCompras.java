//Luli me dio ideas
package provemaxgrupo4.Vistas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import provemaxgrupo4.AccesoADatos.CompraData;
import provemaxgrupo4.AccesoADatos.ProdXProvData;
import provemaxgrupo4.AccesoADatos.ProductoData;
import provemaxgrupo4.AccesoADatos.ProveedorData;
import provemaxgrupo4.Entidades.Compra;
import provemaxgrupo4.Entidades.Producto;
import provemaxgrupo4.Entidades.Proveedor;


public class GestionDeCompras extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    DefaultComboBoxModel combo = new DefaultComboBoxModel();
    SpinnerModel modelsp = new SpinnerNumberModel();

    ProductoData pData = new ProductoData();
    List<Producto> prodList;
    List<Proveedor> provList;
    ProveedorData provData = new ProveedorData();
    CompraData cData = new CompraData();
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MMM-dd");
    DateTimeFormatter format = new DateTimeFormatterBuilder().append(DateTimeFormatter.ofPattern("dd-MMM-yyyy")).toFormatter();
    SimpleDateFormat formate = new SimpleDateFormat("dd-MMM-yyyy");
    LocalDate fecha;
    private DefaultTableModel modelo1 = new DefaultTableModel();
    int idProd;
    int spinner;
    Producto prod = new Producto();
    ProdXProvData pxpData = new ProdXProvData();

    public GestionDeCompras() {
        initComponents();
        modelo = (DefaultTableModel) this.jTable1.getModel();
        modelo1 = (DefaultTableModel) this.jTable2.getModel();
        //  listarProductos();
        comboProv();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCProv = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBSeleccionar = new javax.swing.JButton();

        setBackground(new java.awt.Color(201, 242, 255));

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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Marca", "Precio"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jCProv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCProvActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Marca", "Stock", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jButton1.setBackground(new java.awt.Color(36, 135, 246));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Generar Compra");
        jButton1.setPreferredSize(new java.awt.Dimension(117, 46));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion de Compras");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Fecha:");

        jButton2.setBackground(new java.awt.Color(36, 135, 246));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Facturas Antiguas");
        jButton2.setPreferredSize(new java.awt.Dimension(117, 46));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("N° de Compra");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("               ");
        jLabel4.setToolTipText("");

        jBSeleccionar.setBackground(new java.awt.Color(36, 135, 246));
        jBSeleccionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        jBSeleccionar.setText("Seleccionar");
        jBSeleccionar.setPreferredSize(new java.awt.Dimension(115, 46));
        jBSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCProv, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jCProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jBSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        crearCompra();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSeleccionarActionPerformed
        pasarProducto();
    }//GEN-LAST:event_jBSeleccionarActionPerformed

    private void jCProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCProvActionPerformed
        if (jCProv.getSelectedIndex() != 0) {
            listarColumna();
        } else {
            limpiarFilas();
        }
    }//GEN-LAST:event_jCProvActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSeleccionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCProv;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
private void limpiarFilas() {
        int filas = modelo1.getRowCount();
        for (int i = 0; i < filas; i++) {

            modelo1.removeRow(0);
        }
    }

    public void listarProductos() {
        modelo.setRowCount(0);
        prodList = pData.listarProductos();
        for (Producto producto : prodList) {
            modelo.addRow(new Object[]{producto.getIdProducto(), producto.getNombreProducto(), producto.getDescripcion(),
                producto.getStock(), producto.getPrecioActual()});
        }
    }

    public void listarColumna() {
        modelo.setRowCount(0);

        Proveedor proveedor = (Proveedor) jCProv.getSelectedItem();
        prodList = pxpData.listarProductosPorID(proveedor.getIdProveedor());

        for (Producto producto : prodList) {
            modelo.addRow(new Object[]{producto.getIdProducto(), producto.getNombreProducto(), producto.getDescripcion(),
                producto.getPrecioActual()});
        }
    }

    public void comboProv() {

        provList = provData.listarProveedores();
        combo.addElement("--- Lista de Proveedores ---");
        for (Proveedor prov : provList) {
            combo.addElement(prov);
        }
        jCProv.setModel(combo);
    }

    public void crearCompra() {

        if (jCProv.getSelectedIndex() == 0 || jDateChooser1.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Complete los campos requeridos");
        } else {
            getFecha();
            Compra compra = new Compra();
            System.out.println(fecha);
            compra.setFechaCompra(fecha);
            Proveedor proveedor = (Proveedor) jCProv.getSelectedItem();
            compra.setProveedor(proveedor);
            cData.insertarCompra(compra);
        }

    }

    public void getFecha() {
        String fechaString = formato.format(jDateChooser1.getDate());
        DateTimeFormatter format = new DateTimeFormatterBuilder().append(DateTimeFormatter.ofPattern("yyyy-MMM-dd")).toFormatter();
        this.fecha = LocalDate.parse(fechaString, format);
        System.out.println(fecha);
    }

    public void pasarProducto() {

        int selectedRow = jTable1.getSelectedRow();
        spinneR();
        if (selectedRow != -1 && spinner > 0) {
            Object value = modelo.getValueAt(selectedRow, 0);
            idProd = Integer.parseInt(value.toString());
            listarColumnaCompra();
            System.out.println("Valor de la primera columna: " + value.toString());
        } else {
            System.out.println("Ninguna fila seleccionada.");
        }
    }

    public void listarColumnaCompra() {
        prodList = pData.listarProductosPorID(idProd);
        for (Producto producto : prodList) {
            modelo1.addRow(new Object[]{producto.getIdProducto(), producto.getNombreProducto(), producto.getDescripcion(),
                spinner, producto.getPrecioActual()});
            prod.setIdProducto(producto.getIdProducto());
            prod.setNombreProducto(producto.getNombreProducto());
            prod.setDescripcion(producto.getDescripcion());
            prod.setPrecioActual(producto.getPrecioActual());
            prod.setStock(producto.getStock() + spinner);
            pData.modificarProducto(prod);
        }

        listarColumna();
    }

    public void spinneR() {
        SpinnerModel model = jSpinner1.getModel();
        Object value = model.getValue();
        spinner = (int) value;
    }

}
