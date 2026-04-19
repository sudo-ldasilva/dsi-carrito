package dsi.carrito;
import java.util.Date;
import java.util.ArrayList;

public class Producto {

    private String EAN13;
    private String nombre;
    private ArrayList<PrecioProducto> preciosHistoricos = new ArrayList<>();
    
    public Producto (String EAN13, String nombre, ArrayList<PrecioProducto> preciosHistoricos) {
        this.EAN13 = EAN13;
        this.nombre = nombre;
        this.preciosHistoricos = preciosHistoricos;
    }
    
    public String getEAN13() {
        return EAN13;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreCorto() {
        return nombre.substring(0, 4);
    }

    public double getPrecio(Date fechaVigencia) {
        for (PrecioProducto precio : preciosHistoricos) {
            if (precio.getCumpleVIgencia(fechaVigencia)) {
                return precio.getPrecio();
            }
        }
        return 0;
    }
}
