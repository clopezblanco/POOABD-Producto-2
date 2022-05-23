package cristhian.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Datos {
    Lista<Articulo> listaArticulos;
    Lista<Cliente> listaClientes;
    Lista<Pedido> listaPedidos;

    public Datos() {
        listaArticulos = new Lista();
        listaClientes = new Lista();
        listaPedidos = new Lista();
    }
    public Lista<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public Lista<Cliente> getListaClientes() {
        return listaClientes;
    }

    public Lista<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaArticulos(Lista<Articulo> listaArticulos) {
        String codigo;
        String descripcion;
        float precioVenta;
        float gastoEnvio;
        Scanner sc=new Scanner(System.in);
        System.out.print("Codigo de articulo: ");
        codigo=sc.nextLine();
        System.out.print("Descripcion de articulo: ");
        descripcion=sc.nextLine();
        System.out.print("Precio de venta de articulo: ");
        precioVenta=sc.nextFloat();
        System.out.print("Gasto de envio de articulo: ");
        gastoEnvio=sc.nextFloat();
        Articulo articulo1 = new Articulo(codigo,descripcion,precioVenta,gastoEnvio,false);
        listaArticulos.addArticulo(articulo1);
    }

    public void setListaClientes(Lista<Cliente> listaClientes) {
        Scanner sn = new Scanner(System.in);
        int tipo;
        String nombre;
        String dni;
        String correo;
        String direccion;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nombre de cliente: ");
        nombre=sc.nextLine();
        System.out.print("Dni de cliente: ");
        dni=sc.nextLine();
        System.out.print("Correo del cliente: ");
        correo=sc.nextLine();
        System.out.print("Gasto de envio de articulo: ");
        direccion=sc.nextLine();
        System.out.println("Elige tipo de Cliente: ");
        System.out.println("1. Cliente Estandard: ");
        System.out.println("2. Cliente Premium: ");
            tipo = sn.nextInt();
        if(tipo==1){
            ClienteEstandard cliente1 = new ClienteEstandard(nombre,dni,correo,direccion);
            listaClientes.addCliente(cliente1);
        }else if(tipo==2){
            ClientePremium cliente1 = new ClientePremium(nombre,dni,correo,direccion);
            listaClientes.addCliente(cliente1);
        }
    }

    public void setListaPedidos(Lista<Pedido> listaPedidos) {
        int numPedido;
        int cantidad;
        LocalDate fecha;
        String dni;
        Scanner sc=new Scanner(System.in);
        System.out.print("Numero de pedido: ");
        numPedido=sc.nextInt();
        System.out.print("Cantidad de pedidos: ");
        cantidad=sc.nextInt();
        System.out.print("Fecha y hora de envio: ");
        fecha=sc.nextDate();
        System.out.print("Dni de cliente del pedido: ");
        dni=sc.nextLine();
        for(ListaClientes listaClientes : listaClientes){
            if(listaClientes.clientes.getDni()==dni){
                setListaClientes(listaClientes);
            }
        }
        Pedido pedido1 = new Pedido(numPedido,cantidad,fecha,articulos,cliente);
        listaPedidos.addPedido(pedido1);
    }

    public void eliminarPedido(Lista<Pedido> listaPedidos){
        int numPedido;
        Scanner sc=new Scanner(System.in);
        System.out.print("Numero de pedido a eliminar: ");
        numPedido=sc.nextInt();
        for(ListaPedidos listaPedidos : listaPedidos){
            if(listaPedidos.pedidos.getNumPedido()==numPedido && !listaArticulos.articulo.getEnviado()){
                listaPedidos.pedidos.remove(pedidos);
            }else{
                System.out.print("Pedido no encontrado");
            }
        }
    }
    
    @Override
    public String toString() {
        return "Datos{" + "listaArticulos=" + listaArticulos + ", listaClientes=" + listaClientes + ", listaPedidos=" + listaPedidos + '}';
    }
}
