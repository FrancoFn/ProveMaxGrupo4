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
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import provemaxgrupo4.AccesoADatos.ProductoData;
import provemaxgrupo4.AccesoADatos.VentasData;
import provemaxgrupo4.Entidades.Producto;
import provemaxgrupo4.Entidades.Ventas;


public class GestionDeVentas extends javax.swing.JInternalFrame {
    List<Producto> producto;
     ArrayList<Producto> produc= new ArrayList<Producto>();
    //Producto producto = new Producto();
    ProductoData pData = new ProductoData();
    DefaultComboBoxModel combo = new DefaultComboBoxModel();
    DefaultComboBoxModel combo1 = new DefaultComboBoxModel();
    DefaultComboBoxModel combo2 = new DefaultComboBoxModel();
    private DefaultTableModel modelo = new DefaultTableModel();
    double interes;
    VentasData vData = new VentasData();
    
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;
    
    
    public GestionDeVentas() {
        initComponents();
        modelo = (DefaultTableModel) this.jTable1.getModel();
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

        jCProductos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCMedioPago = new javax.swing.JComboBox<>();
        jBAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jCCuotas = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTTelefono = new javax.swing.JTextField();
        jTDireccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLNFactura = new javax.swing.JLabel();

        jCProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCProductosActionPerformed(evt);
            }
        });

        jLabel1.setText("Producto:");

        jLabel2.setText("Medio de pago:");

        jCMedioPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCMedioPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCMedioPagoActionPerformed(evt);
            }
        });

        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        jLabel5.setText("Cuotas:");

        jCCuotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCCuotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCCuotasActionPerformed(evt);
            }
        });

        jButton2.setText("Generar Factura");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre:");

        jLabel7.setText("Apellido:");

        jLabel8.setText("Telefono:");

        jLabel9.setText("Direccion:");

        jTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreActionPerformed(evt);
            }
        });

        jLabel10.setText("Gestion de Compras");

        jLabel3.setText("Factura N°:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCMedioPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBAgregar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jTNombre)
                                    .addComponent(jTTelefono)
                                    .addComponent(jTDireccion)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLNFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(222, 222, 222)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel3))
                    .addComponent(jLNFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCMedioPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jCCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBAgregar)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreActionPerformed

    private void jCProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCProductosActionPerformed

    private void jCMedioPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCMedioPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCMedioPagoActionPerformed

    private void jCCuotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCCuotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCCuotasActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
     cargarProducto();
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       crearPlantilla();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCCuotas;
    private javax.swing.JComboBox<String> jCMedioPago;
    private javax.swing.JComboBox<String> jCProductos;
    private javax.swing.JLabel jLNFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTTelefono;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

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
    private void interesX(){
        if(jCCuotas.getSelectedIndex()==0){
          interes=0.8;
        }else if(jCCuotas.getSelectedIndex()==1){
            interes=1.25;
        }else if(jCMedioPago.getSelectedIndex()==0 && jCCuotas.getSelectedIndex()==1){
            interes=1;
        }else if(jCCuotas.getSelectedIndex()==2){
            interes=1.50;
         }else if(jCCuotas.getSelectedIndex()==3){
            interes=2;
         }else if(jCCuotas.getSelectedIndex()==4){
            interes=4;
        }

        
    }
     private void cargarProducto() {
        //FUNCIONA
         interesX();
         System.out.println(interes);
        Producto prodT = (Producto) jCProductos.getSelectedItem();
            producto = pData.listarProductosActivos(1);
            for (Producto prod : producto) {
                double precio=prod.getPrecioActual()*interes;
                prod.setPrecioActual(precio);
                modelo.addRow(new Object[]{prod.getIdProducto(), prod.getNombreProducto(), prod.getDescripcion(),
                    (prod.getPrecioActual())});
                
                produc.add(prod);
            }
        
    }
    public void limpiarDatos(){
       jTNombre.setText("");
       jTApellido.setText("");
       jTDireccion.setText("");
       jTTelefono.setText("");
    }
    public void limpiarTabla(){
       modelo.setRowCount(0); 
    }
    
    public void nFactura(){
      Ventas nF=vData.Nfact();
      if (nF.getNventa()==0){
          jLNFactura.setText(1+"");
      }else{
       jLNFactura.setText((nF.getNventa()+1)+"");  
    }}
    
    
    public void crearPlantilla() {
       String nombreArchivo = jLNFactura.getText()+"_"+jTNombre.getText()+ ".pdf";    
        try {           
            String ruta = System.getProperty("user.home");
            System.out.println(ruta);
            String crear = ruta + "\\OneDrive\\Documentos\\Factura Ventas\\";
            System.out.println(crear);
            File carpeta = new File(crear);
            if (!carpeta.exists()) {
                if (carpeta.mkdirs()) {
                    System.out.println("Directorio creado");
                } else {
                    System.out.println("Error al crear directorio");
                }
            }
            System.out.println(nombreArchivo);
            documento = new Document();
            archivo = new FileOutputStream(ruta + "/OneDrive/Documentos/Factura Ventas/" + nombreArchivo);  
            vData.CrearDoc(documento, archivo, jTNombre.getText(), jTApellido.getText(), Integer.parseInt(jTTelefono.getText()), jTDireccion.getText(),jLNFactura.getText());
            System.out.println("lalala");
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
                    tabla.addCell(pr.getIdProducto()+"");
                    tabla.addCell(pr.getNombreProducto());
                    tabla.addCell(pr.getDescripcion());
                    tabla.addCell(pr.getPrecioActual()+"");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, " Error no funciona " + ex.getMessage());
            }
            tabla.addCell("Total");
           tabla.addCell("");
          //  tabla.addCell(liquida.getTotalPago() + "");
            documento.add(tabla);
            System.out.println("casi");
            documento.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (DocumentException e) {
            System.err.println(e.getMessage());
        }
        
    }
    
}
