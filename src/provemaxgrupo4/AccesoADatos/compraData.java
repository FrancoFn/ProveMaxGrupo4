/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemaxgrupo4.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import provemaxgrupo4.Entidades.compra;



/**
 *
 * @author luz
 */
public class compraData {
    private Connection Con = null;
    
  public compraData(){
  Con = Conexion.getConexion();
  } 
    public void insetarcompra(compra compra) throws SQLException{
     String sql = "INSERT INTO compra(idcompra,proveedor,fecha)"
             +",estado) VALUES (?,?,?,?,?)";
      try {
            PreparedStatement ps = Con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
          PreparedStatement setString; 
          ps.setString(1, compra.getProveedor());
          ps.setDate(2, new java.sql.Date(compra.getFecha().getTime())); // Asumo que fecha es de tipo java.util.Date
          PreparedStatement setBoolean; // Asumo que estado es un boolean
          ps.setBoolean(3, compra.isEstado());

            ps.executeUpdate();
            
            // Recuperar el ID generado para la compra
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int idCompraGenerado = rs.getInt(1);
                // Asignar el ID generado a la compra
                compra.setId(idCompraGenerado);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la compra");
        }
    }
}
    
  

