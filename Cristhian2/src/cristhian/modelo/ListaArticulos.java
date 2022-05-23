package cristhian.modelo;

import java.util.ArrayList;

public class ListaArticulos extends Lista<Articulo>{
    ArrayList<Articulo> articulos;

    public ListaArticulos(Articulo articulo) {
        articulos = new ArrayList<>();
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    @Override
    public ArrayList<Articulo> getLista() {
        return lista;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }
    
    public void addArticulo(Articulo articulo){
        articulos.add(articulo);
    }

    @Override
    public void setLista(ArrayList<Articulo> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "ListaArticulos{" + "articulos=" + articulos + '}';
    }
}
