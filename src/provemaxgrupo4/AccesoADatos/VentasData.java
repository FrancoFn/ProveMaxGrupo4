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
    Ventas datosVentas = new Ventas();
    public VentasData() {
        con = Conexion.getConexion();
    }
    
     public Ventas Nfact() {        
        String sql="select idPDF from pdf ORDER BY idPDF DESC Limit 1";
        ResultSet resul = null;       
        try {
            PreparedStatement st = con.prepareStatement(sql);
            resul = st.executeQuery();
            datosVentas.setNventa(resul.getInt("idPDF"));            
          // int nlic = resul.getInt("nLiq");
        } catch (Exception ex) {
            
        }return datosVentas;
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
