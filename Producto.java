public class Producto {
    private String id;
    private String nombre;
    private int precio;
    private int cantidad;
    private String fechaVencimiento;
    
    public Producto(){}
    public Producto(String id,String nombre,int precio,int cantidad,String fechaVencimiento){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fechaVencimiento = fechaVencimiento;
    }
    //setters
    public void setId(String id) {
        this.id = id;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }public void setPrecio(int precio) {
        this.precio = precio;
    }public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    } public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    //Getters
public String getId() {
        return id;
    }public String getNombre() {
        return nombre;
    }public int getPrecio() {
        return precio;
    }public int getCantidad() {
        return cantidad;
    }public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    
}
