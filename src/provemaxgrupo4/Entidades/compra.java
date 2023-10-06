/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemaxgrupo4.Entidades;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luz
 */
public class compra {
   int id;
   List<Producto> productos = new ArrayList<>();
    Date fecha;
   double total;
   String proveedor;
   boolean estado;

    public compra(int id, Date fecha, double total, String proveedor, boolean estado) {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
        this.proveedor = proveedor;
        this.estado = estado;
    }

    public compra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

   
}
