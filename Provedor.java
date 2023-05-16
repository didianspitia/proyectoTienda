package com.mycompany.proyecto;

public class Provedor {
    String id;
    String nombre;
    private Producto[] productoProvedor;
    
    //constructores
    public Provedor(){}
    public Provedor(String id, String nombre /*, Producto[] productoProvedor*/){
      this.id = id;
      this.nombre = nombre;
      //this.productoProvedor = productoProvedor;
    }
    //setters
    public void setId(String id) {
        this.id = id;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }public void setProductoProvedor(Producto[] productoProvedor) {
        this.productoProvedor = productoProvedor;
    }
    //Getters
    public String getId() {
        return id;
    }public String getNombre() {
        return nombre;
    }public Producto[] getProductoProvedor() {
        return productoProvedor;
    }
    //metodos
    public int deuda(){
      return 0; 
    }
}
