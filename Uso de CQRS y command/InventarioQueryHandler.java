import java.util.ArrayList;
import java.util.Map;

public class InventarioQueryHandler {
    private Map<Integer,Producto> productos;

    public InventarioQueryHandler(Map<Integer,Producto> productos){
        this.productos = productos;
    }

    public Object handle(Query query){
        if(query instanceof GetProductosQuery){
            return productos.get(((GetProductosQuery) query).getId());
        }else if(query instanceof GetAllProductosQuery){
            return new ArrayList<>(productos.values());
        }
        return null;
    }
}
