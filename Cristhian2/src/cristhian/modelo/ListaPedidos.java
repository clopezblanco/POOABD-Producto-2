package cristhian.modelo;

import java.util.ArrayList;

public class ListaPedidos extends Lista<Pedido> {
    ArrayList<Pedido> pedidos;

    public ListaPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public ArrayList<Pedido> getLista() {
        return lista;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void setLista(ArrayList<Pedido> lista) {
        this.pedidos = lista;
    }

    @Override
    public String toString() {
        return "ListaPedidos{" + "pedidos=" + pedidos + '}';
    }
}
