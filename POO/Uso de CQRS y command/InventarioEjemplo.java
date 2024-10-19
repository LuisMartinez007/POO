import java.util.List;

public class InventarioEjemplo {
    public static void main(String[] args) {
        InventarioComandoHandler comandoHandler = new InventarioComandoHandler();
        InventarioQueryHandler queryHandler = new InventarioQueryHandler(comandoHandler.getProductos());

        comandoHandler.handle(new AddProductoCommand(1, "Laptop", 10));
        comandoHandler.handle(new AddProductoCommand(2, "Mouse", 20));
        comandoHandler.handle(new ActualizacionCantidadCommand(1, -2));

        System.out.println("Producto específico:");
        Producto producto = (Producto) queryHandler.handle(new GetProductosQuery(1));
        System.out.println("ID: " + producto.getId() + ", Nombre: " + producto.getNombre());
        System.out.println("\nTodos los productos:");
        List<Producto> allProductos = (List<Producto>) queryHandler.handle(new GetAllProductosQuery());
        for(Producto p : allProductos){
            System.out.println("ID: "+ p.getId() + ", Nombre: " + p.getNombre() + ", Cantidad: " + p.getCantidad());
        }
    }
}
