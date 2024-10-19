public class ActualizacionCantidadCommand implements Command {
    private int id;
    private int cambioCantidad;

    public ActualizacionCantidadCommand(int id, int cambioCantidad){
        this.id = id;
        this.cambioCantidad = cambioCantidad;
    }

    public int getId(){
        return id;
    }
    public int getCambioCantidad(){
        return cambioCantidad;
    }
}
