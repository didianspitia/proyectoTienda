package com.mycompany.proyecto;
public class Tienda {
    private int id;
    private String nombre;
    //variable que quiero usar solo en esta clase
    private int numProductos = 0;

    //constructores
    public Tienda(){}
    
    public Tienda(int id, String nombre){
      this.id = id;
      this.nombre = nombre;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }
    //Getters
    public int getId() {
        return id;
    }public String getNombre() {
        return nombre;
    }public int getNumProductos() {
        return numProductos;
    }
    
    //metodos
    public Producto[] inventario(){
    Producto[] producto1 = new Producto[numProductos];
    return producto1;
    }
  
    public void realizarPedido(){}

    public int agregarProducto(Producto[] producto){
      numProductos++;
      return numProductos;
    }

    public void modificarProducto(int idProducto){}

    public void eliminarProducto(int idproducto){}

    public void pagarProducto(int idProvedor){}
  }
