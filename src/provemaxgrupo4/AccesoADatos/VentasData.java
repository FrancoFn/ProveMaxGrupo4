/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemaxgrupo4.AccesoADatos;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import provemaxgrupo4.Entidades.Ventas;


/**
 *
 * @author bruno
 */
public class VentasData {
   
    private Connection con = null;
  
    public VentasData() {
        con = Conexion.getConexion();
    }
    
    public Ventas Nfact() {        
    String sql = "select idPDF from pdf ORDER BY idPDF DESC Limit 1";
    ResultSet resul = null; 
    Ventas datosVentas = new Ventas();
    try {
        PreparedStatement st = con.prepareStatement(sql);
        resul = st.executeQuery();
        
        if (resul.next()) {
            datosVentas.setNventa(resul.getInt("idPDF"));
        } else {
            System.out.println("No se encontraron resultados en la consulta.");
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error al cargar factura");
    }
    return datosVentas;
}
    
    public void insertarVenta(String nombre){
        String sql = "INSERT INTO pdf (Nombre) VALUES (?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nombre);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar factura");
        }  
    }
    
    public Document CrearDoc(Document documento,FileOutputStream archivo,String nombre,String apellido, int telefono,String direccion,String nFact){
        
        try {
            //Document documento = new Document();
            //FileOutputStream archivo = new FileOutputStream(ruta + "/OneDrive/Documentos/Factura PDF/" + nombreArchivo);
            PdfWriter.getInstance(documento, archivo);
        
            documento.open();
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("ProveMax Group S.A." + "                                                            " + "N° Liquidacion:" + " " + nFact));
            documento.add(new Paragraph("                                         " + "                                                  "/* + "Fecha de emision:" + "        " + fechaE*/));
            documento.add(new Paragraph("Direccion:" + " " + "1° de Mayo 1243, Rosario, Santa Fe" + "                                                           "/* + "Fecha de vencimiento:" + "  " + fechaV*/));
            documento.add(new Paragraph("Administracion:" + " " + "Sofi // Fran"));
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Datos del comprador:"));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Nombre: " + " " + nombre));
            documento.add(new Paragraph("Apellido: " + " " + apellido));
            documento.add(new Paragraph("Direccion: " + " " + direccion));
            documento.add(new Paragraph("Telefono: " + " " + telefono));
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Detalle de facturacion:"));
            documento.add(Chunk.NEWLINE);       
    }   catch (DocumentException ex) {
            Logger.getLogger(VentasData.class.getName()).log(Level.SEVERE, null, ex);
        }
    return documento;
}
    
    
    
}
