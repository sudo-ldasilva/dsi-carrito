package dsi.carrito;

import java.util.ArrayList;
import java.util.Date;

public class Carrito {
    private ArrayList<Item> items;
    private Date fechaCompra;
    private Cliente cliente;
    private Direccion direccionEnvio;
    private Direccion direccionCobro;
    private ArrayList<Pago> pagos;
    private Estado estado;

    public Carrito(ArrayList<Item> items, Date fechaCompra, Cliente cliente, Direccion direccionEnvio, Direccion direccionCobro, ArrayList<Pago> pagos, Estado estado) {
        this.items = items;
        this.fechaCompra = fechaCompra;
        this.cliente = cliente;
        this.direccionEnvio = direccionEnvio;
        this.direccionCobro = direccionCobro;
        this.pagos = pagos;
        this.estado = estado;
    }

    public void setEstado(Estado estado) {
        this.estado = Estado.CERRADO;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void cerrar() {
        estado = Estado.CERRADO;
    }


    public double getMontoPagado() {
        double acumulado = 0;
        for (Pago p : pagos) {
            acumulado += p.getMonto();
        }
        return acumulado;
    }

    public double getMontoCarrito() {
        double acumulado = 0;
        for (Item i : items) {
            acumulado += i.getPrecio();
        }
        return acumulado;
    }

    public double getMontoDeuda() {
        return getMontoCarrito() - getMontoPagado();
    }
}
