package POO.Taller3;

import java.util.Date;

class Persona{
    private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
}
class Evento {
    private Date fecha;

    public Evento(Date fecha){
        this.fecha = fecha;
    }

    public Date getFecha(){
        return fecha;
    }
}
class Matrimonio {
    private Evento evento;
    private Persona persona;

    public Matrimonio(Evento evento, Persona persona){
        this.evento = evento;
        this.persona = persona;
    }

    public void mostrarMatrimonio(){
        System.out.println(persona.getNombre() + " se va a casar " + evento.getFecha());
    }
}
