package dsi.carrito;

public class Ciudad {
    private String nombre;
    private Provincia provincia;
 
    public Ciudad(String nombre, Provincia prov){
        this.nombre=nombre;
        this.provincia=prov;
    }
    public String getNombre(){
        return nombre;
    }
    public Provincia getProvincia(){
        return provincia;
    }
}
