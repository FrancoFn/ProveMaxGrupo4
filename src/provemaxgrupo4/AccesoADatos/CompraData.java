package provemaxgrupo4.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import provemaxgrupo4.Entidades.Compra;
import provemaxgrupo4.Entidades.DetalleCompra;

public class CompraData {

    private ProveedorData proveedorData;
    private DetalleCompra detalleCompra;
    private Connection con = null;

    public CompraData() {
        con = Conexion.getConexion();

    }

    public CompraData(ProveedorData proveedorData) {
        this.proveedorData = proveedorData;
        con = Conexion.getConexion();
    }

    public void guardarCompra(Compra compra) {
        String sql = "INSERT INTO compra (proveedor, fecha, estado, detalleCompra)"
                + "VALUES (?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            ps.setInt(2, compra.getProveedor().getIdProveedor());
            ps.setDate(3, Date.valueOf(compra.getFechaCompra()));
            ps.setBoolean(4, compra.isEstado());
            ps.setInt (5, compra.getDetalleCompra().getIdDetalle());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                compra.setIdCompra(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "COMPRA GUARDADO");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedor//metodo guardarCompra");
        }
    }

    public void modificarCompra(Compra compra) {

        String sql = "UPDATE compra SET proveedor = ?, fecha = ?, estado = ?, detalleCompra = ? WHERE idCompra = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)){
            
            ps.setInt(1, compra.getProveedor().getIdProveedor());
            ps.setDate(2, Date.valueOf(compra.getFechaCompra()));
            ps.setBoolean(3, compra.isEstado());
            ps.setInt(4, compra.getDetalleCompra().getIdDetalle());
            ps.setInt(5, compra.getIdCompra());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "COMPRA MODIFICADA");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra//metodo modificarCompra");
        }

    }

    public void eliminarCompra(int id) {
        String sql = "UPDATE compra SET estado = 0 WHERE idcompra= ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "COMPRA ELIMINADA");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra");
        }

    }

    public List<Compra> listarcomprasactivas(int id) {
        String sql = "SELECT * FROM compra WHERE estado =?";

        ArrayList<Compra> listacompra = new ArrayList<>();

        try (PreparedStatement ps = con.prepareStatement(sql)){
            
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Compra compra = new Compra();
                compra.setIdCompra(rs.getInt("idCompra"));
                compra.setProveedor(proveedorData.buscarProveedor(rs.getInt("proveedor")));
                compra.setFechaCompra(rs.getDate("fechaCompra").toLocalDate());
                compra.setEstado(rs.getBoolean("estado"));

                
                listacompra.add(compra);

            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la compra");
        }
        return listacompra;
    }

}
