package provemaxgrupo4.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import provemaxgrupo4.Entidades.Compra;
import provemaxgrupo4.Entidades.DetalleCompra;
import provemaxgrupo4.Entidades.Producto;

/**
 *
 * @author Sofia
 */
public class DetalleCompraData {

    private Connection con = null;
    ProductoData productoData;
    CompraData compraData;

    public DetalleCompraData(ProductoData productoData,CompraData compraData) {
        con = Conexion.getConexion();
        this.compraData=compraData;
        this.productoData=productoData;
        
        
    }

    public Producto buscarProductoPorCompra(Compra compra) {
        Producto producto = new Producto();
        String sql = "SELEC * FROM detallecompra JOIN producto ON (producto=idProducto) WHERE compra=?";
        try (PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, compra.getIdCompra());
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombreProducto(rs.getString("nombreProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra//buscarProductoPorCompra");
        }
        return producto;
    }

    public List<DetalleCompra> listarDetallesPorCompra(Compra compra) {
        ArrayList<DetalleCompra> listaDetalleCompra = new ArrayList<>();
        String sql = "SELEC * FROM detallecompra WHERE compra=?";
           try (PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, compra.getIdCompra());
            ResultSet rs = ps.getGeneratedKeys();
            while (rs.next()) {
                DetalleCompra detalleCompra = new DetalleCompra();

                detalleCompra.setProducto(productoData.buscarProductoPorId(rs.getInt("idProducto")));
                detalleCompra.setCompra(compraData.buscarCompraPorId(rs.getInt("idCompra")));
                detalleCompra.setCantidad(rs.getInt("cantidad"));
                detalleCompra.setPrecioCosto(rs.getDouble("precioCosto"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalle compra//listarDetallesPorCompra");
        }
        return listaDetalleCompra;
    }

}
