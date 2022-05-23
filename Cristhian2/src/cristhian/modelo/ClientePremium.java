package cristhian.modelo;

import java.util.ArrayList;

public class ClientePremium extends Cliente{

    public ClientePremium(String nombre, String dni, String correo, String direccion) {
        super(nombre, dni, correo, direccion);
    }

    @Override
    public String tipoCliente() {
        return("Es cliente premium");
    }

    @Override
    public float calcAnual() {
        return(30.0f);
    }

    @Override
    public float descuentoEnv() {
        return(20f);
    }
}
