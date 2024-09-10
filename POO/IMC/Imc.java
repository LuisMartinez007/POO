package POO.IMC;

import java.util.Date;

public class Imc {
    private double peso;
    private double altura;
    private Date fecha;
    private Usuario usuario;

    public Imc(double peso, double altura, Usuario usuario) {
        this.peso = peso;
        this.altura = altura;
        this.fecha = new Date();
        this.usuario = usuario;
    }

    public double calcularImc() {
        return peso / (altura * altura);
    }

    public void mostrarImc() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("IMC: " + calcularImc());
    }
}
