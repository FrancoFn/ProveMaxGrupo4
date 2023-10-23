

package provemaxgrupo4.Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sofia 
 */
public class Proveedor {
    private int idProveedor; 
    private String razonSocial;
    private String domicilio;
    private String telefono;
    private boolean activo;
    private List<Producto>productosDisponibles=new ArrayList<>();
    
    public Proveedor() {
    }

    public Proveedor(int idProveedor, String razonSocial, String domicilio, String telefono, boolean activo) {
        this.idProveedor = idProveedor;
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
         this.activo = activo;
    }
    
     public Proveedor(String razonSocial, String domicilio, String telefono, boolean activo) {
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.activo = activo;
    }
    
    

    public List<Producto> getProductosDisponibles() {
        return productosDisponibles;
    }

    public void setProductosDisponibles(List<Producto> productosDisponibles) {
        this.productosDisponibles = productosDisponibles;
    }

   

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

      @Override
    public String toString() {
            return razonSocial +", Codigo " + idProveedor ;
    }

    public void cargarProducto(Producto producto){
       productosDisponibles.add(producto);
    }

}
