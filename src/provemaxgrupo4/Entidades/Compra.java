
package provemaxgrupo4.Entidades;

import java.time.LocalDate;

public class Compra {
   private int idCompra;
   private Proveedor proveedor;
   private LocalDate fechaCompra;
   private boolean estado;
   private DetalleCompra detalleCompra;

   public Compra() {
    } 
   
   public Compra(int idCompra, LocalDate fechaCompra, Proveedor proveedor, boolean estado, DetalleCompra detalleCompra) {
        this.idCompra = idCompra;
        this.fechaCompra = fechaCompra;
        this.proveedor = proveedor;
        this.estado = estado;
        this.detalleCompra = detalleCompra;
    }

   
    public Compra(LocalDate fechaCompra, Proveedor proveedor, boolean estado, DetalleCompra detalleCompra) {
        this.fechaCompra = fechaCompra;
        this.proveedor = proveedor;
        this.estado = estado;
        this.detalleCompra = detalleCompra;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }


    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public DetalleCompra getDetalleCompra() {
        return detalleCompra;
    }

    public void setDetalleCompra(DetalleCompra detalleCompra) {
        this.detalleCompra = detalleCompra;
    }
    
    

    
   
}
