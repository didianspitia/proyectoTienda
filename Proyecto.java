package com.mycompany.proyecto;
import java.util.Scanner;
public class Proyecto {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int nroProductos = 0;
        int total = 0;
        
        System.out.println("\n----- cuantos empleados desea ingresar -----");
        int E = teclado.nextInt();
        Empleado [] listaEmpleados = new Empleado[E];
        for (int i=0; i<E ;i++){
            System.out.println("ingrese id(numerico) del empelado "+(i+1));
            int id = teclado.nextInt();
            
            System.out.println("ingrese el nombre del empleado "+(i+1));
            String name = teclado.next();
            
            System.out.println("ingrese el cargo del empleado "+(i+1));
            String carg = teclado.next();  
            
            listaEmpleados[i]=new Empleado(id,name,carg);
        }
        System.out.println("\n-----ingrese datos provedor-----");
        Provedor [] listaProvedor = new Provedor[1];
        for (int i=0; i<1 ;i++){
            System.out.println("ingrese codigo(Alfanumerico) del provedor ");
            String id = teclado.next();
            
            System.out.println("ingrese nombre del provedor ");
            String nombre = teclado.next();
            
            listaProvedor [i] = new Provedor(id, nombre);
        }
        System.out.println("\n-----ingrese cantidad de producto a ingresar-----");
        int nro = teclado.nextInt();
        Producto [] listaProductos = new Producto[nro];
        
        for (int i=0; i<nro ;i++){
            System.out.println("ingrese id(Alfanumerico) del producto ");
            String id = teclado.next();
            
            System.out.println("ingrese nombre del producto ");
            String nombre = teclado.next();
            
            System.out.println("ingrese precio(numerico) ");
            int precio = teclado.nextInt();
            
            System.out.println("ingrese cantidad(numerico) ");
            int cantidad = teclado.nextInt();
            
            System.out.println("ingrese fecha de vencimiento (Alfanumerico)");
            String fechaVencimiento = teclado.next();
            
            listaProductos [i] = new Producto( id, nombre, precio, cantidad, fechaVencimiento);
        }
        System.out.println("\n-----ingrese datos cliente-----");
        Cliente [] listaClientes = new Cliente[1];
        for (int i=0; i<1 ;i++){
            System.out.println("ingrese id del cliente(numerico)");
            int id = teclado.nextInt();
            
            System.out.println("ingrese nombre del cliente ");
            String nombre = teclado.next();
            
            System.out.println("ingrese direccion del cliente ");
            String direccion = teclado.next();  
            
            System.out.println("ingrese telefono del cliente(numerico) ");
            int telefono = teclado.nextInt();  
            
            System.out.println("ingrese dinero disponible del cliente(numerico) ");
            int dineroDisponible = teclado.nextInt();  
            
            listaClientes [i] = new Cliente(id, nombre, direccion, telefono, dineroDisponible);
        }
        System.out.println("\n-----ingrese cantidad de productos del pedido-----");
        int pdi= teclado.nextInt();
        Pedido [] listaPedidos = new Pedido[pdi];     
        for (int i=0; i<pdi ;i++){
            int subTotal = 0;
            System.out.println("\ningrese id(Alfanumerico) del producto " +(i+1));
            String id = teclado.next();
            
            System.out.println("ingrese nombre del producto "+(i+1));
            String producto = teclado.next();
            
            System.out.println("ingrese cantidad (numerico)"+(i+1));
            int cantidadPro = teclado.nextInt();
            
            subTotal = cantidadPro*1500;
            total = total+subTotal; 
            
            nroProductos = nroProductos++;
            
            listaPedidos [i] = new Pedido(id, producto, cantidadPro, total);
        }
        System.out.println("\n-----datos factura-----");
        Facturar [] listaFacturar = new Facturar[1];
        for (int i=0; i<1 ;i++){
            System.out.println("ingrese id(Alfanumerico) del factura");
            String id = teclado.next();
            
            System.out.println("ingrese fecha factura ");
            String fecha = teclado.next();
            
            int numProductos = nroProductos;
            
            listaFacturar [i] = new Facturar (id, fecha, numProductos);
            

        }System.out.println("----------visualizacion de informacion en objetos----------");
        System.out.println("\n-----informacion de empleados-----");
        for (int i=0; i<E;i++){
            System.out.println("> id empleado = "+listaEmpleados[i].getId());
            System.out.println("> nombre empleado = "+listaEmpleados[i].getNombre());
            System.out.println("> ncargo empleado = "+listaEmpleados[i].getCargo());    
        }
        System.out.println("-----informacion de provedor-----");
        for (int i=0; i<1 ;i++){
            System.out.println("> id provedor = "+listaProvedor[i].getId());
            System.out.println("> nombre empleado = "+listaProvedor[i].getNombre());
        }
        System.out.println("-----informacion de productos-----");
        for (int i=0; i<nro ;i++){
            System.out.println("> id producto = "+listaProductos[i].getId());
            System.out.println("> nombre producto = "+listaProductos[i].getNombre());
            System.out.println("> precio producto = "+listaProductos[i].getPrecio());
            System.out.println("> cantidad del prodcuto ingresado = "+listaProductos[i].getCantidad());
            System.out.println("> fecha vencimiento del producto = "+listaProductos[i].getFechaVencimiento());
        }
        System.out.println("-----informacion de cliente-----");
        for (int i=0; i<1;i++){
            System.out.println("> id cliente = "+listaClientes[i].getId());
            System.out.println("> nombre cliente = "+listaClientes[i].getNombre());
            System.out.println("> direccion cliente = "+listaClientes[i].getDireccion());
            System.out.println("> telefono cliente = "+listaClientes[i].getTelefono());
            System.out.println("> dinero disponible cliente = "+listaClientes[i].getDineroDisponible());
        }
        System.out.println("-----informacion pedido-----");
        for (int i=1; i<pdi;i++){
            System.out.println("> id pedido = "+listaPedidos[i].getId());
            System.out.println("> producto del pedido = "+listaPedidos[i].getProducto());
            System.out.println("> cantidad del pedido = "+listaPedidos[i].getCantidadPro());
            System.out.println("> total del pedido = "+listaPedidos[i].getTotal());
        }
        System.out.println("-----informacion de factura-----");
        for (int i=0; i<1;i++){
            System.out.println("> id = "+listaFacturar[i].getId());
            System.out.println("> fecha = "+listaFacturar[i].getFecha());
            System.out.println("> nro productos = "+listaFacturar[i].getNumProductos());
        }
    }
}
