public class Pedido {
    private String id;
    private String producto;
    private int cantidadPro;
    private int total;

    //constructores
    public Pedido(){}
    public Pedido(String id, String producto, int cantidadPro, int total){
        this.id = id;
        this.producto = producto;
        this.cantidadPro = cantidadPro;
        this.total = total;
    }

    //Setters
    public void setId(String id) {
        this.id = id;
    }public void setProducto(String producto) {
        this.producto = producto;
    }public void setTotal(int total) {
        this.total = total;
    }public void setCantidadPro(int cantidadPro) {
        this.cantidadPro = cantidadPro;
    }

    //Getters
    public String getId() {
        return id;
    }public int getCantidadPro() {
        return cantidadPro;
    }public String getProducto() {
        return producto;
    }public int getTotal() {
        return total;
    }

    //metodos
    public void agregarProducto(int idProducto, int cantidad){}

    public void facturar(Producto[] producto){}
  }
