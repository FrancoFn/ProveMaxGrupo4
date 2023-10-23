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
import provemaxgrupo4.Entidades.Proveedor;

/**
 *
 * @author Sofia
 */
public class DetalleCompraData {

    private Connection con = null;
    ProductoData productoData;
    CompraData compraData;

    public DetalleCompraData() {
        con = Conexion.getConexion();
    }

    public DetalleCompraData(ProductoData productoData, CompraData compraData) {
        con = Conexion.getConexion();
        this.compraData = compraData;
        this.productoData = productoData;
    }

    public void guardarCompra(int Cantidad, double precio, Compra compra, Producto Producto) {
        String sql = "INSERT INTO detallecompra (cantidad, precioCosto, compra, producto)"
                + "VALUES (?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, Cantidad);
            ps.setDouble(2, precio);
            ps.setInt(3, compra.getIdCompra());
            ps.setInt(4, Producto.getIdProducto());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                compra.setIdCompra(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "DETALLE GUARDADO");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla DetalleCompra");
        }
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

    //Agregado
    public List<DetalleCompra> listarDetallesPorProveedor(Proveedor proveedor) {
        ArrayList<DetalleCompra> listaDetalleCompra = new ArrayList<>();
        String sql = "SELECT D.idDetalle, D.cantidad, D.precioCosto, P.razonSocial, PR.nombreProducto, PR.descripcion, C.fecha "
                + "FROM detallecompra D "
                + "JOIN compra C ON D.compra = C.idCompra "
                + "JOIN proveedor P ON C.proveedor = P.idProveedor "
                + "JOIN producto PR ON D.producto = PR.idProducto "
                + "WHERE P.idProveedor = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, proveedor.getIdProveedor());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                DetalleCompra detalleCompra = new DetalleCompra();
                detalleCompra.setIdDetalle(rs.getInt("idDetalle"));
                detalleCompra.setCantidad(rs.getInt("cantidad"));
                detalleCompra.setPrecioCosto(rs.getDouble("precioCosto"));

                Compra comp = new Compra();
                Producto prod = new Producto();

                comp.setFechaCompra(rs.getDate("fecha").toLocalDate());

                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setDescripcion(rs.getString("descripcion"));

                Proveedor prov = new Proveedor();
                prov.setRazonSocial(rs.getString("razonSocial"));
                comp.setProveedor(prov);
                detalleCompra.setCompra(comp);
                detalleCompra.setProducto(prod);

                listaDetalleCompra.add(detalleCompra);
            }
        } catch (SQLException ex) {
            // Manejo de excepciones
        }

        return listaDetalleCompra;
    }
    //Agregado

    public List<DetalleCompra> listarDetallesPorFecha(LocalDate fecha) {
        ArrayList<DetalleCompra> listaDetalleCompra = new ArrayList<>();
        String sql = "SELECT D.idDetalle, D.cantidad, D.precioCosto, P.razonSocial, PR.nombreProducto, PR.descripcion, C.fecha "
                + "FROM detallecompra D "
                + "JOIN compra C ON D.compra = C.idCompra "
                + "JOIN proveedor P ON C.proveedor = P.idProveedor "
                + "JOIN producto PR ON D.producto = PR.idProducto "
                + "WHERE DATE(C.fecha) = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, fecha);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                DetalleCompra detalleCompra = new DetalleCompra();
                detalleCompra.setIdDetalle(rs.getInt("idDetalle"));
                detalleCompra.setCantidad(rs.getInt("cantidad"));
                detalleCompra.setPrecioCosto(rs.getDouble("precioCosto"));
                Compra comp = new Compra();
                Producto prod = new Producto();
                comp.setFechaCompra(rs.getDate("fecha").toLocalDate());
                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setDescripcion(rs.getString("descripcion"));
                Proveedor prov = new Proveedor();
                prov.setRazonSocial(rs.getString("razonSocial"));
                comp.setProveedor(prov);
                detalleCompra.setCompra(comp);
                detalleCompra.setProducto(prod);

                listaDetalleCompra.add(detalleCompra);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con el sql");
        }
        return listaDetalleCompra;
    }

    public List<DetalleCompra> listarDetallesEntreFechas(LocalDate fecha1, LocalDate fecha2) {
        ArrayList<DetalleCompra> listaDetalleCompra = new ArrayList<>();
        String sql = "SELECT D.idDetalle, D.cantidad, D.precioCosto, P.razonSocial, PR.nombreProducto, PR.descripcion, C.fecha "
                + "FROM detallecompra D "
                + "JOIN compra C ON D.compra = C.idCompra "
                + "JOIN proveedor P ON C.proveedor = P.idProveedor "
                + "JOIN producto PR ON D.producto = PR.idProducto "
                + "WHERE DATE(C.fecha) Between  ? and ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, java.sql.Date.valueOf(fecha1));
            ps.setDate(2, java.sql.Date.valueOf(fecha2));
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                DetalleCompra detalleCompra = new DetalleCompra();
                detalleCompra.setIdDetalle(rs.getInt("idDetalle"));
                detalleCompra.setCantidad(rs.getInt("cantidad"));
                detalleCompra.setPrecioCosto(rs.getDouble("precioCosto"));
                Compra comp = new Compra();
                Producto prod = new Producto();
                comp.setFechaCompra(rs.getDate("fecha").toLocalDate());
                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setDescripcion(rs.getString("descripcion"));
                Proveedor prov = new Proveedor();
                prov.setRazonSocial(rs.getString("razonSocial"));
                comp.setProveedor(prov);
                detalleCompra.setCompra(comp);
                detalleCompra.setProducto(prod);
                listaDetalleCompra.add(detalleCompra);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con el sql");
        }
        return listaDetalleCompra;
    }
}
