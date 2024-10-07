package POO.Taller1;

abstract class Animal {
    protected String sonido = "Sonido de animal";

    public void hacerSonido(){
        System.out.println(sonido);
    }
}
class Perro extends Animal{
    public Perro(){
        super.sonido="Guau";
    }

    @Override
    public void hacerSonido(){
        super.hacerSonido();
        System.out.println("El perro esta ladrando");
    }
}

class Gato extends Animal{
    public Gato(){
        super.sonido="Miau";
    }

    @Override
    public void hacerSonido(){
        super.hacerSonido();
        System.out.println("El gato maulla");
    }
}
