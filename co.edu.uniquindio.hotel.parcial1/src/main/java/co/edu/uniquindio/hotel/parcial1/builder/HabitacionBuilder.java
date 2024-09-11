package co.edu.uniquindio.hotel.parcial1.builder;

import co.edu.uniquindio.hotel.parcial1.model.Habitacion;
import co.edu.uniquindio.hotel.parcial1.model.Reserva;
import co.edu.uniquindio.hotel.parcial1.model.Servicio;

import java.time.LocalDate;

public class HabitacionBuilder {
    private int numero;
    private int precio;
    private Servicio servicio;

    public HabitacionBuilder numero(int numero) {
        this.numero = numero;
        return this;
    }

    public HabitacionBuilder precio(int precio) {
        this.precio = precio;
        return this;
    }

    public HabitacionBuilder servicio(Servicio servicio) {
        this.servicio = servicio;
        return this;
    }

    public Habitacion build() {
        return new Habitacion(numero, precio, servicio);
    }
}
