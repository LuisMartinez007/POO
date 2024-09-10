package POO.IMC;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    
    private String nombre;
    private String genero;
    private String cedula;
    private String email;
    
    protected List<Imc> listaImc;

    public Usuario(String nombre, String genero, String cedula, String email) {
        this.nombre = nombre;
        this.genero = genero;
        this.cedula = cedula;
        this.email = email;
        this.listaImc = new ArrayList<>();
    }

    public void agregarImc(Imc imc) {
        listaImc.add(imc);
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Cédula: " + cedula);
        System.out.println("Email: " + email);
    }
}