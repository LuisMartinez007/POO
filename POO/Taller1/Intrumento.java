package POO.Taller1;

abstract class Intrumento {
    public abstract void tocar();
}
interface Afinable{
    void afinar();
}

class Guitarra extends Intrumento implements Afinable{
    @Override
    public void tocar(){
        System.out.println("Tocando guitarra");
    }
    public void afinar(){
        System.out.println("Afinando guitarra");
    }
}