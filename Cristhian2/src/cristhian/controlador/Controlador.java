package cristhian.controlador;

import cristhian.modelo.Articulo;
import cristhian.vista.Vista;
import cristhian.modelo.Datos;
import cristhian.modelo.Lista;
import cristhian.modelo.ListaArticulos;

public class Controlador {
    public static void main(String[] args) {
        Vista vista = new Vista();
        boolean salir=false;
        while(!salir){
            salir=vista.menuInicial(salir);
        }
    }
    
}
