package POO.Taller2;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Libro> libros = new ArrayList();

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void mostrarLibros(){
        for(Libro libro : libros){
            System.out.println(libro.getNombre());
        }
    }
}

class Libro {
    private String nombre;

    public Libro(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
}