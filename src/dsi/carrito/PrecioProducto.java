package dsi.carrito;

import java.util.Date;

public class PrecioProducto {
    private Date fechaInicioVigencia;
    private Date fechaFinVigencia;
    private double precio;
            
    public PrecioProducto(Date fechaInicioVigencia, Date fechaFinVigencia, double precio) {
        this.fechaInicioVigencia = fechaInicioVigencia;
        this.fechaFinVigencia = fechaFinVigencia;
        this.precio = precio;
    }
    

    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public double getPrecio() {
        return precio;
    }
    
    public boolean getCumpleVIgencia(Date fecha) {
        return fecha.after(fechaInicioVigencia) && fecha.before(fechaFinVigencia);
    }
}