public class AddProductoCommand implements Command {
    
    private int id;
    private String nombre;
    private int cantidad;

    public AddProductoCommand(int id, String nombre, int cantidad){
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
}
