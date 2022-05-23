package cristhian.vista;

import cristhian.modelo.Datos;
import java.util.Scanner;
import cristhian.modelo.Lista;

public class Vista {
    Datos datos = new Datos();
    Lista lista = new Lista();
    
    public boolean menuInicial(boolean salir){
        Scanner sn = new Scanner(System.in);
        int opcion;
        while(!salir){
            System.out.println("");
            System.out.println("1. Gestión de Artículos");
            System.out.println("2. Gestión de Clientes");
            System.out.println("3. Gestión de Pedidos");
            System.out.println("0. Salir");
            System.out.println("Elige una opcion: ");
            opcion = sn.nextInt();
            
            switch(opcion){
                case 1:
                        menuArticulos(salir);
                    break;
                case 2:
                        menuClientes(salir);
                    break;
                case 3:
                        menuPedidos(salir);
                    break;
                case 0:
                    salir=true;
            }
        }
        return(salir);
    }
    
    public boolean menuArticulos(boolean salir){
        Scanner sn = new Scanner(System.in);
        int opcion;
        
        while(!salir){
            System.out.println("");
            System.out.println("1. Añadir Articulo");
            System.out.println("2. Mostrar Articulos");
            System.out.println("0. Volver");
            System.out.println("Elige una opcion: ");
            opcion = sn.nextInt();
            
            switch(opcion){
                case 1:
                        datos.setListaArticulos(lista);
                    break;
                case 2:
                        System.out.println(listaArticulos.toString());
                    break;
                case 0:
                    salir=true;
            }
        }
        return(salir);        
    }
    
    public boolean menuClientes(boolean salir){
        Scanner sn = new Scanner(System.in);
        int opcion;
        
        while(!salir){
            System.out.println("");
            System.out.println("1. Añadir Cliente");
            System.out.println("2. Mostrar Clientes");
            System.out.println("3. Mostrar Clientes Estándar");
            System.out.println("4. Mostrar Clientes Premium");
            System.out.println("0. Volver");
            System.out.println("Elige una opcion: ");
            opcion = sn.nextInt();
            
            switch(opcion){
                case 1:
                        datos.setListaClientes(lista);
                    break;
                case 2:
                        System.out.println(listaClientes.toString());
                    break;
                case 3:
                        System.out.println(ClienteEstandard.toString());
                    break;
                case 4:
                        System.out.println(ClientePremium.toString());
                    break;
                case 0:
                    salir=true;
            }
        }
        return(salir);        
    }
    
    public boolean menuPedidos(boolean salir){
        Scanner sn = new Scanner(System.in);
        int opcion;
        
        while(!salir){
            System.out.println("");
            System.out.println("1. Añadir Pedido");
            System.out.println("2. Eliminar pedido");
            System.out.println("3. Mostrar Pedidos Pendientes");
            System.out.println("4. Mostrar Pedidos Enviados");
            System.out.println("0. Volver");
            System.out.println("Elige una opcion: ");
            opcion = sn.nextInt();
            
            switch(opcion){
                case 1:
                        datos.setListaPedidos(lista);
                    break;
                case 2:
                        datos.eliminarPedido(lista);
                    break;
                case 3:
                        for(ListaPEdidos listaPedidos : listaPedidos){
                            if(!listaArticulos.articulo.getEnviado()){
                                listaPedidos.pedidos.tostring();
                            }
                        }
                    break;
                case 4:
                        for(ListaPEdidos listaPedidos : listaPedidos){
                            if(listaArticulos.articulo.getEnviado()){
                                listaPedidos.pedidos.tostring();
                            }
                        }
                    break;
                case 0:
                    salir=true;
            }
        }
        return(salir);        
    }
}
