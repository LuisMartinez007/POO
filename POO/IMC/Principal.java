package POO.IMC;

public class Principal {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Luis Martinez", "Masculino", "1142915424", "luis16@gmail.com");
        usuario1.mostrarInfo();

        Imc imc1 = new Imc(60, 1.71, usuario1);
        usuario1.agregarImc(imc1);

        imc1.mostrarImc();
    }
}
