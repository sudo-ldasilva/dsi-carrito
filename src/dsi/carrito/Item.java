package dsi.carrito;

public class Item {
    private Carrito carrito;
    private Producto producto;
    private int cantidad;
    private double precioUnitario;

    public Item(Carrito carrito, Producto producto, int cantidad, double precioUnitario) {
        this.carrito = carrito;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
    
    public double getPrecio(){
        return cantidad * precioUnitario;
    }
    
    public double getPrecioOficial(){
        return (cantidad * producto.getPrecio(carrito.getFechaCompra()));
    }
    
    public double getDescuento(){
        return (this.getPrecioOficial() - this.getPrecio());
    }
}
