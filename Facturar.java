package com.mycompany.proyecto;

public class Facturar {
    private String id;
    private String fecha;
    private int numProductos;
    private Producto[] producto;

  //constructores
    public Facturar(){}
    public Facturar(String id, String fecha, int numProductos/*, Producto[] producto*/){
    this.id = id;
    this.fecha = fecha;
    this.numProductos = numProductos;
    //this.producto = producto;
  }

  //Setters
    public void setId(String id) {
        this.id = id;
    }public void setFecha(String fecha) {
        this.fecha = fecha;
    }public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }public void setProducto(Producto[] producto) {
        this.producto = producto;
    }
    //Getters
    public String getId() {
        return id;
    }public String getFecha() {
        return fecha;
    }public int getNumProductos() {
        return numProductos;
    }public Producto[] getProducto() {
        return producto;
    }
  
    //metodos
    public void confirmarVenta(Producto[] producto){}

    public String tiket(String fecha, Producto[] producto, int numProductos){
      return "muestra la factura";
    }
    
}


