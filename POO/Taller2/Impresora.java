package POO.Taller2;

class Impresora {
    public void imprimir(){
        System.out.println("El documento se está imprimiendo.");
    }
}

class Documento{
    public void impresion(){
    Impresora impresora = new Impresora();
    impresora.imprimir();
    System.out.println("El documento esta impreso.");
    }
}
