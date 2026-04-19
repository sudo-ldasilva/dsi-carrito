package dsi.carrito;

import java.util.ArrayList;

public class Cliente {
    
    private String nombre;
    private String apellido;
    private String email;
    private ArrayList<Direccion> direcciones;
    private ArrayList<Carrito> carritos;
    private ArrayList<Tarjeta> tarjetas;
    private boolean esPreferencial;
    
    public Cliente(String nombre, String apellido, String email, ArrayList<Direccion> direcciones, 
                    ArrayList<Carrito> carritos, ArrayList<Tarjeta> tarjetas, boolean esPreferencial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direcciones = direcciones;
        this.carritos = carritos;
        this.tarjetas = tarjetas;
        this.esPreferencial = esPreferencial;
    }
    
    public double getMontoDeuda() {
        double montoDeuda = 0;
        for (Carrito carrito : this.carritos)
        {
            montoDeuda += carrito.getMontoDeuda();
        }
        return montoDeuda;
    }
    
    public boolean estaHabilitado() {
        final double LIMITE_DEUDA = 5000000;
        return this.getMontoDeuda() <= LIMITE_DEUDA;
    }
    
}
