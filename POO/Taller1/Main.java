package POO.Taller1;

class Vehiculo {
    public void mover() {
    System.out.println("El vehículo se mueve.");
    }
    }
    class Moto extends Vehiculo {
    @Override
    public void mover() {
    System.out.println("La moto se mueve rápidamente.");
    }
    }
    class Avion extends Vehiculo{
        @Override
        public void mover(){
            System.out.println("El avión vuela");
        }
    }
    public class Main {
    public static void main(String[] args) {
    Vehiculo v = new Moto();
    v.mover();
    
    Vehiculo avion = new Avion();
    avion.mover();
    }
    }
    
