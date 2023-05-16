public class Empleado {
    private int id;
    private String nombre;
    private String cargo;
    
    //constructores
    public Empleado(int id,String name, String carg){
        this.id = id;
        this.nombre = name;
        this.cargo = carg;
    }
//setters
    public void setId(int id) {
        this.id = id;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }public void setCargo(String cargo) {
        this.cargo = cargo;
    }
//getters
    public int getId() {
        return id;
    }public String getNombre() {
        return nombre;
    }public String getCargo() {
        return cargo;
    } 
}
