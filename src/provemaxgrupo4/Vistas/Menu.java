package provemaxgrupo4.Vistas;

import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {

    GestionDeProductos gProd = new GestionDeProductos();
    GestionDeProveedores proved = new GestionDeProveedores();
    GestionDeVentas gVentas = new GestionDeVentas();
    GestionDeCompras gCompras = new GestionDeCompras();
    ProveedorXProducto pxp = new ProveedorXProducto();

    public Menu() {
        initComponents();
         this.setIconImage(new ImageIcon(getClass().getResource("/img/logosinfondo2.png")).getImage());
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBProducto = new javax.swing.JButton();
        jBProveedor = new javax.swing.JButton();
        jBVentas = new javax.swing.JButton();
        jBCompras = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 600));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        escritorio.setBackground(new java.awt.Color(201, 242, 255));
        escritorio.setPreferredSize(new java.awt.Dimension(609, 600));

        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(500, 600));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Blue White Modern Laundry Business Logo.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 600));
        jPanel4.add(jLabel1, java.awt.BorderLayout.CENTER);

        escritorio.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );

        jPanel2.add(escritorio, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.GridLayout(5, 0));

        jBProducto.setBackground(new java.awt.Color(36, 135, 246));
        jBProducto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBProducto.setForeground(new java.awt.Color(255, 255, 255));
        jBProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hela.png"))); // NOI18N
        jBProducto.setText("PRODUCTOS");
        jBProducto.setAlignmentY(0.0F);
        jBProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBProducto.setDisabledSelectedIcon(null);
        jBProducto.setFocusable(false);
        jBProducto.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBProducto.setName(""); // NOI18N
        jBProducto.setPreferredSize(new java.awt.Dimension(200, 27));
        jBProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProductoActionPerformed(evt);
            }
        });
        jPanel3.add(jBProducto);

        jBProveedor.setBackground(new java.awt.Color(36, 135, 246));
        jBProveedor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBProveedor.setForeground(new java.awt.Color(255, 255, 255));
        jBProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prove.png"))); // NOI18N
        jBProveedor.setText("PROVEEDORES");
        jBProveedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBProveedor.setFocusable(false);
        jBProveedor.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBProveedor.setMaximumSize(new java.awt.Dimension(189, 67));
        jBProveedor.setMinimumSize(new java.awt.Dimension(189, 67));
        jBProveedor.setPreferredSize(new java.awt.Dimension(230, 67));
        jBProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProveedorActionPerformed(evt);
            }
        });
        jPanel3.add(jBProveedor);

        jBVentas.setBackground(new java.awt.Color(36, 135, 246));
        jBVentas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBVentas.setForeground(new java.awt.Color(255, 255, 255));
        jBVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventasla.png"))); // NOI18N
        jBVentas.setText("VENTAS");
        jBVentas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBVentas.setFocusable(false);
        jBVentas.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBVentas.setPreferredSize(new java.awt.Dimension(55, 19));
        jBVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVentasActionPerformed(evt);
            }
        });
        jPanel3.add(jBVentas);
        jBVentas.getAccessibleContext().setAccessibleDescription("");

        jBCompras.setBackground(new java.awt.Color(36, 135, 246));
        jBCompras.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBCompras.setForeground(new java.awt.Color(255, 255, 255));
        jBCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compras.png"))); // NOI18N
        jBCompras.setText("COMPRAS A PROVEEDOR");
        jBCompras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBCompras.setFocusable(false);
        jBCompras.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBCompras.setPreferredSize(new java.awt.Dimension(330, 107));
        jBCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComprasActionPerformed(evt);
            }
        });
        jPanel3.add(jBCompras);

        jButton2.setBackground(new java.awt.Color(36, 135, 246));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/catal.png"))); // NOI18N
        jButton2.setText(" CATALOGO PROVEEDOR");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jPanel1.add(jPanel3, java.awt.BorderLayout.WEST);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //   escritorio.removeAll();
        escritorio.remove(gProd);
        escritorio.remove(proved);
        escritorio.remove(gVentas);
        escritorio.remove(gCompras);
        escritorio.remove(pxp);
        escritorio.repaint();
        //   ProveedorXProducto pxp = new ProveedorXProducto();
        pxp.setVisible(true);
        escritorio.add(pxp);
        escritorio.moveToFront(pxp);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComprasActionPerformed
        //  escritorio.removeAll();
        escritorio.remove(gProd);
        escritorio.remove(proved);
        escritorio.remove(gVentas);
        escritorio.remove(gCompras);
        escritorio.remove(pxp);
        escritorio.repaint();
        //  GestionDeCompras gCompras = new GestionDeCompras();
        gCompras.setVisible(true);
        escritorio.add(gCompras);
        escritorio.moveToFront(gCompras);
    }//GEN-LAST:event_jBComprasActionPerformed

    private void jBVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVentasActionPerformed
        // escritorio.removeAll();
        escritorio.remove(gProd);
        escritorio.remove(proved);
        escritorio.remove(gVentas);
        escritorio.remove(gCompras);
        escritorio.remove(pxp);
        escritorio.repaint();
        //  GestionDeVentas gVentas = new GestionDeVentas();
        gVentas.setVisible(true);
        escritorio.add(gVentas);
        escritorio.moveToFront(gVentas);
    }//GEN-LAST:event_jBVentasActionPerformed

    private void jBProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProveedorActionPerformed
        //escritorio.removeAll();
        escritorio.remove(gProd);
        escritorio.remove(proved);
        escritorio.remove(gVentas);
        escritorio.remove(gCompras);
        escritorio.remove(pxp);
        escritorio.repaint();
        //  GestionDeProveedores proved = new GestionDeProveedores();
        proved.setVisible(true);
        escritorio.add(proved);
        escritorio.moveToFront(proved);
    }//GEN-LAST:event_jBProveedorActionPerformed

    private void jBProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProductoActionPerformed
        //   escritorio.removeAll();
        escritorio.remove(gProd);
        escritorio.remove(proved);
        escritorio.remove(gVentas);
        escritorio.remove(gCompras);
        escritorio.remove(pxp);
        escritorio.repaint();
        // GestionDeProductos gProd = new GestionDeProductos();
        gProd.setVisible(true);
        escritorio.add(gProd);
        escritorio.moveToFront(gProd);
    }//GEN-LAST:event_jBProductoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jBCompras;
    private javax.swing.JButton jBProducto;
    private javax.swing.JButton jBProveedor;
    private javax.swing.JButton jBVentas;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
