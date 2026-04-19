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
    private boolean habilitadaParaEnvio;

    public Direccion(String calle1, String calle2, int altura, boolean sinAltura, int piso, int cuerpo, String departamento, Ciudad ciudad, boolean habilitadaParaEnvio) {
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.altura = altura;
        this.sinAltura = sinAltura;
        this.piso = piso;
        this.cuerpo = cuerpo;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.habilitadaParaEnvio = habilitadaParaEnvio;
    }
    
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
        return habilitadaParaEnvio;
    }
    
}
