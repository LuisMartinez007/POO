package POO.Taller2;

class Animal {
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


