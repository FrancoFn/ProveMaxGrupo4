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
import provemaxgrupo4.Entidades.Producto;
import provemaxgrupo4.Entidades.Proveedor;

/**
 *
 * @author bruno
 */
public class ProdXProvData {

    private Connection con = null;

    public ProdXProvData() {
        con = Conexion.getConexion();
    }

    /*public void guardarProdXProv(int idProv, int idProd) {

        String sql = "INSERT INTO prodxprov (idProveedor, idProducto)"
                + " VALUES(?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idProv);
            ps.setInt(2, idProd);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cargado correctamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedor//guardarProveedor");
        }

    }*/
    public void guardarProdXProv(int idProv, int idProd) {

    String sql = "INSERT INTO prodxprov (idProveedor, idProducto) VALUES (?, ?)";

    try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, idProv);
        ps.setInt(2, idProd);
        int exito = ps.executeUpdate();

        if (exito == 1) {
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                int idGenerado = generatedKeys.getInt(1);
                JOptionPane.showMessageDialog(null, "Cargado correctamente con ID generado: " + idGenerado);
            } else {
               // JOptionPane.showMessageDialog(null, "Cargado correctamente, pero no se pudo obtener el ID generado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo cargar el registro");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prodxprov: " + ex.getMessage());
    }
}


    public List<Producto> listarProductosPorID(int id){
       String sql = "SELECT E.idProducto, E.nombreProducto,E.descripcion,E.precioActual FROM producto E join prodxprov P WHERE P.idProveedor = ? and E.idProducto=P.idProducto";
        ArrayList<Producto> listaProducto = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                listaProducto.add(producto);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto");
        }
        return listaProducto; 
    }
   
    public void eliminarPxp(int idProv, int idProd){
    String sql = "DELETE FROM prodxprov WHERE  idProveedor= ? AND idProducto= ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idProv);
        ps.setInt(2, idProd);
       
        int exito = ps.executeUpdate();

        if (exito > 0) {
            JOptionPane.showMessageDialog(null, "Eliminado correctamente");
        } else if (exito == 0) {
            JOptionPane.showMessageDialog(null, "No se encontró un registro que coincida con los valores proporcionados");
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prodxprov: " + ex.getMessage());
    }
    }
}
