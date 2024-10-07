package POO.Taller2;

class Procesador {
    public void procesar(){
        System.out.println("Las tareas se estan llevando a cabo con normalidad.");
    }
}

class Computadora {
    private Procesador procesador;

    public Computadora(){
        this.procesador = new Procesador();
    }
    
    public void creacion(){
        System.out.println("Procesador creado");
        procesador.procesar();
    }

    public void destruccion(){
        System.out.println("Procesador destruido");
    }
}

