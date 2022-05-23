package cristhian.modelo;

import java.util.ArrayList;


public class Lista<T> {
    
    private T dato;
    protected ArrayList<T>lista;

    public T getDato() {
        return dato;
    }

    public ArrayList<T> getLista() {
        return lista;
    }

    public void setLista(ArrayList<T> lista) {
        this.lista = lista;
    }
}
