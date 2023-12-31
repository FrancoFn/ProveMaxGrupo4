
package provemaxgrupo4.Vistas;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import provemaxgrupo4.AccesoADatos.ProdXProvData;
import provemaxgrupo4.AccesoADatos.ProductoData;
import provemaxgrupo4.AccesoADatos.ProveedorData;
import provemaxgrupo4.Entidades.Producto;
import provemaxgrupo4.Entidades.Proveedor;


public class ProveedorXProducto extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel(null,
            new String [] {
                "ID", "Nombre", "Marca", "Precio"
            }
        ){
        @Override
        public boolean isCellEditable(int i, int i1) {
            return false; 
        }
        
    };
    DefaultTableModel modelo1 = new DefaultTableModel(null,
            new String [] {
                "ID", "Nombre", "Marca", "Precio"
            }
        ){
        @Override
        public boolean isCellEditable(int i, int i1) {
            return false; 
        }
        
    };
    DefaultComboBoxModel combo = new DefaultComboBoxModel();
    ProductoData pData = new ProductoData();
    ProveedorData provData = new ProveedorData();
    ProdXProvData pxpData = new ProdXProvData();
    List<Producto> prodList;
    List<Proveedor> provList;
    int idProd;
    int idProv;

    
    public ProveedorXProducto() {
        initComponents();
//        modelo = (DefaultTableModel) this.jTable2.getModel();
jTable2.setModel(modelo);
//        modelo1 = (DefaultTableModel) this.jTable3.getModel();
jTable3.setModel(modelo1);
        comboProv();
        listarProductos();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jCProv = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jBSeleccionar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(201, 242, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        jCProv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCProvActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable3);

        jBSeleccionar.setBackground(new java.awt.Color(36, 135, 246));
        jBSeleccionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        jBSeleccionar.setText("SELECCIONAR");
        jBSeleccionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBSeleccionar.setPreferredSize(new java.awt.Dimension(117, 46));
        jBSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSeleccionarActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(36, 135, 246));
        jBEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminar.setText("ELIMINAR");
        jBEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBEliminar.setPreferredSize(new java.awt.Dimension(117, 46));
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(36, 135, 246));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MERCADERIA DE PROVEEDORES");
        jLabel1.setOpaque(true);

        jButton1.setBackground(new java.awt.Color(36, 135, 246));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ACTUALIZAR");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LISTADO DE PRODUCTOS GENERAL ");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LISTADO DE PRODUCTOS ASIGNADOS A PROVEEDOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jCProv, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jCProv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(15, 15, 15))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSeleccionarActionPerformed
        pasarProducto();
        listarColumna();
    }//GEN-LAST:event_jBSeleccionarActionPerformed

    private void jCProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCProvActionPerformed
        if (jCProv.getSelectedIndex() != 0) {
            listarColumna();
        } else {
            limpiarFilas();
        }
    }//GEN-LAST:event_jCProvActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        eliminarProducto();
        listarColumna();
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        listarProductos();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBSeleccionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCProv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
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

    public void creadProdXProv() {

    }

    public void pasarProducto() {

        int selectedRow = jTable2.getSelectedRow();
        if (selectedRow != -1 && jCProv.getSelectedIndex() != 0) {
            Proveedor proveedor = (Proveedor) jCProv.getSelectedItem();
            idProv = proveedor.getIdProveedor();
            Object value = modelo.getValueAt(selectedRow, 0);
            idProd = Integer.parseInt(value.toString());
            pxpData.guardarProdXProv(idProv, idProd);
            listarColumna();
        } else {
            System.out.println("Ninguna fila seleccionada.");
        }
    }

    public void listarColumna() {
        modelo1.setRowCount(0);
        limpiarFilas();
        Proveedor proveedor = (Proveedor) jCProv.getSelectedItem();
        prodList = pxpData.listarProductosPorID(proveedor.getIdProveedor());
        for (Producto producto : prodList) {
            int idProducto = producto.getIdProducto();
            // Comprobar si el ID ya está en la tabla
            if (!contieneID(modelo1, idProducto)) {
                modelo1.addRow(new Object[]{idProducto, producto.getNombreProducto(), producto.getDescripcion(), producto.getPrecioActual()});
            }
        }
    }

// Método para verificar si el ID ya está en la tabla
    private boolean contieneID(DefaultTableModel modelo, int id) {
        for (int fila = 0; fila < modelo.getRowCount(); fila++) {
            int idEnTabla = (int) modelo.getValueAt(fila, 0);
            if (idEnTabla == id) {
                return true;
            }
        }
        return false;
    }

    public void eliminarProducto() {

        int selectedRow = jTable3.getSelectedRow();
        if (selectedRow != -1 && jCProv.getSelectedIndex() != 0) {
            Proveedor proveedor = (Proveedor) jCProv.getSelectedItem();
            idProv = proveedor.getIdProveedor();
            Object value = modelo1.getValueAt(selectedRow, 0);
            idProd = Integer.parseInt(value.toString());
            pxpData.eliminarPxp(idProv, idProd);
            listarColumna();
        } else {
            System.out.println("Ninguna fila seleccionada.");
        }
    }

}
