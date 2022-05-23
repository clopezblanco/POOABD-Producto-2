package cristhian.modelo;

import java.util.ArrayList;

public class ClienteEstandard extends Cliente{

    public ClienteEstandard(String nombre, String dni, String correo, String direccion) {
        super(nombre, dni, correo, direccion);
    }

    @Override
    public String tipoCliente() {
        return("Es cliente estandard");
    }

    @Override
    public float calcAnual() {
        return(0.0f);
    }

    @Override
    public float descuentoEnv() {
        return(0.0f);
    }
}
