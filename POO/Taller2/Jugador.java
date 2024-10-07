package POO.Taller2;

class Jugador {
    private String nombre;
    private Equipo equipo;

    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public void setEquipo(Equipo equipo){
        this.equipo=equipo;
    }
}

class Equipo{
    private String nombre;
    private Jugador jugador;

    public Equipo(String nombre){
        this.nombre = nombre;
    }

    public void setJugador(Jugador jugador){
        this.jugador=jugador;
    }
}
