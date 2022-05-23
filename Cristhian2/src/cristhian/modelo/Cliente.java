package cristhian.modelo;

import java.util.ArrayList;

public abstract class Cliente {
    private String nombre;
    private String dni;
    private String correo;
    private String direccion;

    public Cliente(String nombre, String dni, String correo, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public abstract String tipoCliente();
    
    public abstract float calcAnual();
    
    public abstract float descuentoEnv();
    
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", correo=" + correo + ", direccion=" + direccion + '}';
    }    
}




