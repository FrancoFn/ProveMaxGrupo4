

package provemaxgrupo4.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import provemaxgrupo4.Entidades.Proveedor;

/**
 *
 * @author Sofia 
 */
public class ProveedorData {
    
      private Connection con = null;
      
      
      public ProveedorData() {
     con = Conexion.getConexion();
       }
    
      
       public void guardarProveedor(Proveedor proveedor) {

        String sql = "INSERT INTO proveedor (razonSocial, domicilio, telefono)"
                + "VALUES(?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                proveedor.setIdProveedor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "PROVEEDOR GUARDADO");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedor//guardarProveedor");
        }

    }
    
        public void modificarProveedor(Proveedor proveedor) {

        String sql = "UPDATE proveedor SET razonSocial = ?, domicilio = ?, telefono = ? WHERE idProveedor = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setInt(4, proveedor.getIdProveedor());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "PROVEEDOR MODIFICADO");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedor//modificarProveedor");
        }

    }

    public void eliminarProveedor(int id) {
        String sql = "UPDATE proveedor SET estado = 0 WHERE idProveedor = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "PROVEEDOR ELIMINADO");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "proveedor");
        }

    }

    public Proveedor buscarProveedor(int id) {
        String sql = "SELECT razonSocial, domicilio, telefono  FROM proveedor WHERE idProveedor = ? AND estado =1";
        Proveedor proveedor = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                proveedor = new Proveedor();
                proveedor.setIdProveedor(id);
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
            } else {
                JOptionPane.showMessageDialog(null, "NO EXISTE UN PROVEEDOR CON ESE ID");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedor//BuscarProveedor");
        }
        return proveedor;
        
    }
    
    public List<Proveedor> listarProveedores() {
        String sql = "SELECT idProveedor, razonSocial, domicilio, telefono FROM proveedor WHERE estado =1";

        ArrayList<Proveedor> listaProveedores = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Proveedor proveedor = new Proveedor();
                proveedor.setIdProveedor(rs.getInt("idProveedor"));
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
                

                listaProveedores.add(proveedor);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedor//listarProveedor"+ ex.getMessage());
        }
        return listaProveedores;
    }

}