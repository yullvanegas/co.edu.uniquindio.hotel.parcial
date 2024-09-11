package co.edu.uniquindio.hotel.parcial1.builder;

import co.edu.uniquindio.hotel.parcial1.model.Cliente;
import co.edu.uniquindio.hotel.parcial1.model.Habitacion;
import co.edu.uniquindio.hotel.parcial1.model.Reserva;

import java.time.LocalDate;

public class ReservaBuilder {
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private Cliente cliente;
    private Habitacion habitacion;

    public ReservaBuilder fechaEntrada(LocalDate fechaEntrada){
        this.fechaEntrada=fechaEntrada;
        return this;
    }
    public ReservaBuilder fechaSalida(LocalDate fechaSalida){
        this.fechaSalida=fechaSalida;
        return this;
    }
    public ReservaBuilder cliente(Cliente cliente){
        this.cliente=cliente;
        return this;
    }
    public ReservaBuilder habitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
        return this;
    }
    public Reserva build(){
        return new Reserva(fechaEntrada, fechaSalida,cliente,habitacion);
    }
}
