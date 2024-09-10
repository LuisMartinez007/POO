package POO.Examenes_Ejercicio_16;

import java.sql.Date;
import java.util.List;

public class DiseñoPractica {
    private List<Profesor> autor;
    private Practica practica;
    private Date fecha;
    
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    } 
}
