package provemaxgrupo4.Vistas;

public class Menu extends javax.swing.JFrame {

    GestionDeProductos gProd = new GestionDeProductos();
    GestionDeProveedores proved = new GestionDeProveedores();
    GestionDeVentas gVentas = new GestionDeVentas();
    GestionDeCompras gCompras = new GestionDeCompras();
    ProveedorXProducto pxp = new ProveedorXProducto();

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jBProducto = new javax.swing.JButton();
        jBProveedor = new javax.swing.JButton();
        jBVentas = new javax.swing.JButton();
        jBCompras = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(201, 242, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Blue White Modern Laundry Business Logo.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jDesktopPane2.setBackground(new java.awt.Color(201, 242, 255));
        jDesktopPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBProducto.setBackground(new java.awt.Color(201, 242, 255));
        jBProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBProducto.setForeground(new java.awt.Color(255, 255, 255));
        jBProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rectangle_10239536.png"))); // NOI18N
        jBProducto.setText("Producto");
        jBProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBProducto.setName(""); // NOI18N
        jBProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProductoActionPerformed(evt);
            }
        });

        jBProveedor.setBackground(new java.awt.Color(201, 242, 255));
        jBProveedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBProveedor.setForeground(new java.awt.Color(255, 255, 255));
        jBProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rectangle_10239536.png"))); // NOI18N
        jBProveedor.setText("Proveedor");
        jBProveedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBProveedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProveedorActionPerformed(evt);
            }
        });

        jBVentas.setBackground(new java.awt.Color(201, 242, 255));
        jBVentas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBVentas.setForeground(new java.awt.Color(255, 255, 255));
        jBVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rectangle_10239536.png"))); // NOI18N
        jBVentas.setText("Ventas");
        jBVentas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVentasActionPerformed(evt);
            }
        });

        jBCompras.setBackground(new java.awt.Color(201, 242, 255));
        jBCompras.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBCompras.setForeground(new java.awt.Color(255, 255, 255));
        jBCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rectangle_10239536.png"))); // NOI18N
        jBCompras.setText("Compras");
        jBCompras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBCompras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComprasActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rectangle_10239536.png"))); // NOI18N
        jButton2.setText("Catalogo");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jDesktopPane2.setLayer(jBProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jBProveedor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jBVentas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jBCompras, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jBVentas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jBProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
            .addComponent(escritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
