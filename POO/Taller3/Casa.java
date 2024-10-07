package POO.Taller3;

class Puerta{
    private String material;

    public Puerta(String material){
        this.material = material;
    }

    public String getMaterial(){
        return material;
    }
}
class Casa {
    private Puerta puerta;

    public Casa(Puerta puerta){
        if(puerta == null){
            throw new IllegalArgumentException("Una casa no puede existir sin puertas");
        }
        this.puerta = puerta;
    }

    public void cambiarPuerta(Puerta nuevaPuerta){
        if(nuevaPuerta == null){
            throw new IllegalArgumentException("El procesador no puede ser nulo");
        }
        this.puerta = nuevaPuerta;
    }

    public Puerta getPuerta(){
        return this.puerta;
    }

    public void eliminarPuerta(){
        throw new UnsupportedOperationException("No se puede elimiar la puerta. La casa dejaría de ser segura");
    }
}
