package POO.Taller2;

class Empleado {
    private String nombre;

    public Empleado(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
}

class Proyecto {
    private String nombre;

    public Proyecto(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
}

class Asignacion {
    private Empleado empleado;
    private Proyecto proyecto;

    public Asignacion(Empleado empleado, Proyecto proyecto){
        this.empleado = empleado;
        this.proyecto = proyecto;
    }

    public void mostrarAsignacion(){
        System.out.println(empleado.getNombre() + " fue asignado a " + proyecto.getNombre());
    }
}
