package cristhian.modelo;

import java.util.ArrayList;

public class Articulo {
    private String codigo;
    private String descripcion;
    private float precioVenta;
    private float gastosEnvio;
    private boolean enviado;
    
    public Articulo(String codigo, String descripcion, float precioVenta, float gastosEnvio, boolean enviado){
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.precioVenta=precioVenta;
        this.gastosEnvio=gastosEnvio;
        this.enviado=enviado;
    }
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
    public float getPrecioVenta(){
        return precioVenta;
    }
    
    public void setPrecioVenta(Float precioVenta){
        this.precioVenta=precioVenta;
    }
    
    public float getGastosEnvio(){
        return gastosEnvio;
    }
    
    public void setGastosEnvio(Float gastosEnvio){
        this.gastosEnvio=gastosEnvio;
    }
    
    public boolean getEnviado(){
        return enviado;
    }
    
    public void setEnviado(boolean enviado){
        this.enviado=enviado;
    }

    @Override
    public String toString() {
        return "Articulo{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precioVenta=" + precioVenta + ", gastosEnvio=" + gastosEnvio + ", enviado=" + enviado + '}';
    }
}
