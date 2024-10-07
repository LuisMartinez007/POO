package POO.Taller1;

interface Nadador {
    void nadar();
}
class Pez implements Nadador{
    @Override
    public void nadar(){
        System.out.println("El pez está nadando");
    }
}
