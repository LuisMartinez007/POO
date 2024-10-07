package POO.Taller3;

import java.util.ArrayList;
import java.util.List;

class Jugador{
    private String nombre;

    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
}
class Equipo {
    private List<Jugador> jugadores;

    public Equipo(){
        this.jugadores = new ArrayList<>();
    }

    public Equipo(List<Jugador> jugadores){
        this.jugadores = jugadores;
    }

    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public Jugador buscarJugador(String nombre){
        return jugadores.stream().filter(jugador -> jugador.getNombre().equals(nombre)).findFirst().orElse(null);
    }

    public boolean eliminarJugador(Jugador jugador){
        return jugadores.remove(jugador);
    }

    public void eliminarTodosLosJugadores(){
        jugadores.clear();
    }
}
