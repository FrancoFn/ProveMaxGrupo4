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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import provemaxgrupo4.Entidades.Compra;



/**
 *
 * @author luz
 */
public class compraData {
    private Connection Con = null;
    
  public compraData(){
  Con = Conexion.getConexion();
  } 
    public void insetarcompra(Compra compra) throws SQLException{
     String sql = "INSERT INTO compra(idcompra,proveedor,fecha)"
             +",estado) VALUES (?,?,?,?,?)";
      try {
            PreparedStatement ps = Con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
          PreparedStatement setString; 
      //    ps.setString(1, Compra.getProveedor());
          ps.setDate(2, new java.sql.Date(compra.getFecha().getTime())); // Asumo que fecha es de tipo java.util.Date
          PreparedStatement setBoolean; // Asumo que estado es un boolean
          ps.setBoolean(3, compra.isEstado());

            ps.executeUpdate();
            
            // Recuperar el ID generado para la Compra
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int idCompraGenerado = rs.getInt(1);
                // Asignar el ID generado a la Compra
                compra.setId(idCompraGenerado);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la compra");
        }
    }
    public void eliminarCompra(int id){
    String sql = "UPDATE compra SET estado = 0 WHERE idcompra= ?";
    
     try {
            PreparedStatement ps = Con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Compra Eliminada");
            }
     } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la compra");
        }
        
    }
    public List<Compra> listarcomprasactivas(int id){
         String sql = "SELECT * FROM compra WHERE estado =?";
         
       ArrayList<Compra>listacompra = new ArrayList<>();
       
     try {
            PreparedStatement ps = Con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
          while (rs.next()) {
              Compra compra = new Compra();
            compra.setId(rs.getInt("idcompra"));
        //    Compra.setProveedor(rs.getString("proveedor"));
            compra.setFecha(rs.getDate("fecha"));
            compra.setEstado(rs.getBoolean("estado"));

            // Agregar la Compra a la lista
            listacompra.add(compra);
            
        }
       rs.close();
       ps.close();   
 
    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la compra");
        }
        return listacompra;
    }

    
}
