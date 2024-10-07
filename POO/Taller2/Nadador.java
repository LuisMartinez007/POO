package POO.Taller2;

interface Nadador {
    void nadar();
}
class Delfin implements Nadador{
    @Override
    public void nadar(){
        System.out.println("El delfin está nadando");
    }
}
