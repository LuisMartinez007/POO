import java.util.HashMap;
import java.util.Map;

public class InventarioComandoHandler {
    private Map<Integer, Producto> productos = new HashMap<>();

    public void handle(Command command){
        if(command instanceof AddProductoCommand){
            AddProductoCommand cmd = (AddProductoCommand) command;
            productos.put(cmd.getId(), new Producto(cmd.getId(), cmd.getNombre(), cmd.getCantidad()));
        } else if(command instanceof ActualizacionCantidadCommand){
            ActualizacionCantidadCommand cmd = (ActualizacionCantidadCommand) command;
            if(productos.containsKey(cmd.getId())){
                Producto producto = productos.get(cmd.getId());
                producto.setCantidad(producto.getCantidad() + cmd.getCambioCantidad());
            }
        }
    }

    public Map<Integer, Producto> getProductos(){
        return productos;
    }
}
