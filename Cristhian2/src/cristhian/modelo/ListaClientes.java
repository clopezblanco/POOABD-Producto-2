package cristhian.modelo;

import java.util.ArrayList;

public class ListaClientes extends Lista<Cliente> {
    ArrayList<Cliente> clientes;

    public ListaClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    @Override
    public ArrayList<Cliente> getLista() {
        return lista;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public void setLista(ArrayList<Cliente> lista) {
        this.lista = lista;
    }
    
    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    @Override
    public String toString() {
        return "ListaClientes{" + "clientes=" + clientes + '}';
    }
}
