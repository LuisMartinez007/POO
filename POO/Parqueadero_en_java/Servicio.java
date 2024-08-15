package POO.Parqueadero_en_java;

import java.time.LocalDate;

public class Servicio {
    int id;
    LocalDate fechaEntrada;
    LocalDate fechaSalida;
    Usuario conductor;
    Vehiculo vehiculo;
    Vigilante guardiaEntrada;
    Vigilante guardiaPatio;
    Cubiculo cubiculo;
    Parking parqueadero;
    Tarifa tarifa;
}
