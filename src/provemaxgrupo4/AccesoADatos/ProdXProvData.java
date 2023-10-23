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

/**
 *
 * @author bruno
 */
public class ProdXProvData {

    private Connection con = null;

    public ProdXProvData() {
        con = Conexion.getConexion();
    }

    public void guardarProdXProv(int idProv, int idProd) {
        // Verificar si ya existe un registro con la misma combinación de idProveedor e idProducto
        if (existeRegistro(idProv, idProd)) {
            JOptionPane.showMessageDialog(null, "El registro ya existe en la base de datos.");
            return;
        }

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

// Con esto probamos si ya existe la combinación de idProveedor e idProducto
    private boolean existeRegistro(int idProv, int idProd) {
        String sql = "SELECT COUNT(*) FROM prodxprov WHERE idProveedor = ? AND idProducto = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProv);
            ps.setInt(2, idProd);
            ResultSet result = ps.executeQuery();

            if (result.next()) {
                int count = result.getInt(1);
                return count > 0; // Si count es mayor que 0, el registro ya existe.
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al comprobar la existencia del registro: " + ex.getMessage());
        }

        return false;
    }

    public List<Producto> listarProductosPorID(int id) {
        String sql = "SELECT E.idProducto, E.nombreProducto,E.descripcion,E.precioActual FROM producto E join prodxprov P WHERE"
                + " P.idProveedor = ? and E.idProducto=P.idProducto";
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

    public void eliminarPxp(int idProv, int idProd) {
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
