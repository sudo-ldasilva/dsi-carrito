package dsi.carrito;

public class Direccion {
    private String calle1;
    private String calle2;
    private int altura;
    private boolean sinAltura;
    private int piso;
    private int cuerpo;
    private String departamento;
    private Ciudad ciudad;
    
    public String getDireccion(){
        if(sinAltura){
            return calle1 + " " + calle2 + " " + cuerpo + " " + piso + " " + departamento + " " + ciudad;
        }
        else{
            return calle1 + " " + calle2 + " " + altura + " " + cuerpo + " " + piso + " " + departamento + " " + ciudad;
        }
    }
    public String getLatitud(){
        return calle1;
    }
    public String getLongitud(){
        return calle2;
    }
    public boolean estaHabilitadaEnvio(){
        return true;
    }
    
}
