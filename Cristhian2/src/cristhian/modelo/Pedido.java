,ppackage cristhian.modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    private int numPedido;
    private int cantidad;
    private LocalDate fecha;
    ArrayList<Articulo> articulos;
    private Cliente cliente;

    public Pedido(int numPedido, int cantidad, LocalDate fecha, ArrayList<Articulo> articulos, Cliente cliente) {
        this.numPedido = numPedido;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.articulos = articulos;
        this.cliente = cliente;
    }
    
    public int getNumPedido() {
        return numPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean pedidoEnviado(){
        
        for(Articulo articulos: articulos){
            articulos.setEnviado(true);
        }
        return(true);
    }
    
    public float precioEnvio(){
        float total= 0.0f;
        for(Articulo articulos: articulos){
            total=articulos.getGastosEnvio()+total;
        }
        return(total);
    }
    
    public float precioTotalPedido(){
        float total= 0.0f;
        for(Articulo articulos: articulos){
            total=articulos.getPrecioVenta()+total;
        }
        return(total);
    }
    
    @Override
    public String toString() {
        String nifCliente = cliente.getDni();
        String nombreCliente = cliente.getNombre();
        int cantidadArticulos = articulos.size();
        float totalEnvio = precioEnvio();
        float totalPrecioPedido = precioTotalPedido();
        return "Pedido{" + "numPedido=" + numPedido +  ", fecha=" + fecha + ", nifCliente=" + nifCliente + ", nombreCliente=" + nombreCliente + ", articulos=" + articulos + ", cantidadArticulos=" + cantidadArticulos + ", precioTotalPedido=" + totalPrecioPedido +'}';
    }  
}