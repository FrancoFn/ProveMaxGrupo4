
package provemaxgrupo4.Vistas;


public class Menu extends javax.swing.JFrame {

  
    public Menu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        ButtonProveedor = new javax.swing.JButton();
        jBVentas = new javax.swing.JButton();
        jBGCompras = new javax.swing.JButton();
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
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ButtonProveedor.setText("PROVEEDOR");
        ButtonProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonProveedorActionPerformed(evt);
            }
        });

        jBVentas.setText("Ventas");
        jBVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVentasActionPerformed(evt);
            }
        });

        jBGCompras.setText("jButton2");
        jBGCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGComprasActionPerformed(evt);
            }
        });

        jButton2.setText("Prov2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jDesktopPane2.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(ButtonProveedor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jBVentas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jBGCompras, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ButtonProveedor))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBVentas))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jBGCompras))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jButton1)
                .addGap(80, 80, 80)
                .addComponent(ButtonProveedor)
                .addGap(66, 66, 66)
                .addComponent(jBVentas)
                .addGap(51, 51, 51)
                .addComponent(jBGCompras)
                .addGap(39, 39, 39)
                .addComponent(jButton2)
                .addContainerGap(295, Short.MAX_VALUE))
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
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionDeProductos gProd = new GestionDeProductos();
        gProd.setVisible(true);
        escritorio.add(gProd);
        escritorio.moveToFront(gProd);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ButtonProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonProveedorActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionDeProveedores proved = new GestionDeProveedores();
        proved.setVisible(true);
        escritorio.add(proved);
        escritorio.moveToFront(proved);
    }//GEN-LAST:event_ButtonProveedorActionPerformed

    private void jBVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVentasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionDeVentas gVentas = new GestionDeVentas();
        gVentas.setVisible(true);
        escritorio.add(gVentas);
        escritorio.moveToFront(gVentas);
    }//GEN-LAST:event_jBVentasActionPerformed

    private void jBGComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGComprasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionDeCompras gCompras = new GestionDeCompras();
        gCompras.setVisible(true);
        escritorio.add(gCompras);
        escritorio.moveToFront(gCompras);
    }//GEN-LAST:event_jBGComprasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ProveedorXProducto pxp = new ProveedorXProducto();
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
    private javax.swing.JButton ButtonProveedor;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jBGCompras;
    private javax.swing.JButton jBVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
