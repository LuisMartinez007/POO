package POO.Taller2;

import java.util.ArrayList;
import java.util.List;

class Estudiante{
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString(){
        return "\nEstudiante: " + nombre + "\nEdad: " + edad;
    }
}

class Aula{
    private String nombreAula;
    private List<Estudiante> estudiantes;
    
    public Aula(String nombreAula){
        this.nombreAula = nombreAula;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    public void mostrarEstudiantes(){
        System.out.println("Estudiantes en el aula "+ nombreAula+ ":");
        for(Estudiante estudiante : estudiantes){
            System.out.println(estudiante);
        }
    }
}