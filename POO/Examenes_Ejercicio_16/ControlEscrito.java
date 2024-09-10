package POO.Examenes_Ejercicio_16;

import java.sql.Date;

public class ControlEscrito{
    private int id;
    private int numero_preguntas;
    private Date fecha;

    //Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getNumero_preguntas() {
        return numero_preguntas;
    }
    public void setNumero_preguntas(int numero_preguntas) {
        this.numero_preguntas = numero_preguntas;
    }
    
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}