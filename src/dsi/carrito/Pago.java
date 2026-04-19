package dsi.carrito;

public class Pago {
    private Carrito carrito; 
    private Tarjeta tarjeta; 
    private double monto; 
    
    public boolean verificarTarjeta(){
        return true; 
    }
    
    public double getMonto(){
        return monto; 
    }
    
}
