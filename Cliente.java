public class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private int telefono;
    private int dineroDisponible;

    public Cliente(int id,String nombre,String direccion,int telefono,int dineroDisponible){
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dineroDisponible = dineroDisponible;
        
    }
//Setter
    public void setId(int id) {
        this.id = id;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }public void setDireccion(String direccion) {
        this.direccion = direccion;
    }public void setTelefono(int telefono) {
        this.telefono = telefono;
    }public void setDineroDisponible(int dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }
//Getters
    public int getId() {
        return id;
    }public String getNombre() {
        return nombre;
    }public String getDireccion() {
        return direccion;
    }public int getTelefono() {
        return telefono;
    }public int getDineroDisponible() {
        return dineroDisponible;
    } 
    //metodos
    public void realizarPedido(int idProducto, int cantidad){}
}
